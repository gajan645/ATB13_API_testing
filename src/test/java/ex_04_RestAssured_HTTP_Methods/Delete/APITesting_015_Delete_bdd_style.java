package ex_04_RestAssured_HTTP_Methods.Delete;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting_015_Delete_bdd_style
{
    RequestSpecification r;
    Response response;
    ValidatableResponse vr;

    @Test
    public void test_api_testing()
    {
        String bookingid = "721";
        String token="1a0e1c5c7601e25";

        r= RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/booking/" + bookingid);
        r.contentType(ContentType.JSON);
        r.cookie("token",token);


        response = r.when().log().all().delete();
        vr= response.then().log().all();
        vr.statusCode(201);


        //First we have to create and then token created than delete



    }

}
