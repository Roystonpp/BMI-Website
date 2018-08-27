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

public class User {

	public static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	public static final String DB_URL = "jdbc:mysql://localhost/healthyliving";
	public static final String USER = "root";
	static final String PASS = "123456";
	private static Connection conn;
	private Statement stmt;

	public void addNewUser(String foreName, String surname, String email) {
		String sql = "INSERT INTO User(Forename, Surname, Email) VALUES(?,?,?)";
		PreparedStatement statment = null;
		try {
			statment = connect.conn.prepareStatement(sql);
			statment.setString(1, foreName);
			statment.setString(2, surname);
			statment.setString(3, email);
			statment.executeUpdate();
		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void addNewCreatedEntry(@FormParam("Forename") String Forename, @FormParam("Surname") String Surname,
			@FormParam("Email") String Email) throws Exception {
		String DB_URL = "jdbc:mysql://localhost/mydb?useSSL=false";
		String USER = "root";
		String PASS = "123456";
		String sql = "INSERT INTO User(Forename, Surname, Email) VALUES(?,?,?)";
		try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);) {
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, Forename);
			stmt.setString(2, Surname);
			stmt.setString(3, Email);
			stmt.executeUpdate();
		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
