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
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UpdateQuestion extends JFrame {

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
					UpdateQuestion frame = new UpdateQuestion();
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
	public UpdateQuestion() {
		setAlwaysOnTop(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1371, 576);
		contentPane = new JPanel();
		contentPane.setLocation(new Point(150, 150));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(UpdateQuestion.class.getResource("/default_package/Update Question.png")));
		lblNewLabel.setBounds(10, 0, 70, 67);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Update Question");
		lblNewLabel_1.setFont(new Font("Algerian", Font.BOLD, 30));
		lblNewLabel_1.setBounds(80, 9, 315, 58);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//user want to quit then set the visible false
				AdminHome.open = 0;
				setVisible(false);
			}
		});
		lblNewLabel_2.setIcon(new ImageIcon(UpdateQuestion.class.getResource("/default_package/Close.png")));
		lblNewLabel_2.setBounds(1213, 0, 60, 72);
		contentPane.add(lblNewLabel_2);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 78, 1283, 2);
		contentPane.add(separator);
		
		JLabel lblNewLabel_3 = new JLabel("Question ID");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3.setBounds(102, 120, 124, 28);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("Question : ");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3_1.setBounds(102, 164, 124, 28);
		contentPane.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("Option 1: ");
		lblNewLabel_3_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3_2.setBounds(102, 216, 124, 28);
		contentPane.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_3 = new JLabel("Option 2: ");
		lblNewLabel_3_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3_3.setBounds(102, 271, 124, 28);
		contentPane.add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_3_4 = new JLabel("Option 3: ");
		lblNewLabel_3_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3_4.setBounds(102, 320, 124, 28);
		contentPane.add(lblNewLabel_3_4);
		
		JLabel lblNewLabel_3_5 = new JLabel("Option 4:");
		lblNewLabel_3_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3_5.setBounds(102, 372, 124, 28);
		contentPane.add(lblNewLabel_3_5);
		
		JLabel lblNewLabel_3_6 = new JLabel("Answer :");
		lblNewLabel_3_6.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3_6.setBounds(102, 424, 124, 28);
		contentPane.add(lblNewLabel_3_6);
		
		JButton btnNewButton = new JButton("Search");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = textField_6.getText();
				try {
					Connection con = ConnectionProvider.getCon();
					Statement st = con.createStatement();
					//why result set bcz to store the result from the database
					ResultSet rs = st.executeQuery("select * from question where id='"+id+"'");
					if(rs.first()) {
						//get the result form d and set the values in textfield 
						textField.setText(rs.getString(2));
						textField_1.setText(rs.getString(3));
						textField_2.setText(rs.getString(4));
						textField_3.setText(rs.getString(5));
						textField_4.setText(rs.getString(6));
						textField_5.setText(rs.getString(7));
						//also disable the text of search field
						textField_6.setEditable(false);
					} else {
						//if there is no value is result then show error
						JFrame jf = new JFrame();
						jf.setAlwaysOnTop(true);
						JOptionPane.showMessageDialog(jf, "Question id doesn't exist !!!");
					}
				} catch(Exception e1) {
					JFrame jf = new JFrame();
					jf.setAlwaysOnTop(true);
					JOptionPane.showMessageDialog(jf, "Question id doesn't exist !!!");
				}
			}
		});
		btnNewButton.setIcon(new ImageIcon(UpdateQuestion.class.getResource("/default_package/search.png")));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(440, 118, 151, 33);
		contentPane.add(btnNewButton);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField.setBounds(254, 164, 913, 28);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_1.setColumns(10);
		textField_1.setBounds(254, 216, 913, 28);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_2.setColumns(10);
		textField_2.setBounds(254, 271, 913, 28);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_3.setColumns(10);
		textField_3.setBounds(256, 320, 911, 28);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_4.setColumns(10);
		textField_4.setBounds(254, 372, 913, 28);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_5.setColumns(10);
		textField_5.setBounds(254, 424, 913, 28);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_6.setColumns(10);
		textField_6.setBounds(254, 120, 169, 28);
		contentPane.add(textField_6);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = textField_6.getText();
				String name = textField.getText();
				String opt1 = textField_1.getText();
				String opt2 = textField_2.getText();
				String opt3 = textField_3.getText();
				String opt4 = textField_4.getText();
				String answer = textField_5.getText();
				try {
					Connection con = ConnectionProvider.getCon();
					//query for updating the question
					PreparedStatement ps = con.prepareStatement("update question set name=?, opt1=?, opt2=?, opt3=?, opt4=?, answer=? where id=?");
					//set the data 
					ps.setString(1, name);
					ps.setString(2, opt1);
					ps.setString(3, opt2);
					ps.setString(4, opt3);
					ps.setString(5, opt4);
					ps.setString(6, answer);
					ps.setString(7, id);
					
					//execute the query
					ps.executeUpdate();
					JFrame jf = new JFrame();
					jf.setAlwaysOnTop(true);
					JOptionPane.showMessageDialog(jf, "Successfully Updated.");
					setVisible(false);
					new UpdateQuestion().setVisible(true);
					
				} catch(Exception e1) {
					e1.printStackTrace();
					JFrame jf = new JFrame();
					jf.setAlwaysOnTop(true);
					JOptionPane.showMessageDialog(jf, e1);
				}
			}
		});
		btnUpdate.setIcon(new ImageIcon(UpdateQuestion.class.getResource("/default_package/save.png")));
		btnUpdate.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnUpdate.setBounds(254, 478, 151, 33);
		contentPane.add(btnUpdate);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textField_4.setText("");
				textField_5.setText("");
				textField_6.setText("");
				textField.setEditable(true);
			}
		});
		btnClear.setIcon(new ImageIcon(UpdateQuestion.class.getResource("/default_package/clear.png")));
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnClear.setBounds(486, 478, 151, 33);
		contentPane.add(btnClear);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon(UpdateQuestion.class.getResource("/default_package/pages background student.jpg")));
		lblNewLabel_4.setBounds(0, 0, 1335, 549);
		contentPane.add(lblNewLabel_4);
	}
}
