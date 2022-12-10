
package restAPI;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class getRequestAllEmployees {

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
		// System.out.println(response.getBody().asString());
		
		
		
		
		
		// jsonPath with for loop
		JsonPath jpath = response.jsonPath();
		List<String> names = jpath.get("name");
		List<String> salary = jpath.get("salary");

		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i) + " " + "Salary is " + salary.get(i));

		}
		
		List<List<String>> allData = jpath.get();
		System.out.println("The name is :" + names.get(0));
	}

}
