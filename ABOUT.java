package crm;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;

public class ABOUT extends JPanel {

	/**
	 * Create the panel.
	 */
	public ABOUT() {
    setBorder(BorderFactory.createLoweredBevelBorder());
    
    JLabel label = new JLabel("");
    label.setIcon(new ImageIcon("D:\\jproject\\CMS\\crm\\envelopeabout.png"));
    
    JLabel lblContactManagementSystem = new JLabel("CONTACT MANAGEMENT SYSTEM VERSION 1.0");
    lblContactManagementSystem.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
    
    JPanel panel = new JPanel();
    
    JLabel lblNewLabel = new JLabel("copyright  Usoft @2016");
    lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
    GroupLayout groupLayout = new GroupLayout(this);
    groupLayout.setHorizontalGroup(
    	groupLayout.createParallelGroup(Alignment.TRAILING)
    		.addGroup(groupLayout.createSequentialGroup()
    			.addContainerGap()
    			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
    				.addGroup(groupLayout.createSequentialGroup()
    					.addComponent(label, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE)
    					.addPreferredGap(ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
    					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
    						.addGroup(groupLayout.createSequentialGroup()
    							.addComponent(lblContactManagementSystem)
    							.addGap(50))
    						.addGroup(groupLayout.createSequentialGroup()
    							.addComponent(panel, GroupLayout.PREFERRED_SIZE, 365, GroupLayout.PREFERRED_SIZE)
    							.addContainerGap())))
    				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
    					.addComponent(lblNewLabel)
    					.addGap(158))))
    );
    groupLayout.setVerticalGroup(
    	groupLayout.createParallelGroup(Alignment.LEADING)
    		.addGroup(groupLayout.createSequentialGroup()
    			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
    				.addGroup(groupLayout.createSequentialGroup()
    					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
    						.addGroup(groupLayout.createSequentialGroup()
    							.addGap(28)
    							.addComponent(lblContactManagementSystem))
    						.addGroup(groupLayout.createSequentialGroup()
    							.addContainerGap()
    							.addComponent(label, GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE)))
    					.addGap(60))
    				.addGroup(groupLayout.createSequentialGroup()
    					.addContainerGap(83, Short.MAX_VALUE)
    					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 159, GroupLayout.PREFERRED_SIZE)
    					.addPreferredGap(ComponentPlacement.RELATED)))
    			.addPreferredGap(ComponentPlacement.RELATED)
    			.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
    			.addContainerGap(43, Short.MAX_VALUE))
    );
    panel.setLayout(null);
    
    JLabel lblManagerAllYour = new JLabel("Manager all your Contact With easy");
    lblManagerAllYour.setBounds(29, 11, 225, 14);
    panel.add(lblManagerAllYour);
    
    JLabel lblNewLabel_1 = new JLabel("with Contact Manager System you have all ");
    lblNewLabel_1.setBounds(17, 36, 245, 14);
    panel.add(lblNewLabel_1);
    
    JLabel lblItTakeTo = new JLabel("it take to get intouch with your friends \r\n\r\n");
    lblItTakeTo.setBounds(29, 61, 225, 14);
    panel.add(lblItTakeTo);
    
    JLabel lblHh = new JLabel("\r\ncontact management system will back them up for you \r\n\r\n");
    lblHh.setBounds(17, 96, 338, 14);
    panel.add(lblHh);
    lblHh.setVerticalAlignment(SwingConstants.TOP);
    
    JLabel lblEvenWhenYou = new JLabel("even when you lose contact of them \r\n");
    lblEvenWhenYou.setBounds(27, 83, 297, 14);
    panel.add(lblEvenWhenYou);
    setLayout(groupLayout);
	}
}
