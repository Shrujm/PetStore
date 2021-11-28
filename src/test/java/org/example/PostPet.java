package org.example;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class PostPet {
    @Test
    public void createRecord(){

        RestAssured.baseURI="https://petstore.swagger.io/";

        given().header("Content-Type", "application/json")
                .and().body("{\n" +
                        "  \"id\": 11,\n" +    //Modify the value
                        "  \"petId\": 12,\n" +  //Modify the value
                        "  \"quantity\": 9,\n" +  //Modify the value
                        "  \"shipDate\": \"2021-11-28T18:42:26.794Z\",\n" +
                        "  \"status\": \"placed\",\n" + //Modify the value
                        "  \"complete\": true\n" + //Modify the value true or false
                        "}"). when()
                .post("/v2/store/order")
                .then().statusCode(200)
                .and().log().all();
    }
}
