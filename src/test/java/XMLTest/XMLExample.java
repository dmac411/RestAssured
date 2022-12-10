package XMLTest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.internal.path.xml.NodeChildrenImpl;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

// this will give you the xml response data
public class XMLExample {

	@Test
	public void test1() {

		RestAssured.baseURI = "https://chercher.tech/sample/api/books.xml";
		RequestSpecification request = RestAssured.given();

		Response response = request.get();

		System.out.println(response.body().asString());

		// this line imports your xml nodes 
		NodeChildrenImpl AllBooks = response.then().extract().path("bookstore.book.title");

		System.out.println("First book is " + AllBooks.get(0));
		System.out.println("Second book is " + AllBooks.get(1));
		System.out.println(AllBooks);
		System.out.println("First book language is " + AllBooks.get(0).getAttribute("lang"));
		System.out.println("First book language is " + AllBooks.get(1).getAttribute("lang"));
		
		// List<String> AllBooks =
		// response.then().extract().path("boostore.book.title");
		// return as list
	}

}
