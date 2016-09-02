package crmmain;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import crm.DELETECONTACT;
import crmdata.crmValidator;
import crmdata.crmdata;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class deletecontrol implements ActionListener {

	private DELETECONTACT  delcontact;
	private crmdata  crmdata;

        private static String Default = "select * from mycontractdb ";
	
        
	public deletecontrol(DELETECONTACT delc){

    
                try {
                
                            delcontact=delc;

                
                crmdata = new crmdata("jdbc:mysql://localhost:3306/mycontractdb","root","root",Default);
            } catch (SQLException ex) {
                Logger.getLogger(addControl.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        
        
        }


	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getSource()==delcontact.getDeletButton()){
			
                    String deletetext = delcontact.getDeleteField().getText();

                    if(!crmValidator.isValid(deletetext)){
                         JOptionPane.showMessageDialog(null," name must not be empty or less than 0");
                    }
                    else{
                    try{
    

                 
                    
                  int  result=  JOptionPane.showConfirmDialog(null, String.format(" Do you want to delete  %s For Database", delcontact.getDeleteField().getText()));
                    switch(result){
                        
                        case JOptionPane.OK_OPTION:
                             deletedata(deletetext);
                             break;
                        case JOptionPane.CANCEL_OPTION:
                            break;
                        case JOptionPane.CLOSED_OPTION:
                            break;
                            
                            
                    }
                    

}
catch(SQLException es)
{
    
    JOptionPane.showMessageDialog(null, String.format(" An SQL Error occur"));

}
    
    		}
                }
                Reset();
                }
	
	
        private void deletedata(String deletetext) throws SQLException{
               int r=crmdata.deleteContact(deletetext);
                     if(r==1)
                         JOptionPane.showMessageDialog(null,"Contact Deleted");
                     else
                         JOptionPane.showMessageDialog(null,"Contact  not Deleted");
                         
           
        
        }
     
        public void Reset(){
            delcontact.getDeleteField().setText("");
        }
	
}
