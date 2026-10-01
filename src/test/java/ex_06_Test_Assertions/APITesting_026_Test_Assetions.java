package ex_06_Test_Assertions;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

public class APITesting_026_Test_Assetions {

    RequestSpecification requestSpecification;
    Response response;
    ValidatableResponse VR;
    String token;
    Integer bookingID;



    @Test
    public void test_create_booking_POST()
    {
        // payload
        // given - setting up the body, url, base path, uri
        // when  - making the req
        // then - extraction


        String request_payload = "{\n" +
                "    \"firstname\": \"Jim\",\n" +
                "    \"lastname\": \"Brown\",\n" +
                "    \"totalprice\": 111,\n" +
                "    \"depositpaid\": true,\n" +
                "    \"bookingdates\": {\n" +
                "        \"checkin\": \"2018-01-01\",\n" +
                "        \"checkout\": \"2019-01-01\"\n" +
                "    },\n" +
                "    \"additionalneeds\": \"Breakfast\"\n" +
                "}";

        requestSpecification = RestAssured.given();
        requestSpecification.baseUri("https://restful-booker.herokuapp.com");
        requestSpecification.basePath("/booking");

        //Header Information
        requestSpecification.contentType(ContentType.JSON);
        requestSpecification.body(request_payload).log().all();


        response = requestSpecification.when().log().all().post();
        //Get validate responce to perform validations

        VR = response.then().log().all();

        //Rest Assured Assertions

        VR.statusCode(200);
        //Booking ID !== null , firstname = "pramod";
        //Extract the responce body and do it

        VR.body("bookingid", Matchers.notNullValue());
        VR.body("booking.firstname",Matchers.equalTo("Jim"));
        VR.body("booking.lastname",Matchers.equalTo("Brown"));
        VR.body("booking.depositpaid",Matchers.equalTo(true));




    }
}
