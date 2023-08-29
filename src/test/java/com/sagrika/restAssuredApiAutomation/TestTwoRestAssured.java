package com.sagrika.restAssuredApiAutomation;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class TestTwoRestAssured {

	
	@BeforeTest 
	public void testBefore () {
		
		RestAssured.baseURI= "https://jsonplaceholder.typicode.com/";
		
	}
	
	@Test
	public void testData () {
		
		Response response=  RestAssured.given()
												.contentType(ContentType.JSON)
												.when()
												.get("posts1/1")
												.then()
												.extract()
												.response();
		
		int statusCode = response.getStatusCode();
    	if (statusCode == 200) {
    		System.out.println("response body: " +response.getBody().asString());
    	}
    	else {
    		
    		System.out.println("response failed with error code: "+response.getStatusCode() );
    	}
	}
	
	
}
