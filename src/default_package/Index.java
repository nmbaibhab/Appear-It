package default_package;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Dialog.ModalExclusionType;

public class Index {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Index window = new Index();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Index() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1297, 650);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Student");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//set the visible false and move to the student page
				Index window = new Index();
				window.frame.setVisible(true);
				
				//set the visible of student page true
				new StudentDetails().setVisible(true);
			}
		});
		btnNewButton.setBounds(542, 34, 184, 69);
		btnNewButton.setIcon(new ImageIcon(Index.class.getResource("/default_package/index student.png")));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		frame.getContentPane().add(btnNewButton);
		
		JButton btnAdmin = new JButton("Admin");
		btnAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//if user want to go to the admin page then set the visibility false and show the admin home page
				try {
					Index window = new Index();
					window.frame.setVisible(true);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				//set the admin home page visibility true
				try {
					LoginAdmins frame = new LoginAdmins();
					frame.setVisible(true);
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		});
		btnAdmin.setBounds(797, 34, 184, 69);
		btnAdmin.setIcon(new ImageIcon(Index.class.getResource("/default_package/index admin.png")));
		btnAdmin.setFont(new Font("Tahoma", Font.BOLD, 20));
		frame.getContentPane().add(btnAdmin);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//showing the exit panel to user and asking for exit. 
				int a = JOptionPane.showConfirmDialog(null, "Do You Really want to Exit.", "Select", JOptionPane.YES_NO_OPTION);
				//if user click yes then a value = 0
				if(a == 0) {
					System.exit(0);
				}
			}
		});
		btnExit.setBounds(1065, 34, 184, 69);
		btnExit.setIcon(new ImageIcon(Index.class.getResource("/default_package/Close.png")));
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 20));
		frame.getContentPane().add(btnExit);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Index.class.getResource("/default_package/index background.png")));
		lblNewLabel.setBounds(0, 0, 1283, 613);
		frame.getContentPane().add(lblNewLabel);
		
		
	}
}
