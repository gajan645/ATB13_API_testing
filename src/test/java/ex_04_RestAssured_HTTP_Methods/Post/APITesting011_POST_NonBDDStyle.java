package ex_04_RestAssured_HTTP_Methods.Post;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting011_POST_NonBDDStyle {

    RequestSpecification r;
    Response response;
    ValidatableResponse vr;

    @Test

    public void test_Post_NOn_Bdd_style_Create_token()
    {
        //URL = https://restful-booker.herokuapp.com/auth
        //Payload = {
        //    "username": "admin",
        //    "password": "password123"
        //}
        //Header =Content-Type : application/json
        //AUth =?
        //Cookie = NA
        //Validate = 200 OK
        //Body Response = Token is generated or not

        String payload = "{\n" +
                "    \"username\" : \"admin\",\n" +
                "    \"password\" : \"password123\"\n" +
                "}";

        System.out.println("------- Part 1------");

        // Part 1 - Pre Condition - Preparing Request - URL, Headers, Auth...

        r = RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/auth");
        r.contentType(ContentType.JSON);
        r.body(payload).log().all();


        System.out.println("------part 2-------");

        response = r.when().log().all().post();

        System.out.println("------Part 3 ------");
        vr = response.then().log().all();
        vr.statusCode(200);

        // vr.statusCode(200).body("token", notNullValue()).body("token", equalTo(this) or equalTo("16 digit"));







    }
}
