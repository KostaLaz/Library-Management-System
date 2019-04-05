package login;

import java.awt.Color;
import java.awt.Dialog.ModalExclusionType;
import java.awt.EventQueue;
import java.awt.Font;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import java.sql.*;

public class Signup extends JFrame {
	
	Connection conn;
	ResultSet rs;
	PreparedStatement pst;
	

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Signup frame = new Signup();
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
	public Signup() {
		setModalExclusionType(ModalExclusionType.TOOLKIT_EXCLUDE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 459, 356);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 12));
		lblNewLabel.setBounds(31, 40, 79, 19);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setFont(new Font("Verdana", Font.BOLD, 12));
		lblNewLabel_1.setBounds(31, 81, 79, 19);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Your Security Question");
		lblNewLabel_2.setFont(new Font("Verdana", Font.BOLD, 11));
		lblNewLabel_2.setBounds(31, 165, 149, 19);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Password");
		lblNewLabel_3.setFont(new Font("Verdana", Font.BOLD, 12));
		lblNewLabel_3.setBounds(31, 130, 79, 19);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Answer");
		lblNewLabel_4.setFont(new Font("Verdana", Font.BOLD, 12));
		lblNewLabel_4.setBounds(31, 212, 79, 19);
		contentPane.add(lblNewLabel_4);
		
		textField = new JTextField();
		textField.setBounds(199, 40, 117, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(199, 81, 117, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(199, 130, 117, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"What is your mother tounge?", "What is your teacher`s name?", "What is your nick name?", "What is your childhood riend name?"}));
		comboBox.setBounds(199, 164, 186, 22);
		contentPane.add(comboBox);
		
		textField_3 = new JTextField();
		textField_3.setBounds(199, 212, 117, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnNewButton = new JButton("Create");
		btnNewButton.setIcon(new ImageIcon(Signup.class.getResource("/login/icons/iconfinder_Upload_132671.png")));
		btnNewButton.setBounds(91, 264, 102, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.setIcon(new ImageIcon(Signup.class.getResource("/login/icons/iconfinder_Back_132600.png")));
		btnNewButton_1.setBounds(245, 264, 102, 23);
		contentPane.add(btnNewButton_1);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "New Account", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 204, 51)));
     	panel.setBounds(10, 21, 412, 286);
		contentPane.add(panel);
	}
}
