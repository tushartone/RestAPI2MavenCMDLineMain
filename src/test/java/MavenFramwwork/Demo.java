//Create the new API request

package MavenFramwwork;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
//import static org.hamcrest.Matchers.equalTo;
public class Demo {
	
	@Test
		public void createPlaceAPI()
		{
			RestAssured.baseURI="http://localhost:3000";
			Response resp = given().
			body("{\r\n" + 
					"      \"id\": 14,\r\n" + 
					"      \"title\": \"json-server\",\r\n" + 
					"      \"author\": \"typicode\"\r\n" + 
					"    }").
			when().contentType(ContentType.JSON).
			post("/posts").
			then().
			extract().response();
			System.out.println("resp as"+resp.asString());
			System.out.println(resp.getStatusCode());
	}
		
	}


