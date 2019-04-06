package login;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.border.TitledBorder;
import java.awt.Color;

public class Forgot extends JFrame {
	
	Connection conn;
	ResultSet rs;
	PreparedStatement pst;
	

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Forgot frame = new Forgot();
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
	public Forgot() {
		
		super("Forgot Password");
		conn = JavaConnect.ConectDB();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 478, 362);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 12));
		lblNewLabel.setBounds(35, 41, 101, 22);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Verdana", Font.BOLD, 12));
		lblNewLabel_1.setBounds(35, 89, 101, 22);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Answer");
		lblNewLabel_2.setFont(new Font("Verdana", Font.BOLD, 12));
		lblNewLabel_2.setBounds(35, 169, 101, 22);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Your Password");
		lblNewLabel_3.setFont(new Font("Verdana", Font.BOLD, 12));
		lblNewLabel_3.setBounds(35, 209, 101, 22);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Your Security Question");
		lblNewLabel_4.setFont(new Font("Verdana", Font.BOLD, 11));
		lblNewLabel_4.setBounds(35, 131, 149, 22);
		contentPane.add(lblNewLabel_4);
		
		textField = new JTextField();
		textField.setBounds(197, 42, 138, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(197, 91, 138, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(197, 133, 138, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(197, 171, 138, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(197, 211, 138, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnNewButton = new JButton("Search");
		btnNewButton.setIcon(new ImageIcon(Forgot.class.getResource("/login/icons/iconfinder_Find_132785.png")));
		btnNewButton.setBounds(345, 42, 96, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_3 = new JButton("Retrive");
		btnNewButton_3.setIcon(new ImageIcon(Forgot.class.getResource("/login/icons/iconfinder_Person_132730.png")));
		btnNewButton_3.setBounds(345, 170, 96, 23);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Back");
		btnNewButton_4.setIcon(new ImageIcon(Forgot.class.getResource("/login/icons/iconfinder_Back_132600.png")));
		btnNewButton_4.setBounds(352, 210, 89, 23);
		contentPane.add(btnNewButton_4);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Forgot Password", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(204, 0, 0)));
		panel.setBounds(10, 11, 441, 262);
		contentPane.add(panel);
	}
}
