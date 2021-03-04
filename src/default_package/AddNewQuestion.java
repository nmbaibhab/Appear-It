package default_package;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.sql.PreparedStatement;
//import com.mysql.jdbc.PreparedStatement;

import source_packages.ConnectionProvider;

import java.awt.Component;
import java.awt.Point;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class AddNewQuestion extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddNewQuestion frame = new AddNewQuestion();
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
	public AddNewQuestion() {
		setAlwaysOnTop(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1297, 635);
		contentPane = new JPanel();
		contentPane.setLocation(new Point(150, 183));
		contentPane.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		contentPane.setAlignmentX(Component.RIGHT_ALIGNMENT);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(AddNewQuestion.class.getResource("/default_package/add new question.png")));
		lblNewLabel.setBounds(0, 0, 72, 69);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Add New Question");
		lblNewLabel_1.setFont(new Font("Algerian", Font.BOLD, 40));
		lblNewLabel_1.setBounds(82, 11, 411, 58);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminHome.open = 0;
				setVisible(false);
			}
		});
		btnNewButton.setIcon(new ImageIcon(AddNewQuestion.class.getResource("/default_package/Close.png")));
		btnNewButton.setBounds(1190, 0, 93, 67);
		contentPane.add(btnNewButton);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(537, 113, 649, -7);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(0, 80, 1297, 8);
		contentPane.add(separator_1);
		
		JLabel lblNewLabel_2 = new JLabel("Question ID");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2.setBounds(163, 113, 121, 39);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("00");
		lblNewLabel_3.setForeground(Color.RED);
		lblNewLabel_3.setBackground(Color.RED);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(294, 118, 49, 25);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_2_1 = new JLabel("Questions:");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2_1.setBounds(163, 173, 121, 33);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Option 1:");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2_2.setBounds(163, 231, 121, 33);
		contentPane.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("Option 2:");
		lblNewLabel_2_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2_3.setBounds(163, 287, 121, 33);
		contentPane.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_3_1 = new JLabel("Option 3:");
		lblNewLabel_2_3_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2_3_1.setBounds(163, 346, 121, 33);
		contentPane.add(lblNewLabel_2_3_1);
		
		JLabel lblNewLabel_2_3_2 = new JLabel("Option 4:");
		lblNewLabel_2_3_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2_3_2.setBounds(163, 407, 121, 33);
		contentPane.add(lblNewLabel_2_3_2);
		
		JLabel lblNewLabel_2_3_3 = new JLabel("Answer :");
		lblNewLabel_2_3_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2_3_3.setBounds(163, 464, 121, 33);
		contentPane.add(lblNewLabel_2_3_3);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField.setBounds(294, 178, 844, 30);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_1.setColumns(10);
		textField_1.setBounds(294, 236, 844, 30);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_2.setColumns(10);
		textField_2.setBounds(294, 292, 844, 30);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_3.setColumns(10);
		textField_3.setBounds(294, 346, 844, 30);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_4.setColumns(10);
		textField_4.setBounds(294, 410, 844, 30);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_5.setColumns(10);
		textField_5.setBounds(294, 464, 844, 30);
		contentPane.add(textField_5);
		
		JButton btnNewButton_1 = new JButton("Save");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = lblNewLabel_3.getText();
				String name = textField.getText();
				String opt1 = textField_1.getText();
				String opt2 = textField_2.getText();
				String opt3 = textField_3.getText();
				String opt4 = textField_4.getText();
				String answer = textField_5.getText();
				try {
					//get the connection
					Connection con = ConnectionProvider.getCon();
					//set a query and its a dynamic query
					PreparedStatement ps = con.prepareStatement("insert into question values(?,?,?,?,?,?,?)");
					//set the input data to the query
					ps.setString(1, id);
					ps.setString(2, name);
					ps.setString(3, opt1);
					ps.setString(4, opt2);
					ps.setString(5, opt3);
					ps.setString(6, opt4);
					ps.setString(7, answer);
					//execute the query
					ps.executeUpdate();
					//create an obj of jframe
					JFrame jf = new JFrame();
					jf.setAlwaysOnTop(true);
					//set the message
					JOptionPane.showMessageDialog(jf, "Successfully Updated");
					//remove the old values
					setVisible(false);
					//show the blank form again
					new AddNewQuestion().setVisible(true);
				} catch(Exception e1) {
					//show the error
					JFrame jf = new JFrame();
					jf.setAlwaysOnTop(true);
					JOptionPane.showMessageDialog(jf, e1);
				}
			}
		});
		btnNewButton_1.setIcon(new ImageIcon(AddNewQuestion.class.getResource("/default_package/save.png")));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1.setBounds(294, 538, 115, 33);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Clear");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//when user click clear then clear then input values
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textField_4.setText("");
				textField_5.setText("");
			}
		});
		btnNewButton_1_1.setIcon(new ImageIcon(AddNewQuestion.class.getResource("/default_package/clear.png")));
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1_1.setBounds(470, 538, 115, 33);
		contentPane.add(btnNewButton_1_1);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_4.setBackground(Color.RED);
		lblNewLabel_4.setIcon(new ImageIcon(AddNewQuestion.class.getResource("/default_package/pages background student.jpg")));
		lblNewLabel_4.setBounds(0, 0, 1283, 598);
		contentPane.add(lblNewLabel_4);
		
		try {
			//get the connection 
			Connection con = ConnectionProvider.getCon();
			//creating a sql query
			Statement st = con.createStatement();
			//provide the query
			ResultSet rs = st.executeQuery("select count(id) from question");
			//if there is one id then get the id and add 1 in it then set to the id label
			if(rs.first()) {
				int id = rs.getInt(1);
				id = id+1;
				//convert into string
				String str = String.valueOf(id);
				lblNewLabel_3.setText(str);
			} else {
				//if no id is exist then set the text as 1
				lblNewLabel_3.setText("1");
			}
		} catch(Exception e) {
			//if any exception occurs then show it in a frame 
			System.out.println("hi");
			JFrame jf = new JFrame();
			jf.setAlwaysOnTop(true);
			JOptionPane.showMessageDialog(jf, e);
//			e.printStackTrace();
		}
	}
}
