package restApiBDD;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

//Class
public class getRequest {

	// Method
	@Test
	public void test1() {

		RestAssured.given()
		.baseUri("http://localhost:3000")
		.when()
		.get("employees")
		.then().log()
				// .all()
		.body().statusCode(200);

	}

	@Test
	public void test2() {

		RestAssured.given()
		.baseUri("http://localhost:3000")
		.when().get("employees")
		.then().log().body()
		.statusCode(200)
		.body("[0].name", Matchers.equalTo("Harsha"));
	}
	@Test
	public void test3() {

		RestAssured.given()
		.baseUri("http://localhost:3000")
		.when().get("employees")
		.then().log().body()
		.statusCode(200)
		.body("[2].name", Matchers.equalTo("Krystyna"));
	}

}
