package restAssured.herokuappwithchaining;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class CreateBooking extends BaseClass {
	
	@Test
	public void createBooking() {
		//RestAssured.baseURI="https://restful-booker.herokuapp.com/booking";
		File file = new File("./data/createincident.json");
		Response response = RestAssured.given()
				.contentType(ContentType.JSON)
				.when()
				.body(file)
				.post();
		response.prettyPrint();
		System.out.println(response.contentType());
		System.out.println(response.getStatusCode());
		BookingID = response.jsonPath().get("bookingid");
		System.out.println(BookingID);
		
				
	}

}
