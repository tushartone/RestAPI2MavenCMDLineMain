package files;

import static io.restassured.RestAssured.given;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class ReusableMethods {
		
	public static String getJiraAPISessionID()
	{
		
		RestAssured.baseURI="http://localhost:8089";
		
		Response resp = given().
							contentType(ContentType.JSON).
							body("{ \r\n" + 
									"	\"username\": \"tushartone\",\r\n" + 
									"	\"password\": \"Tushar@1993\"\r\n" + 
									"}").
							when().
							post("/rest/auth/1/session").
							then().statusCode(200).
							extract().response();
		String respData=resp.asString();
		
		JsonPath jsonPath = new JsonPath(respData);
		String sessionID = jsonPath.get("session.value");
		System.out.println("Session id is"+sessionID);
		return sessionID;
	}
}
