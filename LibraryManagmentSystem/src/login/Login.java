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
		btnLogin.setIcon(new ImageIcon(Login.class.getResource("/login/icons/iconfinder_Tick_132261.png")));
		btnLogin.setFont(new Font("Verdana", Font.BOLD, 12));
		btnLogin.setBounds(73, 173, 104, 23);
		contentPane.add(btnLogin);
		
		JButton btnSignup = new JButton("Signup");
		btnSignup.setIcon(new ImageIcon(Login.class.getResource("/login/icons/iconfinder_Right_132313.png")));
		btnSignup.setFont(new Font("Verdana", Font.BOLD, 12));
		btnSignup.setBounds(246, 173, 116, 23);
		contentPane.add(btnSignup);
		
		JButton btnNewButton_2 = new JButton("Forgot password?");
		btnNewButton_2.setIcon(null);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_2.setFont(new Font("Verdana", Font.BOLD, 12));
		btnNewButton_2.setBounds(246, 215, 157, 22);
		contentPane.add(btnNewButton_2);
		
		JLabel lblForgotPassword = new JLabel("Trouble login...");
		lblForgotPassword.setForeground(Color.RED);
		lblForgotPassword.setFont(new Font("Verdana", Font.BOLD, 12));
		lblForgotPassword.setBounds(46, 217, 129, 19);
		contentPane.add(lblForgotPassword);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Login.class.getResource("/login/icons/iconfinder_Lock_132279.png")));
		lblNewLabel.setBounds(356, 63, 30, 19);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(Login.class.getResource("/login/icons/iconfinder_Key_132286.png")));
		lblNewLabel_1.setBounds(358, 122, 30, 23);
		contentPane.add(lblNewLabel_1);
		
	}
}
