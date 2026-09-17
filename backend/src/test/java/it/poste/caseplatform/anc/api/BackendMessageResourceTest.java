package it.poste.caseplatform.anc.api;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
class BackendMessageResourceTest {

    @Test
    void shouldReturnBackendMessage() {
        given()
            .when()
            .get("/api/anc/message")
            .then()
            .statusCode(200)
            .body("message", is("ANC backend is running"));
    }
}
