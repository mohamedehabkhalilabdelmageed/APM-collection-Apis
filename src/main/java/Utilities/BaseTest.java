package Utilities;

import EndPoints.Authentication;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static org.apache.http.impl.auth.BasicScheme.authenticate;

public class BaseTest {


    public static String generateAuthToken(){

      String AuthToken = Authentication.authentication().jsonPath().getString("access_token");
      return AuthToken;
    }

    public static Response postWithAuth(String endpoint , Object data){
        Response response;
        response = given().log().all()
                .header("Authorization", "Bearer " + generateAuthToken())
               // .header("Authorization",generateAuthToken() )
                .header("Content-Type", "application/json")
                .body(data)
                .post(endpoint).then().log().all().extract().response();

        return response;
    }
    public static Response GetWithAuth(String endpoint){
        Response response=  given().log().all()
                .header("Authorization", "Bearer " + generateAuthToken())
                //  .header("Authorization",generateAuthToken() )
                .header("Content-Type", "application/json")
              //  .body(data)
                .get(endpoint).then().log().all().extract().response();
        return response;
    }
}
