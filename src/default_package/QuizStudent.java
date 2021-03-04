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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.JButton;

import java.util.Date;
import javax.swing.Timer;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat; 

public class QuizStudent extends JFrame {
	
	public String questionId = "1";
	public String answer;
	public int min = 0;
	public int sec = 0;
	public int marks = 0;
	Timer time;
	
	private JPanel contentPane;
	private JRadioButton rdbtnNewRadioButton;
	private JRadioButton rdbtnNewRadioButton_1;
	private JRadioButton rdbtnNewRadioButton_2;
	private JRadioButton rdbtnNewRadioButton_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QuizStudent frame = new QuizStudent("");
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

	public QuizStudent(String rollNo) {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1297, 705);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.CYAN);
		panel.setBounds(0, 0, 1283, 88);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 5, 60, 60);
		panel.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon(QuizStudent.class.getResource("/default_package/index student.png")));
		
		JLabel lblNewLabel_1 = new JLabel("WELCOME");
		lblNewLabel_1.setBounds(70, 11, 243, 67);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Algerian", Font.BOLD, 50));
		
		JLabel lblNewLabel_2 = new JLabel("Date : ");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2.setBounds(501, 30, 80, 25);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Date : ");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2_1.setBounds(599, 30, 125, 25);
		panel.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Total Time : ");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2_2.setBounds(860, 11, 125, 25);
		panel.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("10 min");
		lblNewLabel_2_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2_3.setBounds(998, 11, 80, 25);
		panel.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_4 = new JLabel("Time Taken : ");
		lblNewLabel_2_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2_4.setBounds(848, 47, 141, 25);
		panel.add(lblNewLabel_2_4);
		
		JLabel lblNewLabel_2_5 = new JLabel("00");
		lblNewLabel_2_5.setForeground(Color.RED);
		lblNewLabel_2_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2_5.setBounds(998, 47, 31, 25);
		panel.add(lblNewLabel_2_5);
		
		JLabel lblNewLabel_2_6 = new JLabel("00");
		lblNewLabel_2_6.setForeground(Color.RED);
		lblNewLabel_2_6.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2_6.setBounds(1036, 47, 31, 25);
		panel.add(lblNewLabel_2_6);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.CYAN);
		panel_1.setBounds(0, 85, 390, 583);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2_7 = new JLabel("Roll No:");
		lblNewLabel_2_7.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2_7.setBounds(10, 11, 86, 25);
		panel_1.add(lblNewLabel_2_7);
		
		JLabel lblNewLabel_2_8 = new JLabel("10000");
		lblNewLabel_2_8.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2_8.setBounds(191, 11, 94, 25);
		panel_1.add(lblNewLabel_2_8);
		
		JLabel lblNewLabel_2_9 = new JLabel("Name :");
		lblNewLabel_2_9.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2_9.setBounds(10, 47, 80, 25);
		panel_1.add(lblNewLabel_2_9);
		
		JLabel lblNewLabel_2_10 = new JLabel("Chandan");
		lblNewLabel_2_10.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2_10.setBounds(191, 47, 189, 25);
		panel_1.add(lblNewLabel_2_10);
		
		JLabel lblNewLabel_2_11 = new JLabel("Total Question :");
		lblNewLabel_2_11.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2_11.setBounds(10, 83, 159, 25);
		panel_1.add(lblNewLabel_2_11);
		
		JLabel lblNewLabel_2_12 = new JLabel("10");
		lblNewLabel_2_12.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2_12.setBounds(191, 83, 46, 25);
		panel_1.add(lblNewLabel_2_12);
		
		JLabel lblNewLabel_2_13 = new JLabel("Question No :");
		lblNewLabel_2_13.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2_13.setBounds(10, 119, 159, 25);
		panel_1.add(lblNewLabel_2_13);
		
		JLabel lblNewLabel_2_14 = new JLabel("00");
		lblNewLabel_2_14.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2_14.setBounds(191, 119, 80, 25);
		panel_1.add(lblNewLabel_2_14);
		
		JLabel lblNewLabel_2_15 = new JLabel("Marks :");
		lblNewLabel_2_15.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2_15.setBounds(10, 155, 80, 25);
		panel_1.add(lblNewLabel_2_15);
		
		JLabel lblNewLabel_2_16 = new JLabel("00");
		lblNewLabel_2_16.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2_16.setBounds(191, 155, 80, 25);
		panel_1.add(lblNewLabel_2_16);
		
		JLabel lblNewLabel_2_17 = new JLabel("Question Demo : ");
		lblNewLabel_2_17.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2_17.setBounds(431, 168, 817, 25);
		contentPane.add(lblNewLabel_2_17);
		
		rdbtnNewRadioButton = new JRadioButton("New radio button");
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNewRadioButton.isSelected()) {
					rdbtnNewRadioButton_1.setSelected(false);
					rdbtnNewRadioButton_2.setSelected(false);
					rdbtnNewRadioButton_3.setSelected(false);
				}
			}
		});
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		rdbtnNewRadioButton.setBounds(431, 256, 232, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		rdbtnNewRadioButton_1 = new JRadioButton("New radio button");
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNewRadioButton_1.isSelected()) {
					rdbtnNewRadioButton.setSelected(false);
					rdbtnNewRadioButton_2.setSelected(false);
					rdbtnNewRadioButton_3.setSelected(false);
				}
			}
		});
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		rdbtnNewRadioButton_1.setBounds(431, 321, 232, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		rdbtnNewRadioButton_2 = new JRadioButton("New radio button");
		rdbtnNewRadioButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNewRadioButton_2.isSelected()) {
					rdbtnNewRadioButton_1.setSelected(false);
					rdbtnNewRadioButton.setSelected(false);
					rdbtnNewRadioButton_3.setSelected(false);
				}
			}
		});
		rdbtnNewRadioButton_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		rdbtnNewRadioButton_2.setBounds(431, 389, 232, 23);
		contentPane.add(rdbtnNewRadioButton_2);
		
		rdbtnNewRadioButton_3 = new JRadioButton("New radio button");
		rdbtnNewRadioButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNewRadioButton_3.isSelected()) {
					rdbtnNewRadioButton_1.setSelected(false);
					rdbtnNewRadioButton_2.setSelected(false);
					rdbtnNewRadioButton.setSelected(false);
				}
			}
		});
		rdbtnNewRadioButton_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		rdbtnNewRadioButton_3.setBounds(431, 454, 232, 23);
		contentPane.add(rdbtnNewRadioButton_3);
		
		JButton btnNewButton = new JButton("NEXT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//answer check method 
				String studentAnswer = "";
				if(rdbtnNewRadioButton.isSelected()) {
					studentAnswer = rdbtnNewRadioButton.getText();
				} 
				else if(rdbtnNewRadioButton_1.isSelected()) {
					studentAnswer = rdbtnNewRadioButton_1.getText();
				} 
				else if(rdbtnNewRadioButton_2.isSelected()) {
					studentAnswer = rdbtnNewRadioButton_2.getText();
				} 
				else if(rdbtnNewRadioButton_3.isSelected()) {
					studentAnswer = rdbtnNewRadioButton_3.getText();
				} 
				//check the correct answer
				if(studentAnswer.equals(answer)) {
					marks += 1;
					String marks1 = String.valueOf(marks);
					lblNewLabel_2_16.setText(marks1);
				}
				//change the question id
				int questionId1 = Integer.parseInt(questionId);
				questionId1 += 1;
				questionId = String.valueOf(questionId1);
				
				//clear radio button
				
				rdbtnNewRadioButton.setSelected(false);
				rdbtnNewRadioButton_1.setSelected(false);
				rdbtnNewRadioButton_2.setSelected(false);
				rdbtnNewRadioButton_3.setSelected(false);
				
				//if we reach to the last question 
				if(questionId.equals("10")) {
					btnNewButton.setVisible(false);
				}
				//end if answer check method
				
				//question method
				
				//first question and student details
				try {
					Connection con = ConnectionProvider.getCon();
					Statement st = con.createStatement();
					
					ResultSet rs1 = st.executeQuery("select * from question where id='"+questionId+"'");
					while(rs1.next()) {
						lblNewLabel_2_14.setText(rs1.getString(1));
						lblNewLabel_2_17.setText(rs1.getString(2));
						rdbtnNewRadioButton.setText(rs1.getString(3));
						rdbtnNewRadioButton_1.setText(rs1.getString(4));
						rdbtnNewRadioButton_2.setText(rs1.getString(5));
						rdbtnNewRadioButton_3.setText(rs1.getString(6));
						answer = rs1.getString(7);
						
					}
				} catch(Exception e1) {
					JOptionPane.showMessageDialog(null, e1);
				}
				//end of question method
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setIcon(new ImageIcon(QuizStudent.class.getResource("/default_package/Next.png")));
		btnNewButton.setBounds(456, 529, 122, 29);
		contentPane.add(btnNewButton);
		
		JButton btnSubmit = new JButton("SUBMIT");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = JOptionPane.showConfirmDialog(null, "Do you really want to submit?", "Select", JOptionPane.YES_NO_OPTION);
				//if user select yes then a=0
				if(a == 0) {
					//answer check method 
					String studentAnswer = "";
					if(rdbtnNewRadioButton.isSelected()) {
						studentAnswer = rdbtnNewRadioButton.getText();
					} 
					else if(rdbtnNewRadioButton_1.isSelected()) {
						studentAnswer = rdbtnNewRadioButton_1.getText();
					} 
					else if(rdbtnNewRadioButton_2.isSelected()) {
						studentAnswer = rdbtnNewRadioButton_2.getText();
					} 
					else if(rdbtnNewRadioButton_3.isSelected()) {
						studentAnswer = rdbtnNewRadioButton_3.getText();
					} 
					//check the correct answer
					if(studentAnswer.equals(answer)) {
						marks += 1;
						String marks1 = String.valueOf(marks);
						lblNewLabel_2_16.setText(marks1);
					}
					//change the question id
					int questionId1 = Integer.parseInt(questionId);
					questionId1 += 1;
					questionId = String.valueOf(questionId1);
					
					//clear radio button
					rdbtnNewRadioButton.setSelected(false);
					rdbtnNewRadioButton_1.setSelected(false);
					rdbtnNewRadioButton_2.setSelected(false);
					rdbtnNewRadioButton_3.setSelected(false);
					
					//if we reach to the last question 
					if(questionId.equals("10")) {
						btnNewButton.setVisible(false);
					}
					//end if answer check method
					
					//submit method start
					//get the roll no and set the marks in that rollno
					String rollNo = lblNewLabel_2_8.getText();
					//answerCheck(); //this method is not working so the alternate 
					
					//answer check method 
					String studentAnswer1 = "";
					if(rdbtnNewRadioButton.isSelected()) {
						studentAnswer1 = rdbtnNewRadioButton.getText();
					} 
					else if(rdbtnNewRadioButton_1.isSelected()) {
						studentAnswer1 = rdbtnNewRadioButton_1.getText();
					} 
					else if(rdbtnNewRadioButton_2.isSelected()) {
						studentAnswer1 = rdbtnNewRadioButton_2.getText();
					} 
					else if(rdbtnNewRadioButton_3.isSelected()) {
						studentAnswer1 = rdbtnNewRadioButton_3.getText();
					} 
					//check the correct answer
					if(studentAnswer1.equals(answer)) {
						marks += 1;
						String marks1 = String.valueOf(marks);
						lblNewLabel_2_16.setText(marks1);
					}
					//change the question id
					int questionId11 = Integer.parseInt(questionId);
					questionId11 += 1;
					questionId = String.valueOf(questionId11);
					
					//clear radio button
					rdbtnNewRadioButton.setSelected(false);
					rdbtnNewRadioButton_1.setSelected(false);
					rdbtnNewRadioButton_2.setSelected(false);
					rdbtnNewRadioButton_3.setSelected(false);
					
					//if we reach to the last question 
					if(questionId.equals("10")) {
						btnNewButton.setVisible(false);
					}
					//end if answer check method
					
					try {
						Connection con = ConnectionProvider.getCon();
						Statement st = con.createStatement();
						st.executeUpdate("update student set marks='"+marks+"' where rollNo='"+rollNo+"'");
						String marks1 = String.valueOf(marks);
						//show the marks 
						JOptionPane.showMessageDialog(null, marks1);
					} catch(Exception e1) {
						JOptionPane.showMessageDialog(null, e1);
					}
					//submit method end
				}
			}
		});
		btnSubmit.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSubmit.setIcon(new ImageIcon(QuizStudent.class.getResource("/default_package/save.png")));
		btnSubmit.setBounds(1049, 529, 152, 29);
		contentPane.add(btnSubmit);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(QuizStudent.class.getResource("/default_package/pages background student.jpg")));
		lblNewLabel_3.setBounds(225, 34, 1058, 634);
		contentPane.add(lblNewLabel_3);
		
		
		
		
		//set the roll no
		lblNewLabel_2_8.setText(rollNo);
		
		//date 
		SimpleDateFormat dFormat = new SimpleDateFormat("dd-mm-yyyy");
		Date date = new Date();
		lblNewLabel_2_1.setText(dFormat.format(date));
		
		//first question and student details
		try {
			Connection con = ConnectionProvider.getCon();
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from student where rollNo='"+rollNo+"'");
			while(rs.next()) {
				lblNewLabel_2_10.setText(rs.getString(2));
			}
			ResultSet rs1 = st.executeQuery("select * from question where id='"+questionId+"'");
			while(rs1.next()) {
				lblNewLabel_2_14.setText(rs1.getString(1));
				lblNewLabel_2_17.setText(rs1.getString(2));
				rdbtnNewRadioButton.setText(rs1.getString(3));
				rdbtnNewRadioButton_1.setText(rs1.getString(4));
				rdbtnNewRadioButton_2.setText(rs1.getString(5));
				rdbtnNewRadioButton_3.setText(rs1.getString(6));
				answer = rs1.getString(7);
				
			}
		} catch(Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}
		//time program
		setLocationRelativeTo(this);
		time = new Timer(1000, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//set the time 
				lblNewLabel_2_6.setText(String.valueOf(sec));
				lblNewLabel_2_5.setText(String.valueOf(min));
				//update the time 
				if(sec == 60) {
					sec = 0;
					min++;
					if(min == 10 ) {
						//when the time reach 10min then stop the timer and check the answer and submit the answer 
						time.stop();
						answerCheck();
						submit();
					}
				}
				sec++;
			}
			public void answerCheck() {
				String studentAnswer = "";
				if(rdbtnNewRadioButton.isSelected()) {
					studentAnswer = rdbtnNewRadioButton.getText();
				} 
				else if(rdbtnNewRadioButton_1.isSelected()) {
					studentAnswer = rdbtnNewRadioButton_1.getText();
				} 
				else if(rdbtnNewRadioButton_2.isSelected()) {
					studentAnswer = rdbtnNewRadioButton_2.getText();
				} 
				else if(rdbtnNewRadioButton_3.isSelected()) {
					studentAnswer = rdbtnNewRadioButton_3.getText();
				} 
				//check the correct answer
				if(studentAnswer.equals(answer)) {
					marks += 1;
					String marks1 = String.valueOf(marks);
					lblNewLabel_2_16.setText(marks1);
				}
				//change the question id
				int questionId1 = Integer.parseInt(questionId);
				questionId1 += 1;
				questionId = String.valueOf(questionId1);
				
				//clear radio button
				rdbtnNewRadioButton.setSelected(false);
				rdbtnNewRadioButton_1.setSelected(false);
				rdbtnNewRadioButton_2.setSelected(false);
				rdbtnNewRadioButton_3.setSelected(false);
				
				//if we reach to the last question 
				if(questionId.equals("10")) {
					btnNewButton.setVisible(false);
				}
			}
			
			public void question() {
				//first question and student details
				try {
					Connection con = ConnectionProvider.getCon();
					Statement st = con.createStatement();
					
					ResultSet rs1 = st.executeQuery("select * from question where id='"+questionId+"'");
					while(rs1.next()) {
						lblNewLabel_2_14.setText(rs1.getString(1));
						lblNewLabel_2_17.setText(rs1.getString(2));
						rdbtnNewRadioButton.setText(rs1.getString(3));
						rdbtnNewRadioButton_1.setText(rs1.getString(4));
						rdbtnNewRadioButton_2.setText(rs1.getString(5));
						rdbtnNewRadioButton_3.setText(rs1.getString(6));
						answer = rs1.getString(7);
						
					}
				} catch(Exception e) {
					JOptionPane.showMessageDialog(null, e);
				}
			}
			
			public void submit() {
				//get the roll no and set the marks in that rollno
				String rollNo = lblNewLabel_2_8.getText();
				answerCheck();
				try {
					Connection con = ConnectionProvider.getCon();
					Statement st = con.createStatement();
					st.executeUpdate("update student set marks='"+marks+"' where rollNo='"+rollNo+"'");
					String marks1 = String.valueOf(marks);
					//show the marks 
					setVisible(false);
					new SuccessfullySubmited(marks1).setVisible(true);
				} catch(Exception e) {
					JOptionPane.showMessageDialog(null, e);
				}
				try {
					Connection con = ConnectionProvider.getCon();
					Statement st = con.createStatement();
					st.executeQuery("select email from student where rollNo='"+rollNo+"'");
					
				} catch(Exception e1) {
					
				}
			}
			
		});
		//start the timer
		time.start();
	}
}
