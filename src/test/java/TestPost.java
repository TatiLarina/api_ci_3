import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static org.hamcrest.Matchers.*;

public class TestPost {
    @Test
    void TestPost1() {

        given()
                .baseUri("https://postman-echo.com")
                .contentType("text/plain; charset=UTF-8")
                .body("Good Day")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo("Good Day"))
        ;
    }
}
