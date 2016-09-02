package crm;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;

public class HELP extends JPanel {

	/**
	 * Create the panel.
	 */
	public HELP() {
    setBorder(BorderFactory.createLoweredBevelBorder());    
    setLayout(null);
    
    JLabel lblContactManagementSystem = new JLabel("CONTACT MANAGEMENT SYSTEM HELP");
    lblContactManagementSystem.setFont(new Font("Tahoma", Font.BOLD, 15));
    lblContactManagementSystem.setBounds(86, 32, 354, 55);
    add(lblContactManagementSystem);
	}

}
