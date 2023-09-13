package restAssured.herokuappwithLombok;

import org.testng.annotations.BeforeMethod;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class BaseClass {
	
	public static String baseUri = "https://restful-booker.herokuapp.com";
	public static String tokenResponse;
	public static String FinalToken;
	public static int bookingId;
	public static String updatedFirstName;
	public static String bookingRequest;
	
	
	@BeforeMethod
	public void setUp()
	{
		RestAssured.baseURI=baseUri;
		RestAssured.authentication = RestAssured.preemptive().basic("admin", "password123");

		
	}

}
