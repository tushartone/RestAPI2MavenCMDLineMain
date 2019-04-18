package files;

public class Payload {

	
	public static String payloadData()
	{
		String payload = "{\r\n" + 
				"      \"id\": \"22\",\r\n" + 
				"      \"title\": \"json-server\",\r\n" + 
				"      \"author\": \"typicode\"\r\n" + 
				"    }";
		return payload;
	}
	
	public static String createJiraPayloadData()
	{
		String createJiraData="{\r\n" + 
				"    \"fields\": {\r\n" + 
				"        \"project\": {\r\n" + 
				"            \"key\": \"JIR\"\r\n" + 
				"        },\r\n" + 
				"        \"summary\": \"Credit card isssue\",\r\n" + 
				"        \"description\":\"Creating first thorugh automation script\",\r\n" + 
				"        \"issuetype\": {\r\n" + 
				"            \"name\": \"Bug\"\r\n" + 
				"        }\r\n" + 
				"    }\r\n" + 
				"}";
		return createJiraData;
	}
	
	public static String createCommentPayloadData()
	{
		String commentData = "{\r\n" + 
				"    \"body\": \"Hey,I added the comment through automation script\",\r\n" + 
				"    \"visibility\": {\r\n" + 
				"        \"type\": \"role\",\r\n" + 
				"        \"value\": \"Administrators\"\r\n" + 
				"    }\r\n" + 
				"}";
		return commentData;
	}
	
	
}
