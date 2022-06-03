package student_man;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class CP {

	static Connection con;

	public static Connection creatc() throws Exception
	{
		
		//load the driver
		// Class.forName("com.mysql.jdbc.Driver");
		// create connection
		
		String url = "jdbc:mysql://localhost:3306/student_manage";
		String user = "root";
		String pass = "1234";
		
		con = DriverManager.getConnection(url, user, pass);
		
		return con;
		
		
		
		
		
		
		
		
		
		






	}

}
