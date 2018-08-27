package classes;

public class main {

	public static void main(String[] args) {
		connect connection = new connect();
		connection.userconnection();
		
		User newuser = new User();
		newuser.addNewUser("iftik", "khan", "email1@gmail.com");
		System.out.println("fin");
	}

}
