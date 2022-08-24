package files;

import java.util.Random;

public class Payload {
	
	public static String Email() {

		String emailTemp = "@gmail.com";
		Random rand = new Random();
		int x = rand.nextInt(1000);
		String partialEmail = "man" + x;
		String finalEmail = partialEmail + emailTemp;
		return finalEmail;
	}

	public static String AddPayload() {
		return "{\r\n" + "\r\n" + "                \"tourist_name\": \"Mike\",\r\n"
				+ "                \"tourist_email\": \""+Email()+"\",\r\n"
				+ "                \"tourist_location\": \"Paris\"\r\n" + "}";
	}

}
