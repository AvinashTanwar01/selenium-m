package restassured;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Githubapi {
	public static void main(String[] args) {
		RestAssured.baseURI="https://api.github.com";
		String token ="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";
		String ep2 ="/users/AvinashTanwar01/repos";
		String line = statusline1(token,ep2);
		String reponm= "{\"repomame\":\"testrepo\",\"id\":\"657\"}";
		
		
//		
//		Response response =

		
		String res = RestAssured.given().relaxedHTTPSValidation().header("Authentication","Bearer "+token ).get(ep2).statusLine();
//		Response response = (Response) RestAssured.given().relaxedHTTPSValidation().header("Authentication","Bearer "+token ).get(ep2).then().extract().response().getBody()	;	
		int res1 = RestAssured.given().relaxedHTTPSValidation().header("Authentication","Bearer "+token ).get(ep2).statusCode();
		String res2 = RestAssured.given().relaxedHTTPSValidation().header("Authentication","Bearer "+token ).get(ep2).getBody().asPrettyString();
//		System.out.println("linbe"+res);
//		System.out.println("body"+response);
//		System.out.println(res1);
		System.out.println(res2);
		
		
	}
	
	private static String statusline1(String token, String ep2) {
		// TODO Auto-generated method stub
		return null;
	}

	public String statusLine1(String token,String ep2) {
		String res = RestAssured.given().relaxedHTTPSValidation().header("Authentication","Bearer "+token ).get(ep2).statusLine();
		return res;
	}

}
