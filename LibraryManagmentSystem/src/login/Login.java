package login;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;

public class Login extends JFrame {

	private JPanel contentPane;
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
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbUser = new JLabel("Username");
		lbUser.setFont(new Font("Verdana", Font.BOLD, 14));
		lbUser.setBounds(50, 58, 81, 21);
		contentPane.add(lbUser);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Verdana", Font.BOLD, 14));
		lblPassword.setBounds(50, 121, 81, 21);
		contentPane.add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(207, 60, 141, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(207, 123, 141, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setFont(new Font("Verdana", Font.BOLD, 12));
		btnLogin.setBounds(100, 173, 89, 23);
		contentPane.add(btnLogin);
		
		JButton btnSignup = new JButton("Signup");
		btnSignup.setFont(new Font("Verdana", Font.BOLD, 12));
		btnSignup.setBounds(246, 173, 89, 23);
		contentPane.add(btnSignup);
		
		JButton btnNewButton_2 = new JButton("Forgot password?");
		btnNewButton_2.setFont(new Font("Verdana", Font.BOLD, 12));
		btnNewButton_2.setBounds(245, 216, 157, 23);
		contentPane.add(btnNewButton_2);
		
		JLabel lblForgotPassword = new JLabel("Trouble login...");
		lblForgotPassword.setForeground(Color.RED);
		lblForgotPassword.setFont(new Font("Verdana", Font.BOLD, 12));
		lblForgotPassword.setBounds(46, 217, 129, 19);
		contentPane.add(lblForgotPassword);
	}
}
