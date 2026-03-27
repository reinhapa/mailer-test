package org.acme;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;


@QuarkusTest
public class MailerServiceTest {

    @Test
    public void testMailersCount() {
        given()
                .when().get("/mailers")
                .then()
                .statusCode(200)
                .body(is("Found mailers: 4"));
    }

}
