package restAssured.herokuappwithchaining;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PartialUpdate extends BaseClass {
	
	@Test(dependsOnMethods = {"chaining.GetBookingID.getBookingID"})
	public void partialUpdate() {
		File file = new File("./data/partialupdate.json");
		Response response = RestAssured.given()
				.contentType(ContentType.JSON)
				.when()
				.body(file)
				.patch("BookingID");
		
	}

}
