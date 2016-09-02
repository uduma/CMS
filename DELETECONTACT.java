package crm;

import java.awt.BorderLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import crmmain.deletecontrol;

public class DELETECONTACT extends JPanel {

	/**
	 * Create the panel.
	 */
	
	private JPanel    top;
	private JPanel   center;
	private JTextField   dfield;
	private JButton   deletebutton;
	private JLabel    dlabel ;
	
	public DELETECONTACT() {

		init();
		setBorder(BorderFactory.createLoweredBevelBorder());
	setLayout(new BorderLayout());	
	showGUI();
	}

	
	private void init(){
		
		top = new JPanel();
		center = new JPanel();
		dfield = new JTextField(30);
		deletebutton = new JButton("Delete ");
		dlabel = new JLabel("Enter First Name");
	    deletecontrol  dcontrol = new deletecontrol(this);
	    deletebutton.addActionListener(dcontrol);
		 
	}
	
	
	public JTextField getDeleteField(){
		return dfield;
	}
	
	public JButton getDeletButton(){
		return deletebutton;
	}
	
	private void  showGUI(){
		top.setBorder(BorderFactory.createTitledBorder("Delete Contact"));
		top.add(dlabel);
		top.add(dfield);
		add(top,BorderLayout.NORTH);
		center.add(deletebutton);
		add(center,BorderLayout.CENTER);
		
	}
	
	
}
