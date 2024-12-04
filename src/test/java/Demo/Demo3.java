package Demo;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Demo3 {
	@Test
	public void user() {
		// Create a reference for Response interface
		Response response;
		// Make a request to the server by specifying the method Type and the method
		// URL.
		// This will return the Response from the server. Store the response in a
		// reference variable created above.
		response = RestAssured.get("https://jsonplaceholder.typicode.com/users");
		// to get last received session id from the server and print the value returned
		String id = response.getSessionId();
		System.out.println("Session ID: " + id);
		// to get the value of the content-type header field and print the value
		// returned
		String contentType = response.getContentType();
		System.out.println("Content-Type value: " + contentType);
	}
}