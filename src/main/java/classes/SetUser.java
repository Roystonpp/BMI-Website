package classes;

public class SetUser {
	
	private String Forename;
	private String Surname;
	private String Email;

public void setUser() 
	{

	this.Forename = Forename;
	this.Surname = Surname;
	this.Email = Email;
	
	}

public void setForename(int i, String Forename) {
	this.Forename = Forename;
	}

public String getForename() {
	return Forename;
	}

public void setSurname(int i, String Surname) {
	this.Surname = Surname;
    }

public String getSurname() {
    return Surname;
    }

public void setEmail(int i, String Email) {
    this.Email = Email;
    }

public String getEmail() {
	return Email;
}
}

