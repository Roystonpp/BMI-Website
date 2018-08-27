package function;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.json.simple.JSONObject;

import classes.recipe;

@Path("/web")
public class showRecipe {

	@GET
	@Produces("Application/json")
	@Path("/find/{RecipeID}")
	public String findRecipe(@PathParam("RecipeID")int RecipeID) {
		String DB_URL = "jdbc:mysql://localhost:3306/healthyliving?useSSL=false";

		String USER = "root";
		String PASS = "123456";
		JSONObject recp = new JSONObject();

			try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);) {
				Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
				String sql = "SELECT * FROM recipes WHERE RecipeID = ?";
				PreparedStatement stmt = conn.prepareStatement(sql);
				stmt.setInt(1,RecipeID);	
				ResultSet rs = stmt.executeQuery();
				while (rs.next()) {
					recp.put("Recipe name:",rs.getString("Rname"));
					recp.put("Ingredients", rs.getString("Ingredients"));
					recp.put("Cooking Time", rs.getString("Cooking_Time"));
					recp.put("Directions", rs.getString("Directions"));
					recp.put("Fat", rs.getString("Fat"));
					recp.put("Protein", rs.getString("Protein"));
					recp.put("carbohydrates", rs.getString("Carbohydrates"));
					recp.put("Sugar", rs.getString("Sugar"));
					}
			} catch (SQLException se) {
				se.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();	
			}
			return recp.toString();
	}
}
