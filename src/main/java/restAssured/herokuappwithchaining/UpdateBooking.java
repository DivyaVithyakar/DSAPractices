package restAssured.herokuappwithchaining;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class UpdateBooking extends BaseClass{
	
	
	
	
	
	
	
	
	@Test(dependsOnMethods = {"chaining.PartialUpdate.partialUpdate"})
	public void updateBooking() {
		//RestAssured.baseURI="https://restful-booker.herokuapp.com/booking";
		File file = new File("./data/updatebooking.json");
		Response response = RestAssured.given()
				.contentType(ContentType.JSON)
				.cookie(Token)
				.when()
				.body(file)
				.put("BookingID");
		
	}

}
