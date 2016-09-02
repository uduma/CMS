package crm;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLayeredPane;
import javax.swing.JTabbedPane;
import java.awt.Toolkit;

public class CRS extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CRS frame = new CRS();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CRS() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\jproject\\CMS\\crm\\envelope.png"));
		setResizable(false);
		setTitle("CONTACT MANAGEMENT SYSTEM");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 564, 502);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(1,1));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
	//	tabbedPane.setBounds(0, 0, 501, 281);
		ADDCONTACT  addcontact = new ADDCONTACT();
		tabbedPane.addTab("Add Contact",null,addcontact);
		tabbedPane.setToolTipTextAt(0, "Add Contact To Your Contact Management System");
	   VIEWCONTACT viewcontact = new VIEWCONTACT();
		tabbedPane.addTab("View Contact",viewcontact);
		tabbedPane.setToolTipTextAt(1, "View All Your Contact ");
		DELETECONTACT  deletecontact = new DELETECONTACT();
		tabbedPane.addTab("Delete Contact",deletecontact);
		tabbedPane.setToolTipTextAt(2, "Delete Your Contact");
		ABOUT  about = new ABOUT();
		tabbedPane.addTab("About",about);
		tabbedPane.setToolTipTextAt(3, "About Contact Management System");
		HELP  help = new HELP();
		tabbedPane.addTab("Help",help);
		tabbedPane.setToolTipTextAt(4, "How to Use Contact Management System");
		
		
		contentPane.add(tabbedPane);
	}
}
