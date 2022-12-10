package restApiBDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

//Class
public class getRequestSingleEmployee {

	// Method
	@Test
	public void test1() {

		RestAssured.given()
		.baseUri("http://localhost:3000")
		.when().get("employees/5")
		.then()
		.log()
		.body()
		.statusCode(200);

	}

}
