package ex_02_RA_Concepct;

import io.restassured.RestAssured;

public class APITesting_Lab_05_Multiple_test_cases {

    public static void main(String[] args)
    {
        String Pincode = "110048";

        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/in/" + Pincode)
                .when()
                .get()
                .then()
                .log().all().statusCode(200);


        Pincode = "@";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/in/" + Pincode)
                .when()
                .get()
                .then()
                .log().all().statusCode(200);

      Pincode = "578457";
      RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/in/" + Pincode)
                .when()
                .get()
                .then()
                .log().all().statusCode(200);

    }
}
