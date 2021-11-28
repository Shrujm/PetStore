package org.example;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class DeletePet {

    @Test
    public void testToDelete(){
        RestAssured.baseURI=("https://petstore.swagger.io/");
        given()
                .header("Content-Type","application/json")
                .and()
                .when().delete("/v2/store/order/11")//To delete the request just specify the number and request will be deleted
                .then().statusCode(200)
                .and()
                .log().all();

    }
}
