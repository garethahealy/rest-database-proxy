package com.github.garethahealy.restdatabaseproxy;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
class PersonResourceTest {

    @Test
    void testGetEndpoint() {
        given()
          .when().get("/persons/list")
          .then()
             .statusCode(200);
    }
}