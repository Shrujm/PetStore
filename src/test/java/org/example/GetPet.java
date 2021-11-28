package org.example;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetPet {
    @Test
    public void getRequestPetStore(){

        RestAssured.baseURI=("https://petstore.swagger.io/");
        given()
                .header("Content-Type","application/json")
                .and()
                .when().get("/v2/store/order/11")//To check different responses please change the number in get request
                .then().statusCode(200)
                .and()
                .log().all();
    }
}
