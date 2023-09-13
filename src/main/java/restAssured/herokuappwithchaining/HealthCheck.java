package restAssured.herokuappwithchaining;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class HealthCheck {
	
	@Test
	public void healthCheck() {
		RestAssured.baseURI="https://restful-booker.herokuapp.com/ping";
		Response response = RestAssured.given()
				.get();
	}

}
