package restAssured.herokuappwithchaining;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class GetAllBookings {
	@Test
	public void getAllBookings() {
		RestAssured.baseURI="https://restful-booker.herokuapp.com/booking";
		Response response = RestAssured.given()
				.contentType(ContentType.JSON)
				.when()
				.get("booking");
	}

}
