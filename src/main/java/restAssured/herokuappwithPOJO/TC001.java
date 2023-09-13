package restAssured.herokuappwithPOJO;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class TC001 extends BaseClass{
	
	@Test (dependsOnMethods = {"ping"})
	public void generateToken() 
	{
		
		ReqCreateToken token = new ReqCreateToken("admin", "password123");
		ResToken ResponseToken = new ResToken(tokenRes);
		Response tokenRes = RestAssured.given()
				   					.contentType(ContentType.JSON)
				   					.body(token)
				   					.log()
				   					.all()
				   					.post("auth");
		tokenRes.jsonPath().prettyPrint();
		tokenRes = tokenRes.jsonPath().get("token");
		//Assert.assertEquals(statusCode, 200);	
		
		
		ResToken ResToken = tokenRes.getBody().as(ResToken.class);
		String FinalToken = ResToken.getToken();
		System.out.println(FinalToken);
	}
	
	@Test
	public void ping()
	{
		Response getResponse = RestAssured.given()
				        .contentType(ContentType.JSON)
						.get("ping");
		getResponse.prettyPrint();
		getResponse.then().assertThat().statusCode(201);
	}
	
	
	
	
	@Test (dependsOnMethods = {"generateToken"})
	public void createBooking()
	{
		
		ReqBookingDates bookingdate = new ReqBookingDates("2023-08-03", "2024-08-20");
		ReqBookingBody createbooking = new ReqBookingBody("Divya", "Ramanujam", 555, true,bookingdate ,"Wine Added");
		
		Response ResCreate = RestAssured.given()
				.accept(ContentType.JSON)
				.contentType(ContentType.JSON)
				.body(createbooking)
				.log().all()
				.post("booking");
					
		ResCreate.jsonPath().prettyPrint();
		
		ResCreate.then().assertThat().statusCode(200);
		bookingId = ResCreate.jsonPath().getInt("bookingid");
		
		ReqBookingIDS bookingResponse = ResCreate.getBody().as(ReqBookingIDS.class);
		int bookid = bookingResponse.getBookingid();
		
	}
	
	
	@Test (dependsOnMethods = {"createBooking"})
	public void getBookingIds()
	{
		Response getBookingIDResponse = RestAssured.given()
				.contentType(ContentType.JSON)
				.log().all()
				.get("booking");
		getBookingIDResponse.jsonPath().prettyPrint();
		getBookingIDResponse.then().assertThat().statusCode(200);
		
		ResBookingIDS[] bookingIds = getBookingIDResponse.getBody().as(ResBookingIDS[].class);
		
		int length = bookingIds.length;
		
		System.out.println("Booking id is:"+ bookingIds[5].getBookingid());
		
	}
	
	@Test (dependsOnMethods = {"createBooking"})
	public void getBooking()
	{
		Response response = RestAssured.given()
									   .basePath("/booking/" + bookingId)
									   .contentType(ContentType.JSON)
									   .log().all()
									   .get();
		
		ReqBookingBody getresponse =  response.getBody().as(ReqBookingBody.class);
		
		Assert.assertEquals(firstname,getresponse.getFirstname());
		
		
	}
	
	@Test (dependsOnMethods = {"createBooking"})
	
	public void updateBooking()
	{
		String lastname = "Ram"; int totalprice = 1000000;
		String updatedDate = "2023-09-23";
		ReqBookingDates bookingdates = new ReqBookingDates(updatedDate, "2023-09-23");
		ReqBookingBody createbooking = new ReqBookingBody("Divya",lastname,totalprice,true,bookingdates,"Cocktail added");
				
		Response updateresponse = RestAssured.given()
								  .basePath("/booking/" + bookingId)
								  .contentType(ContentType.JSON)
					              .cookie("token=" + tokenRes)
					              .body(createbooking)
					              .log().all()
					              .put();
		
		updateresponse.jsonPath().prettyPrint();		
		ReqBookingBody putResp = updateresponse.getBody().as(ReqBookingBody.class);
		String checkin = putResp.getBookingdates().getCheckin();
		
		Assert.assertTrue(putResp.getLastname().equals(lastname), "Last Name not match");
		Assert.assertTrue(putResp.getTotalprice()==totalprice, "Price not match");
		Assert.assertEquals(checkin, "2023-09-23");
		Assert.assertTrue(putResp.getBookingdates().getCheckin().equals(updatedDate), "Date not match");
		updateresponse.then().assertThat().statusCode(200);
	}
	@Test(dependsOnMethods = {"updateBooking"})
	public void partialUpdate()
	{
		PartialUpdate resPatch = new PartialUpdate("Vithyakar", "Divya");
		Response ResPatch = RestAssured.given()
									.basePath("booking/"+bookingId)
									.accept("application/json")
									.contentType("application/json")
									.cookie("token="+tokenRes)
									.body(resPatch)
									.log()
									.all().patch();								
		ResPatch.then().assertThat().statusCode(200);
		ReqBookingBody PatchRes = ResPatch.getBody().as(ReqBookingBody.class);
		Assert.assertTrue(PatchRes.getFirstname().equals("Vithyakar"), "Name not matched");
		Assert.assertTrue(PatchRes.getLastname().equals("Divya"), "LastName not matched");
		
	}
	
	@Test (dependsOnMethods = {"partialUpdate"})
	public void deleteBooking()
	{
		
		Response resdelete = RestAssured.given()
				   .contentType(ContentType.JSON)
				   .cookie("token=" + tokenRes)
				   .delete("booking/" + bookingId);
		
		resdelete.then().assertThat().statusCode(201);
		
		
		
	}
	

}
