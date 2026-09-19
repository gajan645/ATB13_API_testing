package ex_04_RestAssured_HTTP_Methods.Patch;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting_014_Patch_non_bdd_style {
    //Put
    //token - booking_ID
    //public void get_token () {}
    //public void get bookingId


    RequestSpecification r;
    Response response;
    ValidatableResponse vr ;

    @Test
    public  void test_api_testing_patch()
    {
        String bookingid = "1182";
        String token = "3449571f22c16da";


        String payload = "{\n" +
                "    \"firstname\" : \"Pramod\",\n" +
                "    \"lastname\" : \"Brown\"\n" +
                "}";
        ;
        r = RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/booking/" + bookingid);
        r.contentType(ContentType.JSON);
        // r.header("Cookie","token="+token);
        r.cookie("token", token);
        r.body(payload).log().all();



        response = r.when().log().all().patch();

        vr = response.then().log().all();
        vr.statusCode(200);


        // we have not verified the response, we have only verified the status code.



    }




}
