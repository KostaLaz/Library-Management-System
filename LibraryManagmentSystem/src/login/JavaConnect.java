package login;

import java.sql.*;
import javax.swing.JOptionPane;

public class JavaConnect {


	Connection conn;
	
	public static Connection ConectDB() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/LibraryNew", "root", "");
			return conn;
		}
		catch(Exception e){
			JOptionPane.showMessageDialog(null, e);
			return null;
		}
	}
	
	
}
