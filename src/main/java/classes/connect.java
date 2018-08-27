package classes;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class connect {
	
	public static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	public static final String DB_URL = "jdbc:mysql://localhost/healthyliving";
	public static final String USER = "root";
	static final String PASS = "123456";
	public static Connection conn;
    private Statement stmt;

	public void userconnection() 
	{
	    
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
	        System.out.println("Connection to databse...");
	        
	    try {
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			} catch (SQLException e) 
	        
	        {
				e.printStackTrace();
			}
    }

}
