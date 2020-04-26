package apiTestDemo;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class test1 {
  @Test
  public void getApiResponse() {
	  //specify base URI
	  RestAssured.baseURI="https://reqres.in";
	  //request object
	  RequestSpecification httprequest=RestAssured.given();
	  //response object
	  Response response=httprequest.request(Method.GET,"/api/users/2");
	  //print response on console
	  String responseBody = response.getBody().asString();
	  System.out.println("response body is"+responseBody);
	  //status code validation
	  int statusCode = response.getStatusCode();
	  System.out.println(statusCode);
	  assertEquals(statusCode,200);
	  
	 
  }
}
