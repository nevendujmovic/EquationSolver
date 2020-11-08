package naive.tutorial;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class EquationSolverTest {

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/equationsolver")
          .then()
             .statusCode(200)
             .body(is("hello"));
    }

}