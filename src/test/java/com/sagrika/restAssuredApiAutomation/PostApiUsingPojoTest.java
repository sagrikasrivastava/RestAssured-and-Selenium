package com.sagrika.restAssuredApiAutomation;

import static io.restassured.RestAssured.given;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class PostApiUsingPojoTest {

    private static String requestBody = "{\n" +
            "  \"title\": \"bax\" \n}";

    @BeforeTest
    public static void setup() {
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
    }

    @Test
    public void patchRequest() {
        Response response = given()
                .header("Content-type", "application/json")
                .and()
                .body(requestBody)
                .when()
                .patch("/posts/1")
                .then()
                .extract().response();

        	int statusCode = response.getStatusCode();
        	if (statusCode == 200) {
        		System.out.println("response body: " +response.getBody().asString());
        	}
        	else {
        		
        		System.out.println("response failed with error code: "+response.getStatusCode() );
        	}
        	
//        Assert.assertEquals("bax", response.jsonPath().getString("title"));
//        Assert.assertEquals("1", response.jsonPath().getString("userId"));
//        Assert.assertEquals("1", response.jsonPath().getString("id"));
    }
}
