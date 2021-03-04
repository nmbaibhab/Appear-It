package default_package;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InstructionStudent extends JFrame {
	public String rollNo;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InstructionStudent frame = new InstructionStudent();
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
	public InstructionStudent() {
		initComponents();
	}
	public void initComponents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1297, 653);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(InstructionStudent.class.getResource("/default_package/index student.png")));
		lblNewLabel.setBounds(10, 11, 65, 52);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Instruction");
		lblNewLabel_1.setFont(new Font("Algerian", Font.BOLD, 40));
		lblNewLabel_1.setBounds(70, 17, 275, 46);
		contentPane.add(lblNewLabel_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 74, 1263, 2);
		contentPane.add(separator);
		
		JTextArea txtrNoCheeting = new JTextArea();
		txtrNoCheeting.setFont(new Font("Monospaced", Font.BOLD, 27));
		txtrNoCheeting.setText("NO CHEETING..." + "\n" +"Number od Question"+ "\n" + "Exam Duration : 10 min"+ "\n" +"All the best !!! ");
		txtrNoCheeting.setBounds(10, 103, 1263, 380);
		txtrNoCheeting.setEditable(false);
		contentPane.add(txtrNoCheeting);
		
		JButton btnNewButton = new JButton("START EXAM");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new QuizStudent(rollNo).setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 36));
		btnNewButton.setBounds(527, 521, 287, 38);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(InstructionStudent.class.getResource("/default_package/pages background student.jpg")));
		lblNewLabel_2.setBounds(0, 0, 1298, 616);
		contentPane.add(lblNewLabel_2);
	}
	
	public InstructionStudent(String rollNo1) {
		initComponents();
		rollNo = rollNo1;
		JOptionPane.showMessageDialog(null, rollNo1);
	}
}
