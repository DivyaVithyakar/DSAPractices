package restAssured.JIRA;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class DeleteIssue extends BaseAPI{
	
	@Test(dependsOnMethods = {"jira.Updateissue.updateIssue"})
	public void deleteIssue() {
		
		//RestAssured.baseURI="https://testjirafeb2023.atlassian.net/rest/api/2/issue/";
		//RestAssured.authentication=RestAssured.preemptive().basic("Feb2023restAPI@gmail.com", "ATATT3xFfGF0d39TsozfFQWR0Hvr0UfPqKKtyFJxQvnaGGtSvez8FvOvhfzSTapOBEUGx0ZAdIbWfM5tjeU8rFw7Rh72pbanmBdYhtysnC3yH89HMn-lXz9PTGKVKtWFV2vp6GyZ_75P27LqLCAbHxqOjYds1SNn5oFZQFDi3ufeUI3cJwdCy20=5543D93F");
		Response response = RestAssured.given()
				.contentType(ContentType.JSON)
				.when()
				.delete("IssueID");
				
		
	}

}
