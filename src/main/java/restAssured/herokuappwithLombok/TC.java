package restAssured.herokuappwithLombok;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;



public class TC extends BaseClass{
	
	
	@Test(priority = 1)
    public void createBooking() {
        BookingRequest bookingRequest = new BookingRequest();
        bookingRequest.setFirstname("Divya");
        bookingRequest.setLastname("Vithya");
        bookingRequest.setTotalprice(100);
        bookingRequest.setDepositpaid(true);

        BookingRequest.BookingDates bookingDates = new BookingRequest.BookingDates();
        bookingDates.setCheckin("2023-09-15");
        bookingDates.setCheckout("2023-09-20");
        bookingRequest.setBookingdates(bookingDates);

        bookingRequest.setAdditionalneeds("drinks added");

        Response response = RestAssured.given()
        		.contentType(ContentType.JSON)
                .body(bookingRequest)
                .when()
                .log().all()
                .post("/booking");
        

        bookingId = response.jsonPath().getInt("bookingid");
        System.out.println(bookingId);
        Assert.assertEquals(response.getStatusCode(), 200);
    }
	
	
	@Test(priority = 2, dependsOnMethods = "createBooking")
    public void getBookingDetails() {
 

     
		Assert.assertNotNull(bookingId, "Booking ID should not be null");

        Response response =  RestAssured.given()
        		.contentType(ContentType.JSON)
				.log().all()
        		.get("/booking/" + bookingId);
        response.then().log().all();
        	    

      
        BookingResponse bookingResponse = response.as(BookingResponse.class);
        response.then().assertThat().statusCode(200);
        String getFirstname = bookingResponse.getBooking().getFirstname();
        Assert.assertEquals(getFirstname, "Divya");
     
       
      
       
    }
	
	@Test(priority = 3 ,dependsOnMethods = "getBookingDetails")
	public void createToken() {
		TokenRequest tokenRequest = new TokenRequest();
        tokenRequest.setUsername("admin");
        tokenRequest.setPassword("password123");

        Response tokenRes = RestAssured.given()
					.contentType(ContentType.JSON)
					.body(tokenRequest)
					.log().all()
					.post("auth");

        TokenResponse tokenResponse = tokenRes.getBody().as(TokenResponse.class);
        FinalToken = tokenResponse.getToken();
        System.out.println(FinalToken);

		
		
	}
	
	 @Test(priority = 4, dependsOnMethods = "createToken")
	    public void updateBooking() {
	       
	        Assert.assertNotNull(bookingId, "Booking ID should not be null");

	       
	        BookingUpdateRequest bookingUpdateRequest = new BookingUpdateRequest();
	        bookingUpdateRequest.setFirstname("Divya");
	        bookingUpdateRequest.setLastname("Ram");
	        bookingUpdateRequest.setTotalprice(200); 
	        bookingUpdateRequest.setDepositpaid(true); 

	        BookingUpdateRequest.BookingDates bookingDates = new BookingUpdateRequest.BookingDates();
	        bookingDates.setCheckin("2023-09-22");
	        bookingDates.setCheckout("2023-09-25");
	        bookingUpdateRequest.setBookingdates(bookingDates);

	        bookingUpdateRequest.setAdditionalneeds("wine added for dinner");

	        
	        Response response = RestAssured.given()
	        		.basePath("booking/"+bookingId)
	        		.contentType(ContentType.JSON)
	        		.cookie(FinalToken)
	        		.body(bookingUpdateRequest)
	        		.log().all()
	        		.put();

	       

	       
	        BookingUpdateResponse bookingUpdateResponse = response.as(BookingUpdateResponse.class);
	        String additionalneeds = bookingUpdateResponse.getBooking().getAdditionalneeds();
	        Assert.assertEquals(additionalneeds, "wine added for dinner");
	        System.out.println(additionalneeds);

	    }
	 
	 
	
	
	@Test(priority = 5, dependsOnMethods = "updateBooking")
    public void partialUpdateBooking() {
       
        Assert.assertNotNull(bookingId, "Booking ID should not be null");

      
        PartialUpdateRequest partialUpdateRequest = new PartialUpdateRequest();
        partialUpdateRequest.setFirstname("test");

       
        Response response = RestAssured.given()
        		.basePath("booking/"+bookingId)
        		.contentType(ContentType.JSON)
        		.cookie(FinalToken)
        		.body(partialUpdateRequest)
        		.log().all()
        		.patch();

       

        
        PartialUpdateResponse partialUpdateResponse = response.as(PartialUpdateResponse.class);

        
        String updatedFirstname = partialUpdateResponse.getFirstname();
        Assert.assertEquals(updatedFirstname, "test");
    }
	
	
	
	 @Test(priority = 7, dependsOnMethods = "partialUpdateBooking")
	    public void deleteBooking() {
	       
	        Assert.assertNotNull(bookingId, "Booking ID should not be null");

	        
	        Response response = RestAssured.given()
					   .contentType(ContentType.JSON)
					   .cookie(FinalToken)
	        		   .delete("/booking/" + bookingId);
	        
	        Response getResponse = RestAssured.given()
	        		.basePath("booking/"+bookingId)
	        		.contentType(ContentType.JSON)
	        		.get("/booking/" + bookingId);
	        getResponse.then().assertThat().statusCode(404);
	      

	      
	    }


	
}
