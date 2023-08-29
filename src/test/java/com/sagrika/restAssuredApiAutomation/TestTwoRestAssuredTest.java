package com.sagrika.restAssuredApiAutomation;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class TestTwoRestAssuredTest {
	
	
	private static String requestBody = "{\"userId\":1,\"id\":1,\"title\":\"sunt aut facere repellat provident occaecati excepturi optio reprehenderit\",\"body\":\"quia et suscipit\\nsuscipit recusandae consequuntur expedita et cum\\nreprehenderit molestiae ut ut quas totam\\nnostrum rerum est autem sunt rem eveniet architecto\",\"name\":\"into\"}";
  
	@BeforeTest
	public static void setup() {
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com/";
    }
	
	@Test
  public void testPut() {
		
		Response response = RestAssured.given()
									.header("Content-Type", "application/json")
									.body(requestBody)
									.when()
									.put("posts/1")
									.then()
									.extract()
									.response();
		
		assertEquals(200, response.statusCode());
		assertEquals("into", response.jsonPath().getString("name"));
  }
}
