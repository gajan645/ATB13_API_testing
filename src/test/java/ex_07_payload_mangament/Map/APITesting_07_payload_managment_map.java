package ex_07_payload_mangament.Map;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import java.util.LinkedHashMap;
import java.util.Map;

public class APITesting_07_payload_managment_map {

    RequestSpecification requestSpecification;
    ValidatableResponse validatableResponse;
    Response response;

    String token;
    Integer bookingId;

    @Test
    public void test_Post() {

        // Parent Map
        Map<String, Object> jsonBodyusingMap = new LinkedHashMap<>();

        jsonBodyusingMap.put("firstname", "Gajanan");
        jsonBodyusingMap.put("lastname", "kale");
        jsonBodyusingMap.put("totalprice", 123);
        jsonBodyusingMap.put("depositpaid", false);

        // Child Map
        Map<String, Object> bookinDatesMap = new LinkedHashMap<>();

        bookinDatesMap.put("checkin", "2025-01-01");
        bookinDatesMap.put("checkout", "2025-01-02");

        // Add child Map to parent Map
        jsonBodyusingMap.put("bookingdates", bookinDatesMap);
        jsonBodyusingMap.put("additionalneeds", "Breakfast");

        System.out.println(jsonBodyusingMap);

        // Request specification
        requestSpecification = RestAssured.given();

        requestSpecification.baseUri(
                "https://restful-booker.herokuapp.com/"
        );

        requestSpecification.basePath("/booking");

        requestSpecification.contentType(ContentType.JSON);

        requestSpecification
                .body(jsonBodyusingMap)
                .log()
                .all();

        // Send POST request
        response = requestSpecification
                .when()
                .post();

        // Get ValidatableResponse
        validatableResponse = response
                .then()
                .log()
                .all();

        // Status code validation
        validatableResponse
                .statusCode(200);

        // Response body validation
        validatableResponse
                .body(
                        "booking.firstname",
                        Matchers.equalTo("Gajanan")
                );

        validatableResponse
                .body(
                        "booking.lastname",
                        Matchers.equalTo("kale")
                );

        validatableResponse
                .body(
                        "booking.depositpaid",
                        Matchers.equalTo(false)
                );

        validatableResponse
                .body(
                        "bookingid",
                        Matchers.notNullValue()
                );
    }
}