package restAssured.herokuappwithchaining;



import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class DeleteBooking extends BaseClass{
	
	
	

	
	@Test(dependsOnMethods = {"chaining.UpdateBooking.updateBooking"})
	public void deleteBooking() {
		//RestAssured.baseURI="https://restful-booker.herokuapp.com/booking";
		Response response = RestAssured.given()
				.contentType(ContentType.JSON)
				.cookie(Token)
				.delete("BookingID");
		System.out.println(response.getStatusCode());
		
	}

}
