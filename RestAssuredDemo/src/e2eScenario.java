import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

import files.Payload;


public class e2eScenario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestAssured.baseURI = "http://restapi.adequateshop.com";
		
		//post
		
		//Payload obj = new Payload();
		given().header("Content-Type","application/json")
		.body(Payload.AddPayload())
		.when().post("/api/Tourist").then().log().all();

	}

}