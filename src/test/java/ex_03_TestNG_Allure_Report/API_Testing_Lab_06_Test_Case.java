package ex_03_TestNG_Allure_Report;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class API_Testing_Lab_06_Test_Case
{
    String Pincode ;

@Test
    public void test_tc1_pincode_valid ()
    {
        Pincode  = "110048";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/in/" + Pincode)
                .when()
                .get()
                .then()
                .log().all().statusCode(200);

    }

    @Test
    public void test_tc2_pincode_Invalid()
    {
  Pincode  = "@";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/in/" + Pincode)
                .when()
                .get()
                .then()
                .log().all().statusCode(200);

    }
    @Test
    public void test_tc3_pincode_Invalid()
    {
        Pincode  = " ";
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
