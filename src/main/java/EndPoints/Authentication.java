package EndPoints;

import Configuration.Config;
import Utilities.Constant;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.json.JSONObject;

public class Authentication {

    public static Response authentication() {
        return RestAssured.given().log().all()
                .header("Content-Type", "application/x-www-form-urlencoded")
                .formParam("grant_type", Constant.grantType)
                .formParam("client_id",Constant.clientId)
                .formParam("client_secret",Constant.clientSecret)
               .post(Config.BaseUrl+Config.GenerateMerchantToken );
    }

}
