package login;

import java.awt.Color;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.UIManager;

public class Login extends JFrame {

	private JPanel contentPaneLogin;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPaneLogin = new JPanel();
		contentPaneLogin.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPaneLogin);
		contentPaneLogin.setLayout(null);
		
		JLabel lbUser = new JLabel("Username");
		lbUser.setFont(new Font("Verdana", Font.BOLD, 14));
		lbUser.setBounds(50, 58, 81, 21);
		contentPaneLogin.add(lbUser);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Verdana", Font.BOLD, 14));
		lblPassword.setBounds(50, 121, 81, 21);
		contentPaneLogin.add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(207, 60, 141, 20);
		contentPaneLogin.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(207, 123, 141, 20);
		contentPaneLogin.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setIcon(new ImageIcon(Login.class.getResource("/login/icons/iconfinder_Tick_132261.png")));
		btnLogin.setFont(new Font("Verdana", Font.BOLD, 12));
		btnLogin.setBounds(73, 173, 104, 23);
		contentPaneLogin.add(btnLogin);
		
		JButton btnSignup = new JButton("Signup");
		btnSignup.setIcon(new ImageIcon(Login.class.getResource("/login/icons/iconfinder_Right_132313.png")));
		btnSignup.setFont(new Font("Verdana", Font.BOLD, 12));
		btnSignup.setBounds(246, 173, 116, 23);
		contentPaneLogin.add(btnSignup);
		
		JButton btnNewButton_2 = new JButton("Forgot password?");
		btnNewButton_2.setIcon(null);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_2.setFont(new Font("Verdana", Font.BOLD, 10));
		btnNewButton_2.setBounds(185, 216, 151, 22);
		contentPaneLogin.add(btnNewButton_2);
		
		JLabel lblForgotPassword = new JLabel("Trouble login...");
		lblForgotPassword.setForeground(Color.RED);
		lblForgotPassword.setFont(new Font("Verdana", Font.BOLD, 12));
		lblForgotPassword.setBounds(46, 217, 129, 19);
		contentPaneLogin.add(lblForgotPassword);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Login.class.getResource("/login/icons/iconfinder_Lock_132279.png")));
		lblNewLabel.setBounds(356, 63, 30, 19);
		contentPaneLogin.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(Login.class.getResource("/login/icons/iconfinder_Key_132286.png")));
		lblNewLabel_1.setBounds(358, 122, 30, 23);
		contentPaneLogin.add(lblNewLabel_1);
		
		JPanel panel = new JPanel();
		panel.setBackground(UIManager.getColor("Button.background"));
		panel.setForeground(new Color(0, 204, 255));
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Login", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(51, 204, 204)));
		panel.setBounds(32, 32, 370, 219);
		contentPaneLogin.add(panel);
		
	}
}
