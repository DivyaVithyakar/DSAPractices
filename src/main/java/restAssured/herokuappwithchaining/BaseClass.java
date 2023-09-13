package restAssured.herokuappwithchaining;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class BaseClass {
	
	public int BookingID;
	public String Token;
	
	@BeforeMethod
	public void base() {
		RestAssured.baseURI="https://restful-booker.herokuapp.com/booking";
		
	}
	
	@Test
	public void createToken() {
		RestAssured.baseURI="https://restful-booker.herokuapp.com/auth";
		Response response = RestAssured.given()
				.contentType(ContentType.JSON)
				.when()
				.body("{\n"
						+ "    \"username\" : \"admin\",\n"
						+ "    \"password\" : \"password123\"\n"
						+ "}")
				.post();
		Token = response.jsonPath().get("token");
		
		
	}
	
	

}
