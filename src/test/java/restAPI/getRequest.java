
package restAPI;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class getRequest {

	@Test
	public void test1() {
		RestAssured.baseURI = "http://localhost:3000/";
		// object of this class
		// in the given() I want to send the request

		// Request
		RequestSpecification request = RestAssured.given();
		// Response
		Response response = request.get("employees");
		// Output display
		System.out.println(response.getBody().asString());

		int responseCode = response.getStatusCode();
		Assert.assertEquals(201, responseCode);
		System.out.println(response.getStatusCode());

	}

}
