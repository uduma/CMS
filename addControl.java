package crmmain;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import crm.ADDCONTACT;
import crmdata.crmValidator;
import crmdata.crmdata;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class addControl  implements ActionListener{

	private ADDCONTACT addcontact ;
        private crmdata crmdata;
        private static String Default = "select * from mycontractdb ";
	
        
        public addControl(ADDCONTACT addcon){
        
            
            try {
                addcontact=addcon;
                
                
                
                crmdata = new crmdata("jdbc:mysql://localhost:3306/mycontractdb","root","root",Default);
            } catch (SQLException ex) {
                Logger.getLogger(addControl.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
	
	
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
	
		  if(arg0.getSource()==addcontact.getSaveButton()){
	      
     
                     String firstname =addcontact.getFirstName().getText();
                     String lastname = addcontact.getLastName().getText();
                     String phone  = addcontact.getPhoneNumber().getText();
                     String email = addcontact.getEmail().getText();
                     String sex =  addcontact.getSex().getText();

                     if(!crmValidator.isValid(firstname)){
                        JOptionPane.showMessageDialog(null,"First name must not be empty or less than 0");         
                         
                     }
                     else if(!crmValidator.isValid(lastname)){
                        JOptionPane.showMessageDialog(null,"last name must not be empty or less than 0");  
                     }
                     else if(!crmValidator.isValid(phone)){
                          JOptionPane.showMessageDialog(null,"phone number must not be empty or less than 0");
                     }
                     else if(!crmValidator.isValid(email)){
                          JOptionPane.showMessageDialog(null,"Email must not be empty or less than 0");
                     }
                     else if(!crmValidator.isValid(sex)){
                          JOptionPane.showMessageDialog(null,"Sex must not be empty or less than 0");
                     }
                     
                     else{
                     
                     
                      try {
                          int result = crmdata.addContact(firstname, lastname,phone, email, sex);
                         if(result==1){
                        JOptionPane.showMessageDialog(null,"Contact save sucessfully");         
                         }
                         else {
                             JOptionPane.showMessageDialog(null,"Error ","Contact not Save",JOptionPane.ERROR);
                         }
                      
                      
                      } catch (SQLException ex) {
                          Logger.getLogger(addControl.class.getName()).log(Level.SEVERE, null, ex);
                      }
                     }
                    ResetForm();
		}
	}

	
        public void ResetForm(){
            addcontact.getFirstName().setText("");
            addcontact.getLastName().setText("");
            addcontact.getPhoneNumber().setText("");
            addcontact.getEmail().setText("");
            addcontact.getSex().setText("");
            
            
        }
        
        
        
	 
}
