package restAssured_sample;

import io.restassured.RestAssured;
import java.util.Scanner;

public class RestAssured_Testing_lab_02_RA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Pincode");
        String pincode = sc.next();

        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/in/" + pincode)
                .when()
                .get()
                .then()
                .log().all()
                .statusCode(200);
    }
}