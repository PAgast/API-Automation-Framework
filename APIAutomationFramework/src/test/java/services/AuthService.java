package services;

import static io.restassured.RestAssured.given;

import io.restassured.response.Response;
import specifications.RequestSpec;

public class AuthService {

    public static String getToken() {

        String payload = """
        {
            "username":"admin",
            "password":"password123"
        }
        """;

        Response response = given()
                .spec(RequestSpec.getRequestSpecification())
                .body(payload)

        .when()
                .post("/auth");

        return response.jsonPath().getString("token");
    }
}