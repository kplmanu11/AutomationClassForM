import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;

import files.Payload;


public class e2eScenario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestAssured.baseURI = "http://restapi.adequateshop.com";
		
		//post
		
		//Payload obj = new Payload();
		String response = given().header("Content-Type","application/json")
		.body(Payload.AddPayload())
		.when().post("/api/Tourist").then().log().all().extract().response().asString();
		
		JsonPath obj = new JsonPath(response);
		String tEmail = obj.getString("tourist_email");
		int id = obj.getInt("id");
		
		System.out.println(tEmail);
		System.out.println(id);
		
		//PUT
	//	String updatedEmail = "thr123@gmail.com";
		given().header("Content-Type","application/json").queryParam("id", id)
		.body(Payload.UpdatePayload(id))
		.when().put("/api/Tourist").then().log().all();
		
		
		
		//GET
		
		given().queryParam("id", id)
		.when().get("/api/tourist").then().log().all().statusCode(200);

	}

}
