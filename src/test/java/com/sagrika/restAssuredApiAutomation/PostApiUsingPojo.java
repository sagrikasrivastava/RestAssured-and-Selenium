package com.sagrika.restAssuredApiAutomation;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PostApiUsingPojo {

	public static void main(String[] args) {
		List<String> skill = new ArrayList<String>();
		skill.add("Java");
		skill.add("C");
		EmployeePojo ep = new EmployeePojo("morpheus", "leader", skill, "xyz", "morpheus@xyz.com");
								Response postResponse= given()
									.auth()
									.none()
									.header("Content-Type", "application/json")
									.contentType(ContentType.JSON)
									.when()
									.body(ep)
									.log()
									.all().post("https://reqres.in/api/users");
								
								System.out.println(postResponse.getHeaders());
								System.out.println(postResponse.getHeader(DEFAULT_BODY_ROOT_PATH));
								
								
								
//								Assert.assertEquals(postResponse.jsonPath().get("name"), "morpheus");
//								Assert.assertEquals(postResponse.jsonPath().get("job"), "leader");
//								Assert.assertEquals(postResponse.jsonPath().get("skills[0]"), "Java");
//								Assert.assertEquals(postResponse.jsonPath().get("skills[1]"), "C");
//								Assert.assertEquals(postResponse.jsonPath().get("details.companyName"), "xyz");
//								Assert.assertEquals(postResponse.jsonPath().get("details.emailId"), "morpheus@xyz.com");
								
								
								
//								Assert.assertEquals(postResponse.getBody().path("name"), "morpheus");
//								Assert.assertEquals(postResponse.getBody().path("job"), "leader");
//								Assert.assertEquals(postResponse.getBody().path("skills[0]"), "Java");
//								Assert.assertEquals(postResponse.getBody().path("skills[1]"), "C");
//								Assert.assertEquals(postResponse.getBody().path("details.companyName"), "xyz");
//								Assert.assertEquals(postResponse.getBody().path("details.emailId"), "morpheus@xyz.com");
//				
								
								
//									.then()
//									.log()
//									.all()
//									.body("name", equalTo("morpheus"),
//											"job", equalTo("leader"),
//											"skills[0]", equalTo("Java"),
//											"skills[1]", equalTo("C"), 
//											"details.companyName", equalTo("xyz"),
//											"details.emailId", equalTo("morpheus@xyz.com"));

	}

}
