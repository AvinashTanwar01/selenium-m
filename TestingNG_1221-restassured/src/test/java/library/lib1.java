package library;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class lib1 {
    String token = "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";
   

    public lib1() {
        RestAssured.baseURI = "https://api.github.com";
    }
    public Response deleteRepo() {
        String repoNM = "{\n" +
                " \"name\": \"restassured-demo2\",\n" +
                " \"description\": \"Created using Github Rest Api\",\n" +
                " \"private\": false\n" +
                "}";

        return RestAssured.given()
        		.relaxedHTTPSValidation()
                .header("Authorization", "Bearer " + token)
                .when()
                .delete("/repos/AvinashTanwar01/restassured-demo1");
    }


    public int deleteRepoStatusCode() {
        return deleteRepo().statusCode();
    }

    public String deleteRepoStatusLine() {
        return deleteRepo().statusLine();
    }

    public String deleteRepoResponseBody() {
        return deleteRepo().getBody().asPrettyString();
    }




}
