package test;

import static io.restassured.RestAssured.given;

import org.junit.Test;

public class ApiTest {
	
	@Test
	public void validaStatusCode() {
		given()
		.when()
		.get("https://reqres.in/api/users?page=2").then().statusCode(200);
	}
}
