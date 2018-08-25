package classes;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;



@Path("/register")
public class User 
{
	
	private int userID;
	private String forename;
	private String surname;
	private String email;
	private String password;

	public static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	public static final String DB_URL = "jdbc:mysql://localhost/healthyliving";
	public static final String USER = "root";
	static final String PASS = "123456";
	public static Connection conn;
    public Statement stmt;
    
	public User() 
	 {
//		this.userID = userID;
//		this.forename = forename;
//		this.surname = surname;
//		this.email = email;
//		this.password = password;
	 }

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
	
	@POST
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Path("/addFromInput")
	public void addNewCreatedEntry(
			@FormParam("Forename") String Forename,
			@FormParam("Surname") String Surname,
			@FormParam("Email") String Email) throws Exception {
		String DB_URL = "jdbc:mysql://localhost/mydb?useSSL=false";
		String USER = "root";
		String PASS = "123456";
		String sql = "INSERT INTO User(Forename, Surname, Email) VALUES(?,?,?)";
			try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);) {
				Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
				PreparedStatement stmt = conn.prepareStatement(sql);
				stmt.setString(1,Forename);
				stmt.setString(2,Surname);
				stmt.setString(3,Email);
				stmt.executeUpdate();
			} catch (SQLException se) {
				se.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}	
	}
	


//	public void setForename() {
//		this.forename = forename;
//		}
//	
//	public String getForename() {
//		return forename;
//		}
//	
//	public void setSurname() {
//		this.surname = surname;
//	    }
//	
//	public String getSurname() {
//	    return surname;
//	    }
//	
//	public void setEmail() {
//	    this.email = email;
//	    }
	
}

