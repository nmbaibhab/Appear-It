package default_package;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import source_packages.ConnectionProvider;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
//import java.sql.Date;
import java.util.Date;
import java.text.SimpleDateFormat;

import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class StudentDetails extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField txtEnterUniversityName;
	private JTextField txtEnterPercentage;
	private JTextField txtEnterPassoutYear;
	private JTextField txtEnterUniversityName_1;
	private JTextField txtEnterPercentage_1;
	private JTextField txtEnterPassoutYear_1;
	private JTextField txtEnterUniversityName_2;
	private JTextField txtEnterPercentage_2;
	private JTextField txtEnterPassoutYear_2;
	private JTextField textField_15;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentDetails frame = new StudentDetails();
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
	public StudentDetails() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1324, 619);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(StudentDetails.class.getResource("/default_package/index student.png")));
		lblNewLabel.setBounds(10, 11, 69, 60);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Fill Up The Form");
		lblNewLabel_1.setFont(new Font("Algerian", Font.BOLD, 40));
		lblNewLabel_1.setBounds(83, 17, 388, 54);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Date :");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2.setBounds(693, 31, 82, 25);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Date :");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2_1.setBounds(785, 31, 130, 25);
		contentPane.add(lblNewLabel_2_1);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				//move to the index page
				try {
					Index window = new Index();
					window.frame.setVisible(true);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setIcon(new ImageIcon(StudentDetails.class.getResource("/default_package/back student.png")));
		btnNewButton.setBounds(1007, 11, 158, 66);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//showing the exit panel to user and asking for exit. 
				int a = JOptionPane.showConfirmDialog(null, "Do You Really want to Exit.", "Select", JOptionPane.YES_NO_OPTION);
				//if user click yes then a value = 0
				if(a == 0) {
					System.exit(0);
				}
			}
		});
		btnNewButton_1.setIcon(new ImageIcon(StudentDetails.class.getResource("/default_package/Close.png")));
		btnNewButton_1.setBounds(1184, 11, 89, 69);
		contentPane.add(btnNewButton_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 94, 1263, 2);
		contentPane.add(separator);
		
		JLabel lblNewLabel_3 = new JLabel("Roll No : ");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3.setBounds(10, 107, 112, 26);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("Name: ");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3_1.setBounds(10, 144, 112, 27);
		contentPane.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("Father Name :");
		lblNewLabel_3_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3_2.setBounds(10, 182, 156, 27);
		contentPane.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_2_1 = new JLabel("Mother Name :");
		lblNewLabel_3_2_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3_2_1.setBounds(10, 220, 156, 26);
		contentPane.add(lblNewLabel_3_2_1);
		
		JLabel lblNewLabel_3_2_2 = new JLabel("Gender : ");
		lblNewLabel_3_2_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3_2_2.setBounds(10, 262, 156, 25);
		contentPane.add(lblNewLabel_3_2_2);
		
		JLabel lblNewLabel_3_2_3 = new JLabel("Contact No : ");
		lblNewLabel_3_2_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3_2_3.setBounds(10, 298, 156, 25);
		contentPane.add(lblNewLabel_3_2_3);
		
		JLabel lblNewLabel_3_2_4 = new JLabel("Email : ");
		lblNewLabel_3_2_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3_2_4.setBounds(10, 334, 156, 25);
		contentPane.add(lblNewLabel_3_2_4);
		
		JLabel lblNewLabel_3_2_5 = new JLabel("10th : ");
		lblNewLabel_3_2_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3_2_5.setBounds(10, 370, 156, 25);
		contentPane.add(lblNewLabel_3_2_5);
		
		JLabel lblNewLabel_3_2_5_1 = new JLabel("12th : ");
		lblNewLabel_3_2_5_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3_2_5_1.setBounds(10, 406, 156, 25);
		contentPane.add(lblNewLabel_3_2_5_1);
		
		JLabel lblNewLabel_3_2_5_2 = new JLabel("Graduation : ");
		lblNewLabel_3_2_5_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3_2_5_2.setBounds(10, 442, 156, 25);
		contentPane.add(lblNewLabel_3_2_5_2);
		
		JLabel lblNewLabel_3_2_5_2_1 = new JLabel("Address : ");
		lblNewLabel_3_2_5_2_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3_2_5_2_1.setBounds(10, 478, 156, 25);
		contentPane.add(lblNewLabel_3_2_5_2_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField.setBounds(198, 107, 280, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_1.setColumns(10);
		textField_1.setBounds(200, 144, 278, 26);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_2.setColumns(10);
		textField_2.setBounds(198, 182, 280, 26);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_3.setColumns(10);
		textField_3.setBounds(198, 220, 280, 26);
		contentPane.add(textField_3);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Male", "Female", "Other"}));
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 20));
		comboBox.setBounds(198, 262, 280, 22);
		contentPane.add(comboBox);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_4.setColumns(10);
		textField_4.setBounds(198, 297, 280, 26);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_5.setColumns(10);
		textField_5.setBounds(198, 334, 280, 26);
		contentPane.add(textField_5);
		
		txtEnterUniversityName = new JTextField();
		txtEnterUniversityName.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				//remove the place holder value when user focus in it
				if(txtEnterUniversityName.getText().equals("Enter University Name")) {
					txtEnterUniversityName.setText("");
					txtEnterUniversityName.setForeground(new Color(0,0,0));
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(txtEnterUniversityName.getText().equals("")) {
					txtEnterUniversityName.setText("Enter University Name");
					txtEnterUniversityName.setForeground(new Color(153,153,153));
				}
			}
		});
		txtEnterUniversityName.setForeground(Color.LIGHT_GRAY);
		txtEnterUniversityName.setText("Enter University Name");
		txtEnterUniversityName.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtEnterUniversityName.setColumns(10);
		txtEnterUniversityName.setBounds(198, 370, 280, 26);
		contentPane.add(txtEnterUniversityName);
		
		txtEnterPercentage = new JTextField();
		txtEnterPercentage.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				//remove the place holder value when user focus in it
				if(txtEnterPercentage.getText().equals("Enter Percentage")) {
					txtEnterPercentage.setText("");
					txtEnterPercentage.setForeground(new Color(0,0,0));
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(txtEnterPercentage.getText().equals("")) {
					txtEnterPercentage.setText("Enter Percentage");
					txtEnterPercentage.setForeground(new Color(153,153,153));
				}
			}
		});
		txtEnterPercentage.setForeground(Color.LIGHT_GRAY);
		txtEnterPercentage.setText("Enter Percentage");
		txtEnterPercentage.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtEnterPercentage.setColumns(10);
		txtEnterPercentage.setBounds(504, 370, 328, 26);
		contentPane.add(txtEnterPercentage);
		
		txtEnterPassoutYear = new JTextField();
		txtEnterPassoutYear.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				//remove the place holder value when user focus in it
				if(txtEnterPassoutYear.getText().equals("Enter Passout Year")) {
					txtEnterPassoutYear.setText("");
					txtEnterPassoutYear.setForeground(new Color(0,0,0));
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(txtEnterPassoutYear.getText().equals("")) {
					txtEnterPassoutYear.setText("Enter Passout Year");
					txtEnterPassoutYear.setForeground(new Color(153,153,153));
				}
			}
		});
		txtEnterPassoutYear.setForeground(Color.LIGHT_GRAY);
		txtEnterPassoutYear.setText("Enter Passout Year");
		txtEnterPassoutYear.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtEnterPassoutYear.setColumns(10);
		txtEnterPassoutYear.setBounds(864, 370, 301, 26);
		contentPane.add(txtEnterPassoutYear);
		
		txtEnterUniversityName_1 = new JTextField();
		txtEnterUniversityName_1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				//remove the place holder value when user focus in it
				if(txtEnterUniversityName_1.getText().equals("Enter University Name")) {
					txtEnterUniversityName_1.setText("");
					txtEnterUniversityName_1.setForeground(new Color(0,0,0));
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(txtEnterUniversityName_1.getText().equals("")) {
					txtEnterUniversityName_1.setText("Enter University Name");
					txtEnterUniversityName_1.setForeground(new Color(153,153,153));
				}
			}
		});
		txtEnterUniversityName_1.setForeground(Color.LIGHT_GRAY);
		txtEnterUniversityName_1.setText("Enter University Name");
		txtEnterUniversityName_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtEnterUniversityName_1.setColumns(10);
		txtEnterUniversityName_1.setBounds(198, 409, 280, 26);
		contentPane.add(txtEnterUniversityName_1);
		
		txtEnterPercentage_1 = new JTextField();
		txtEnterPercentage_1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				//remove the place holder value when user focus in it
				if(txtEnterPercentage_1.getText().equals("Enter Percentage")) {
					txtEnterPercentage_1.setText("");
					txtEnterPercentage_1.setForeground(new Color(0,0,0));
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(txtEnterPercentage_1.getText().equals("")) {
					txtEnterPercentage_1.setText("Enter Percentage");
					txtEnterPercentage_1.setForeground(new Color(153,153,153));
				}
			}
		});
		txtEnterPercentage_1.setForeground(Color.LIGHT_GRAY);
		txtEnterPercentage_1.setText("Enter Percentage");
		txtEnterPercentage_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtEnterPercentage_1.setColumns(10);
		txtEnterPercentage_1.setBounds(504, 409, 328, 26);
		contentPane.add(txtEnterPercentage_1);
		
		txtEnterPassoutYear_1 = new JTextField();
		txtEnterPassoutYear_1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				//remove the place holder value when user focus in it
				if(txtEnterPassoutYear_1.getText().equals("Enter Passout Year")) {
					txtEnterPassoutYear_1.setText("");
					txtEnterPassoutYear_1.setForeground(new Color(0,0,0));
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(txtEnterPassoutYear_1.getText().equals("")) {
					txtEnterPassoutYear_1.setText("Enter Passout Year");
					txtEnterPassoutYear_1.setForeground(new Color(153,153,153));
				}
			}
		});
		txtEnterPassoutYear_1.setForeground(Color.LIGHT_GRAY);
		txtEnterPassoutYear_1.setText("Enter Passout Year");
		txtEnterPassoutYear_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtEnterPassoutYear_1.setColumns(10);
		txtEnterPassoutYear_1.setBounds(864, 407, 301, 26);
		contentPane.add(txtEnterPassoutYear_1);
		
		txtEnterUniversityName_2 = new JTextField();
		txtEnterUniversityName_2.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				//remove the place holder value when user focus in it
				if(txtEnterUniversityName_2.getText().equals("Enter University Name")) {
					txtEnterUniversityName_2.setText("");
					txtEnterUniversityName_2.setForeground(new Color(0,0,0));
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(txtEnterUniversityName_2.getText().equals("")) {
					txtEnterUniversityName_2.setText("Enter University Name");
					txtEnterUniversityName_2.setForeground(new Color(153,153,153));
				}
			}
		});
		txtEnterUniversityName_2.setForeground(Color.LIGHT_GRAY);
		txtEnterUniversityName_2.setText("Enter University Name");
		txtEnterUniversityName_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtEnterUniversityName_2.setColumns(10);
		txtEnterUniversityName_2.setBounds(198, 441, 280, 26);
		contentPane.add(txtEnterUniversityName_2);
		
		txtEnterPercentage_2 = new JTextField();
		txtEnterPercentage_2.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				//remove the place holder value when user focus in it
				if(txtEnterPercentage_2.getText().equals("Enter Percentage")) {
					txtEnterPercentage_2.setText("");
					txtEnterPercentage_2.setForeground(new Color(0,0,0));
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(txtEnterPercentage_2.getText().equals("")) {
					txtEnterPercentage_2.setText("Enter Percentage");
					txtEnterPercentage_2.setForeground(new Color(153,153,153));
				}
			}
		});
		txtEnterPercentage_2.setForeground(Color.LIGHT_GRAY);
		txtEnterPercentage_2.setText("Enter Percentage");
		txtEnterPercentage_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtEnterPercentage_2.setColumns(10);
		txtEnterPercentage_2.setBounds(504, 442, 328, 26);
		contentPane.add(txtEnterPercentage_2);
		
		txtEnterPassoutYear_2 = new JTextField();
		txtEnterPassoutYear_2.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				//remove the place holder value when user focus in it
				if(txtEnterPassoutYear_2.getText().equals("Enter Passout Year")) {
					txtEnterPassoutYear_2.setText("");
					txtEnterPassoutYear_2.setForeground(new Color(0,0,0));
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(txtEnterPassoutYear_2.getText().equals("")) {
					txtEnterPassoutYear_2.setText("Enter Passout Year");
					txtEnterPassoutYear_2.setForeground(new Color(153,153,153));
				}
			}
		});
		txtEnterPassoutYear_2.setForeground(Color.LIGHT_GRAY);
		txtEnterPassoutYear_2.setText("Enter Passout Year");
		txtEnterPassoutYear_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtEnterPassoutYear_2.setColumns(10);
		txtEnterPassoutYear_2.setBounds(864, 443, 301, 26);
		contentPane.add(txtEnterPassoutYear_2);
		
		textField_15 = new JTextField();
		textField_15.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_15.setColumns(10);
		textField_15.setBounds(198, 478, 967, 26);
		contentPane.add(textField_15);
		
		JButton btnNewButton_2 = new JButton("Save");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String rollNo = textField.getText();
				String name = textField_1.getText();
				String fatherName = textField_2.getText();
				String motherName = textField_3.getText();
				String gender = (String)comboBox.getSelectedItem();
				String contactNo = textField_4.getText();
				String email = textField_5.getText();
				String tenthUniversityName = txtEnterUniversityName.getText();
				String tenthPercentage = txtEnterPercentage.getText();
				String tenthPassoutYear = txtEnterPassoutYear.getText();
				String twelveUniversityName = txtEnterUniversityName_1.getText();
				String twelvePercentage = txtEnterPercentage_1.getText();
				String twelvePassoutYear = txtEnterPassoutYear_1.getText();
				String graduationUniversityName = txtEnterUniversityName_2.getText();
				String graduationPercentage = txtEnterPercentage_2.getText();
				String graduationPassoutYear = txtEnterPassoutYear_2.getText();
				String address = textField_15.getText();
				String marks = "0";
				
				try {
					Connection con = ConnectionProvider.getCon();
					PreparedStatement ps = con.prepareStatement("insert into student values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
					ps.setString(1, rollNo);
					ps.setString(2, name);
					ps.setString(3, fatherName);
					ps.setString(4, motherName);
					ps.setString(5, gender);
					ps.setString(6, contactNo);
					ps.setString(7, email);
					ps.setString(8, tenthUniversityName);
					ps.setString(9, tenthPercentage);
					ps.setString(10, tenthPassoutYear);
					ps.setString(11, twelveUniversityName);
					ps.setString(12, twelvePercentage);
					ps.setString(13, twelvePassoutYear);
					ps.setString(14, graduationUniversityName);
					ps.setString(15, graduationPercentage);
					ps.setString(16, graduationPassoutYear);
					ps.setString(17, address);
					ps.setString(18, marks);
					//update the the query
					ps.executeUpdate();
					//close this page 
					setVisible(false);
					//open instruction page of details
					new InstructionStudent(rollNo).setVisible(true);
					
				} catch(Exception e1) {
					JOptionPane.showMessageDialog(null, e);
				}
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_2.setIcon(new ImageIcon(StudentDetails.class.getResource("/default_package/save.png")));
		btnNewButton_2.setBounds(490, 525, 248, 33);
		contentPane.add(btnNewButton_2);
		
		JTextArea txtrExaminationManagementSystem = new JTextArea();
		txtrExaminationManagementSystem.setFont(new Font("Monospaced", Font.BOLD, 15));
		txtrExaminationManagementSystem.setRows(5);
		txtrExaminationManagementSystem.setColumns(3);
		txtrExaminationManagementSystem.setText(" Examination Management System is managing all the activities related to "+"\n"+" examination management right from receipt of Enrollment Forms and "+"\n"+" Examination Forms through the processing of Reletives and "+"\n"+" Certificates and Grading Reports.");
		txtrExaminationManagementSystem.setBounds(520, 107, 645, 230);
		contentPane.add(txtrExaminationManagementSystem);
		txtrExaminationManagementSystem.setEditable(false);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(StudentDetails.class.getResource("/default_package/pages background student.jpg")));
		lblNewLabel_4.setBounds(0, 0, 1283, 582);
		contentPane.add(lblNewLabel_4);
		
		SimpleDateFormat dformat = new SimpleDateFormat("dd-mm-yyyy");
		Date date = new Date();
		lblNewLabel_2_1.setText(dformat.format(date));
	}
}
