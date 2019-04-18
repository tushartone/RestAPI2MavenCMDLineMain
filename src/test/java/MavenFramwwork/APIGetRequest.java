package MavenFramwwork;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
//import static org.hamcrest.Matchers.equalTo;
public class APIGetRequest {
	
	
	@Test
	public void getPlaceAPI()
	{
		RestAssured.baseURI="";
		
RestAssured.baseURI="https://maps.googleapis.com";
		
		given().
		       param("location","-33.8670522,151.1957362").
		       param("radius","500").
		       param("key","AIzaSyDXTG_wxsWZVkolHtmK_FZ4M5r_c_rrriA").
		       when().
		       get("/maps/api/place/nearbysearch/json").
		       then().assertThat().statusCode(200).and().contentType(ContentType.JSON).and().
		       header("Server", "scaffolding on HTTPServer2");
	}

}
