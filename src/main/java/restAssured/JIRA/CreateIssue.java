package restAssured.JIRA;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class CreateIssue extends BaseAPI{
	
	@Test
	public void createIssue() {
		//RestAssured.baseURI="https://testjirafeb2023.atlassian.net/rest/api/2/issue/";
		//RestAssured.authentication=RestAssured.preemptive().basic("Feb2023restAPI@gmail.com", "ATATT3xFfGF0d39TsozfFQWR0Hvr0UfPqKKtyFJxQvnaGGtSvez8FvOvhfzSTapOBEUGx0ZAdIbWfM5tjeU8rFw7Rh72pbanmBdYhtysnC3yH89HMn-lXz9PTGKVKtWFV2vp6GyZ_75P27LqLCAbHxqOjYds1SNn5oFZQFDi3ufeUI3cJwdCy20=5543D93F");
		File file = new File("./data/createissue.json");
		Response response = RestAssured.given()
				.contentType(ContentType.JSON)
				.when()
				.body(file)
				.post();
		response.prettyPrint();
		IssueID = response.jsonPath().get("id");
		System.out.println(IssueID);
		
		
		
		
	}

}
