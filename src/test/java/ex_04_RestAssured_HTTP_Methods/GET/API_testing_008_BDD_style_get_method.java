package ex_04_RestAssured_HTTP_Methods.GET;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class API_testing_008_BDD_style_get_method {

    @Test
    public void test_guide_request ()
    {
        String Pincode= "560048";

        RestAssured

                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/" + Pincode)
                .when()
                .log().all().get()
                .then().log().all()
                .statusCode(200);

    }

}
