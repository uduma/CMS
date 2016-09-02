package crm;

import crmdata.crmdata;
import java.awt.BorderLayout;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class VIEWCONTACT extends JPanel {

	JTable table;
	JScrollPane pane;
        crmdata  crmdata;
        private static String Default = "select * from mycontractdb ";
    
        /**
	 * Create the panel.
	 */
	public VIEWCONTACT() {
            try {
                crmdata = new crmdata("jdbc:mysql://localhost:3306/mycontractdb","root","root",Default);
                table = new JTable(crmdata);
                pane = new JScrollPane(table);
                setLayout(new BorderLayout());
                add(pane,BorderLayout.CENTER);
            } catch (SQLException ex) {
                Logger.getLogger(VIEWCONTACT.class.getName()).log(Level.SEVERE, null, ex);
            }
	}

	
	
}
