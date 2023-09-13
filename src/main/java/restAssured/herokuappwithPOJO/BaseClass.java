package restAssured.herokuappwithPOJO;

import org.testng.annotations.BeforeMethod;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class BaseClass {
	
	public static String baseUri = "https://restful-booker.herokuapp.com";
	public static String tokenRes;
	public static int bookingId;
	public static Response resp;
	public static String firstname;
	
	@BeforeMethod
	public void setUp()
	{
		RestAssured.baseURI=baseUri;
		RestAssured.authentication = RestAssured.preemptive().basic("admin", "password123");

		
	}

}
