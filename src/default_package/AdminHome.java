package default_package;

//import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JMenu;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AdminHome extends JFrame {

	public static int open = 0;
	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminHome frame = new AdminHome();
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
	public AdminHome() {
		setBackground(Color.LIGHT_GRAY);
		setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 22));
		setTitle("Navigation");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1356, 591);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Add New Question");
		mnNewMenu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(open == 0) {
					new AddNewQuestion().setVisible(true);
					open = 1;
				}else {
					JFrame jf = new JFrame();
					jf.setAlwaysOnTop(true);
					JOptionPane.showMessageDialog(jf, "One form is already Open");
				}
			}
		});
		mnNewMenu.setFont(new Font("Segoe UI", Font.BOLD, 14));
		mnNewMenu.setIcon(new ImageIcon(AdminHome.class.getResource("/default_package/add new question.png")));
		menuBar.add(mnNewMenu);
		
		JMenu mnUpdateQuestion = new JMenu("Update Question");
		mnUpdateQuestion.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//if user clicked the button again again then show the warning message
				if(open == 0) {
					new UpdateQuestion().setVisible(true);
					open = 1;
				}else {
					JFrame jf = new JFrame();
					jf.setAlwaysOnTop(true);
					JOptionPane.showMessageDialog(jf, "One form is already Open");
				}
			}
		});
		mnUpdateQuestion.setFont(new Font("Segoe UI", Font.BOLD, 14));
		mnUpdateQuestion.setIcon(new ImageIcon(AdminHome.class.getResource("/default_package/Update Question.png")));
		menuBar.add(mnUpdateQuestion);
		
		JMenu mnAllQuestion = new JMenu("All Question");
		mnAllQuestion.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
//				//if user clicked the button again again then show the warning message
				if(open == 0) {
					new AllQuestions().setVisible(true);
					open = 1;
				}else {
					JFrame jf = new JFrame();
					jf.setAlwaysOnTop(true);
					JOptionPane.showMessageDialog(jf, "One form is already Open");
				}
			}
		});
		mnAllQuestion.setFont(new Font("Segoe UI", Font.BOLD, 14));
		mnAllQuestion.setIcon(new ImageIcon(AdminHome.class.getResource("/default_package/all questions.png")));
		menuBar.add(mnAllQuestion);
		
		JMenu mnDeleteQuestion = new JMenu("Delete Question");
		mnDeleteQuestion.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//if user clicked the button again again then show the warning message
				if(open == 0) {
					new DeleteQuestion().setVisible(true);
					open = 1;
				}else {
					JFrame jf = new JFrame();
					jf.setAlwaysOnTop(true);
					JOptionPane.showMessageDialog(jf, "One form is already Open");
				}
			}
		});
		mnDeleteQuestion.setFont(new Font("Segoe UI", Font.BOLD, 14));
		mnDeleteQuestion.setIcon(new ImageIcon(AdminHome.class.getResource("/default_package/delete Question.png")));
		menuBar.add(mnDeleteQuestion);
		
		JMenu mnAllStudentResult = new JMenu("All Student Result");
		mnAllStudentResult.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//if user clicked the button again again then show the warning message
				if(open == 0) {
					//show the result pages
					new AllStudentResult().setVisible(true);
					open = 1;
				}else {
					JFrame jf = new JFrame();
					jf.setAlwaysOnTop(true);
					JOptionPane.showMessageDialog(jf, "One form is already Open");
				}
			}
		});
		mnAllStudentResult.setFont(new Font("Segoe UI", Font.BOLD, 14));
		mnAllStudentResult.setIcon(new ImageIcon(AdminHome.class.getResource("/default_package/all student result.png")));
		menuBar.add(mnAllStudentResult);
		
		JMenu mnLogout = new JMenu("Logout");
		mnLogout.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//create an object of jframe to show a yes no dialog box
				JFrame jf = new JFrame();
				//set it always on the top 
				jf.setAlwaysOnTop(true);
				//show the dialog box passing the jframe object and the message , type , and type of dialog box
				int a = JOptionPane.showConfirmDialog(jf, "Do you really want to log out", "Select", JOptionPane.YES_NO_OPTION);
				//if the user press yes then a = 0
				if(a == 0) {
					//set the visibility of the admin home page false
					setVisible(false);
					//move to the back page means to the login page
					try {
						LoginAdmins frame = new LoginAdmins();
						frame.setVisible(true);
					} catch (Exception e1) {
						e1.printStackTrace();
					}
				}
			}
		});
		mnLogout.setFont(new Font("Segoe UI", Font.BOLD, 14));
		mnLogout.setIcon(new ImageIcon(AdminHome.class.getResource("/default_package/Logout.png")));
		menuBar.add(mnLogout);
		
		JMenu mnExit = new JMenu("Exit");
		mnExit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//create an object of jframe to show a yes no dialog box
				JFrame jf = new JFrame();
				//set it always on the top 
				jf.setAlwaysOnTop(true);
				//show the dialog box passing the jframe object and the message , type , and type of dialog box
				int a = JOptionPane.showConfirmDialog(jf, "Do you really want to exit application", "Select", JOptionPane.YES_NO_OPTION);
				//if the user press yes then a = 0 
				if(a == 0) {
					System.exit(0);
				}
			}
		});
		mnExit.setFont(new Font("Segoe UI", Font.BOLD, 14));
		mnExit.setIcon(new ImageIcon(AdminHome.class.getResource("/default_package/Close.png")));
		menuBar.add(mnExit);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(AdminHome.class.getResource("/default_package/index background.png")));
		lblNewLabel.setBounds(0, 0, 1311, 513);
		contentPane.add(lblNewLabel);
	}
}
