package ex_04_RestAssured_HTTP_Methods.GET;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class API_testing_009_Non_bddstyle_get_method
{
    RequestSpecification r;  //Pre Request given part
    Response responce ;//Making the request when
    ValidatableResponse vr; //Post request than
    String Pincode;


    @Test
    public void test_Get_non_bdd()
    {
        Pincode = "560004";

        //Part 1
        r = RestAssured.given();
        r.baseUri("https://api.zippopotam.us");
        r.basePath("/IN/"+ Pincode);

        //Part 2
        responce = r.when().log().all().get();

        //Part 3
        vr = responce.then().log().all();
                vr.statusCode(200);

    }

    @Test
    public void test_Get_non_bdd_negative_test()
    {
        Pincode =" ";
        //part 1
        r = RestAssured.given();
        r.baseUri("https://api.zippopotam.us");
        r.basePath("/IN/"+ Pincode);

        //Part 2
        responce = r.when().log().all().get();

        //Part 3
        vr = responce.then().log().all();
        vr.statusCode(404);

    }


}
