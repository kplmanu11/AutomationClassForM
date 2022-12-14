import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RestAssured.baseURI ="http://restapi.adequateshop.com";
		
		//given  -> prerequisites
		//when    -> action to be perfomed
		//then   -> post conditions/results
		
		given().log().all().header("Content-Type","application/json").body("{\r\n"
				+ "\r\n"
				+ "                \"tourist_name\": \"Mike\",\r\n"
				+ "                \"tourist_email\": \"mand543@gmail.com\",\r\n"
				+ "                \"tourist_location\": \"Paris\"\r\n"
				+ "}")
		
		.when().post("/api/Tourist").then().log().all();

	}
}
