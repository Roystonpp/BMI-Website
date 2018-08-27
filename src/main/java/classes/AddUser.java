package classes;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

import classes.connect;
import classes.User;
import classes.SetUser;
@Path("/register")
public class AddUser {

	@Path("/createUser")
	@POST
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public void createUser(
			@FormParam("Forename")String Forename,
			@FormParam("Surname")String Surname,
			@FormParam("Email")String Email) {
		connect connection = new connect();
		connection.userconnection();
		SetUser newUser = new SetUser();
		newUser.setForename(1, Forename);
		newUser.setSurname(2, Surname);
		newUser.setEmail(3,Email);
		User createUserAccout = new User();
		createUserAccout.addNewUser(newUser.getForename(), newUser.getSurname(), newUser.getEmail());
		System.out.println("fin");
	}
}
