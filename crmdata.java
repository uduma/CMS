/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crmdata;

import javax.swing.table.AbstractTableModel;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSetMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
//import javax.swing.table.AbstractTableModel;




/**
 *
 * @author JAVA2
 */
public class crmdata  extends AbstractTableModel{





    private Connection connection;
    private Statement statement;
    private PreparedStatement insertNewPerson = null, deleteperson = null, update;
    private ResultSet resultset;
    private ResultSetMetaData metadata;
    private int numberOfRows;
    private boolean connectedToDatabase = false;

    public crmdata(String url, String username, String password, String query) throws SQLException {

        connection = DriverManager.getConnection(url, username, password);
        statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        connectedToDatabase = true;
        setQuery(query);



    }

    @Override
    public Class getColumnClass(int column) {
        if (!connectedToDatabase) {
            throw new IllegalStateException("Not connected to Database");
        }

        try {
            String classname = metadata.getColumnClassName(column + 1);
            return Class.forName(classname);
        } catch (Exception exception) {
            exception.printStackTrace();
        }

        return Object.class;
    }

    @Override
    public int getRowCount() {
        if (!connectedToDatabase) {
            throw new IllegalStateException("Not connected to DataBase");
        }
        return numberOfRows;
    }

    @Override
    public int getColumnCount() throws IllegalStateException {

        if (!connectedToDatabase) {
            throw new IllegalStateException("Not Connected to Database");
        }
        try {
            return metadata.getColumnCount();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public String getColumnName(int column) throws IllegalStateException {


        if (!connectedToDatabase) {
            throw new IllegalStateException("Not Connected to Database");
        }
        try {
            return metadata.getColumnName(column + 1);
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
        return "";


    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) throws IllegalStateException {
        if (!connectedToDatabase) {
            throw new IllegalStateException("Not connected to database");
        }
        try {
            resultset.absolute(rowIndex + 1);
            return resultset.getObject(columnIndex + 1);
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
        return "";
    }

    public void setQuery(String query) throws SQLException, IllegalStateException {
        if (!connectedToDatabase) {
            throw new IllegalStateException("Not connected to database");
        }

        resultset = statement.executeQuery(query);
        metadata = resultset.getMetaData();
        resultset.last();
        numberOfRows = resultset.getRow();
        fireTableStructureChanged();


    }

    public void disConnectFromDataBase() {

        if (connectedToDatabase) {

            try {
                resultset.close();
                statement.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                connectedToDatabase = false;
            }

        }


    }

    public int addContact(String f, String l, String ph, String em, String sex) throws SQLException {

        int result = 0;
        if (!connectedToDatabase) {
            throw new IllegalStateException("Not connected to database");
        }
        fireTableStructureChanged();

        String set = "insert into mycontractdb " + ""
                + "(Firstname,Lastname,Phonenumber,Email,sex)"
                + "values(?,?,?,?,?)";




        insertNewPerson = connection.prepareStatement(set);

        insertNewPerson.setString(1, f);
        insertNewPerson.setString(2, l);
        insertNewPerson.setString(3, ph);
        insertNewPerson.setString(4, em);
        insertNewPerson.setString(5, sex);
        result = insertNewPerson.executeUpdate();



        //statement.execute(s);


        return result;

    }

    public int deleteContact(String f) throws SQLException {

        int result = 0;
        if (!connectedToDatabase) {
            throw new IllegalStateException("Not connected to database");
        }
        fireTableStructureChanged();

        String set = "DELETE  FROM mycontractdb  where  Firstname   =  ?";




        deleteperson = connection.prepareStatement(set);
        
        deleteperson.setString(1, f);

        result = deleteperson.executeUpdate();

        

        //statement.execute(s);


        return result;

    }



    
}
