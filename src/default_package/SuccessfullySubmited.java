package default_package;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SuccessfullySubmited extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SuccessfullySubmited frame = new SuccessfullySubmited("");
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
	public SuccessfullySubmited(String marks) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1297, 745);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				try {
					Index window = new Index();
					window.frame.setVisible(true);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setIcon(new ImageIcon(SuccessfullySubmited.class.getResource("/default_package/Close.png")));
		btnNewButton.setBounds(1195, 11, 78, 69);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Marks Obtained : 10");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 52));
		lblNewLabel.setBounds(325, 238, 519, 85);
		contentPane.add(lblNewLabel);
		
		JLabel lblSuccessfullyUpdated = new JLabel("Successfully Updated");
		lblSuccessfullyUpdated.setForeground(Color.DARK_GRAY);
		lblSuccessfullyUpdated.setFont(new Font("Tahoma", Font.BOLD, 52));
		lblSuccessfullyUpdated.setBounds(325, 349, 555, 85);
		contentPane.add(lblSuccessfullyUpdated);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(SuccessfullySubmited.class.getResource("/default_package/pages background student.jpg")));
		lblNewLabel_2.setBounds(0, 0, 1283, 700);
		contentPane.add(lblNewLabel_2);
		
		
		
		String marks1 = "Marks Obtaines : "+marks;
		lblNewLabel.setText(marks1);
		
	}

}
