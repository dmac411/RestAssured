package restAPI;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class deleteRequest {
	
	@Test
	public void test1() {
		
		RestAssured.baseURI = "http://localhost:3000";
		
		RequestSpecification request = RestAssured.given();
		
		Response response = request.delete("employees/9");
		
		int responseCode = response.getStatusCode();
		Assert.assertEquals(200, responseCode);
			
	}

}

