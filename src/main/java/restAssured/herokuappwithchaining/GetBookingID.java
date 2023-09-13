package restAssured.herokuappwithchaining;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class GetBookingID extends BaseClass{
	
	
	@Test(dependsOnMethods = {"chaining.CreateBooking.createBooking"})
	public void getBookingID() {
		Response response = RestAssured.given()
				.contentType(ContentType.JSON)
				.get("BookingID");
		
	}

}
