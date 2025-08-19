package APIAutomation;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.json.simple.JSONObject;
import org.openqa.selenium.devtools.v136.fetch.model.AuthChallengeResponse;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.http.HttpResponse;

public class GetAPI
{
    @Test
    public void VerifyGetAPI()
    {
        RestAssured.baseURI = "https://reqres.in/api/users?page";
        JSONObject jsondata= new JSONObject();
        
        Response response = RestAssured
                .given()
                .log()
                .all()
                .contentType(ContentType.JSON)
                .when()
                .log()
                .all()
                .get("/2")
                .then()
                .log()
                .all()
                .extract().
                response();
        Assert.assertEquals(response.statusCode(), HttpStatus.SC_OK);

    }
}
