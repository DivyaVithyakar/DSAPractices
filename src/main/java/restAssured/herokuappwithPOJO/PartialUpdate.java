package restAssured.herokuappwithPOJO;

public class PartialUpdate {
	
	private String firstname;
	private String lastname;
	
	public PartialUpdate(String firstname, String lastname)
	{
		this.firstname = firstname;
		this.lastname = lastname;
	}

	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}

}
