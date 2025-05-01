package restAssured;

//https://poojamegh123-trials7161.orangehrmlive.com
//Username: Admin
//Password: Xw84DNaqU@

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class LoginTestWithRestAssured {

    RequestSpecBuilder requestSpecBuilder;
    String csrfToken;
    Map<String, String> cookies;
    String accessToken;

    @Test
    public void loginTest(){

        requestSpecBuilder = new RequestSpecBuilder();
        requestSpecBuilder.setBaseUri("https://poojamegh123-trials7161.orangehrmlive.com");

        //CSRF token generation
        Response response = RestAssured.given()
                .spec(requestSpecBuilder.build())
                .when()
                .get("/auth/login")
                .then().extract().response();

        cookies = response.getCookies();

        Document document = Jsoup.parse(response.asString());
        csrfToken = document.getElementById("login__csrf_token").attr("value");

        System.out.println("CSRF Token : " + csrfToken);
        Assert.assertNotNull(csrfToken, "CSRF token not generated");
        Assert.assertEquals(response.statusCode(), 200);

        //login with valid credentials
        Response response1 = RestAssured.given()
                .spec(requestSpecBuilder.build())
                    .cookies(cookies)
                    .formParam("login[_csrf_token]", csrfToken)
                    .formParam("hdnUserTimeZoneOffset", 5.5)
                    .formParam("txtUsername","Admin")
                    .formParam("txtPassword","Xw84DNaqU@")
                .when()
                    .post("/auth/validateCredentials")
                .then().extract().response();

        cookies = response1.getCookies();
        Assert.assertEquals(response1.statusCode(), 200);

        //Get access token
        Response response2 = RestAssured.given()
                .spec(requestSpecBuilder.build())
                .cookies(cookies)
                .when()
                .get("/core/getLoggedInAccountToken")
                .then().extract().response();

        System.out.println(response2.asPrettyString());
        accessToken = response2.jsonPath().getString("token.access_token");

        Assert.assertNotNull(accessToken, "Access token not generated");
        Assert.assertEquals(response2.statusCode(), 200);

        //Verify widget API
        Map<String, String> headers = new HashMap<>();
        headers.put("authorization", "Bearer " + accessToken);
        headers.put("Content-type","application/x-www-form-urlencoded");
        Response response3 = RestAssured.given()
                .spec(requestSpecBuilder.build())
                .headers(headers)
                .cookies(cookies)
                .when()
                .get("/api/dashboard/widgets")
                .then().extract().response();

        System.out.println(response3.asPrettyString());
        Assert.assertEquals(response3.statusCode(), 200);
    }
}
