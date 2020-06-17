package InputOutPut;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class connectionToDB {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");//class.forName load the Driver class
		//Establishing Connection:
		/*
		 * For establishing connection with database we call static method called
		 * getConnection(...) present in DriverManager Class. This method contains three
		 * arguments of string type. i.e., url, username and password
		 */
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee", "username", "password");
		
		//Creating Statement Object:
		Statement st = con.createStatement();
		//Executing Queries:
		ResultSet rs = st.executeQuery("Select * from Employee");
		//Closing the Connection:
		con.close();
		
		
		
		
		
	}

}

