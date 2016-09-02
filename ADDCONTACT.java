package crm;

import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;

import crmmain.addControl;

import java.awt.BorderLayout;
import java.awt.Color;

public class ADDCONTACT extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
    private JPanel  top;
	private JPanel buttonPanel;
	private JLabel lblFirstName;
	private JLabel lblLastName;
	private JLabel lblPhoneNumber;
	private JLabel lblEmail;
	private JLabel lblSex;
	private JButton btnSave;
	
	/**
	 * Create the panel.
	 */
	public ADDCONTACT() {
		setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		top = new JPanel();
		top.setLayout(new GridLayout(5,1));
		
		 lblFirstName = new JLabel("First name");
		lblLastName = new JLabel("Last name");
		 lblPhoneNumber = new JLabel("Phone number");
		
		lblEmail = new JLabel("Email");
		 lblSex = new JLabel("Sex");
		 btnSave = new JButton("Save");
	    	
		 addControl  acontrol = new addControl(this);
		 btnSave.addActionListener(acontrol);
		textField = new JTextField();
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		
		top.setBorder(BorderFactory.createTitledBorder("Contact Information"));
		top.add(lblFirstName);
		top.add(textField);
	
		top.add(lblLastName);
		top.add(textField_1);
		
		top.add(lblPhoneNumber);
		top.add(textField_2);
	
		top.add(lblEmail);
		top.add(textField_3);
		
		top.add(lblSex);
		top.add(textField_4);
		
		 buttonPanel = new JPanel();
		buttonPanel.add(btnSave);
	
		
		
		setLayout(new BorderLayout());
		add(top,BorderLayout.CENTER);
		add(buttonPanel,BorderLayout.SOUTH);
		//setLayout(new GroupLayout(this));

	}
	
	public JTextField getFirstName(){
		return textField;
		
	}
	
	public JTextField getLastName(){
		return textField_1;
	}
	
	public JTextField getPhoneNumber(){
		return textField_2;
	}
	public JTextField getEmail(){
		return textField_3;
	}
	
	public JTextField getSex(){
		return textField_4;
	}
	
	public JButton getSaveButton(){
		return btnSave;
	}
}
