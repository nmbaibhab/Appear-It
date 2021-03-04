package default_package;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import source_packages.ConnectionProvider;

import java.awt.Point;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class DeleteQuestion extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeleteQuestion frame = new DeleteQuestion();
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
	public DeleteQuestion() {
		setLocation(new Point(150, 150));
		setAlwaysOnTop(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1062, 535);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(DeleteQuestion.class.getResource("/default_package/delete Question.png")));
		lblNewLabel.setBounds(0, 11, 60, 54);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Delete Question");
		lblNewLabel_1.setFont(new Font("Algerian", Font.BOLD, 40));
		lblNewLabel_1.setBounds(64, 11, 371, 54);
		contentPane.add(lblNewLabel_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 76, 1033, 2);
		contentPane.add(separator);
		
		JLabel lblNewLabel_3 = new JLabel("Question ID");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3.setBounds(99, 113, 132, 25);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_2_1 = new JLabel("Questions:");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2_1.setBounds(99, 149, 121, 33);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Option 1:");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2_2.setBounds(99, 193, 121, 33);
		contentPane.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("Option 2:");
		lblNewLabel_2_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2_3.setBounds(99, 237, 121, 33);
		contentPane.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_3_1 = new JLabel("Option 3:");
		lblNewLabel_2_3_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2_3_1.setBounds(99, 281, 121, 33);
		contentPane.add(lblNewLabel_2_3_1);
		
		JLabel lblNewLabel_2_3_2 = new JLabel("Option 4:");
		lblNewLabel_2_3_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2_3_2.setBounds(99, 325, 121, 33);
		contentPane.add(lblNewLabel_2_3_2);
		
		JLabel lblNewLabel_2_3_3 = new JLabel("Answer :");
		lblNewLabel_2_3_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2_3_3.setBounds(99, 369, 121, 33);
		contentPane.add(lblNewLabel_2_3_3);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField.setColumns(10);
		textField.setBounds(230, 150, 715, 30);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_1.setColumns(10);
		textField_1.setBounds(230, 194, 715, 30);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_2.setColumns(10);
		textField_2.setBounds(230, 238, 715, 30);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_3.setColumns(10);
		textField_3.setBounds(230, 284, 715, 30);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_4.setColumns(10);
		textField_4.setBounds(230, 326, 715, 30);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_5.setColumns(10);
		textField_5.setBounds(230, 370, 715, 30);
		contentPane.add(textField_5);
		
		JButton btnNewButton = new JButton("Search");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = textField_6.getText();
				try {
					Connection con = ConnectionProvider.getCon();
					Statement st = con.createStatement();
					ResultSet rs = st.executeQuery("select * from question where id='"+id+"'");
					
					if(rs.first()) {
						textField.setText(rs.getString(2));
						textField_1.setText(rs.getString(3));
						textField_2.setText(rs.getString(4));
						textField_3.setText(rs.getString(5));
						textField_4.setText(rs.getString(6));
						textField_5.setText(rs.getString(7));
						textField_6.setEditable(false);
					}else {
						JFrame jf = new JFrame();
						jf.setAlwaysOnTop(true);
						JOptionPane.showMessageDialog(jf, "Question doesn't exist");
					}
				} catch(Exception e1) {
					JFrame jf = new JFrame();
					jf.setAlwaysOnTop(true);
					JOptionPane.showMessageDialog(jf, e1);
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setIcon(new ImageIcon(DeleteQuestion.class.getResource("/default_package/search.png")));
		btnNewButton.setBounds(317, 111, 132, 28);
		contentPane.add(btnNewButton);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_6.setColumns(10);
		textField_6.setBounds(230, 113, 77, 25);
		contentPane.add(textField_6);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = textField_6.getText();
				try {
					Connection con = ConnectionProvider.getCon();
					PreparedStatement ps = con.prepareStatement("delete from question where id=?");
					//set the id to sql query
					ps.setString(1, id);
					//execute the query
					ps.executeUpdate();
					//show the message
					JFrame jf = new JFrame();
					jf.setAlwaysOnTop(true);
					JOptionPane.showMessageDialog(jf, "Successfully Deleted...");
					setVisible(false);
					new DeleteQuestion().setVisible(true);
				}catch(Exception e2) {
					JFrame jf = new JFrame();
					jf.setAlwaysOnTop(true);
					JOptionPane.showMessageDialog(jf, e2);
				}
			}
		});
		btnDelete.setIcon(new ImageIcon(DeleteQuestion.class.getResource("/default_package/delete.png")));
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnDelete.setBounds(230, 429, 132, 28);
		contentPane.add(btnDelete);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textField_4.setText("");
				textField_5.setText("");
				textField_6.setEditable(true);
			}
		});
		btnClear.setIcon(new ImageIcon(DeleteQuestion.class.getResource("/default_package/clear.png")));
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnClear.setBounds(395, 429, 132, 28);
		contentPane.add(btnClear);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminHome.open = 0;
				setVisible(false);
			}
		});
		btnNewButton_1.setIcon(new ImageIcon(DeleteQuestion.class.getResource("/default_package/Close.png")));
		btnNewButton_1.setBounds(954, 11, 89, 67);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(DeleteQuestion.class.getResource("/default_package/pages background student.jpg")));
		lblNewLabel_2.setBounds(0, 0, 1048, 498);
		contentPane.add(lblNewLabel_2);
	}
}
