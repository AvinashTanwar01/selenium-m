package restassured;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class getreq {
	public static void main(String[] args) {
		RestAssured.baseURI="https://reqres.in";
		String end= "/api/users";
		String apiKey= "reqres-free-v1";
		
		Response response = RestAssured
				.given().relaxedHTTPSValidation()
				.auth().oauth2(apiKey).when().get(end).then().extract().response();
		
		int code= response.statusCode();
		System.out.println(code);
		String sli=response.statusLine();
		System.out.println(sli);
		String bd=response.getBody().asPrettyString();
		System.out.println(bd);		
	}

}
