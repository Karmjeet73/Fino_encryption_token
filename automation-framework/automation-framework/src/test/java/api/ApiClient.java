package api;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import utils.ConfigReader;

public class ApiClient {

    private String authToken;

    private RequestSpecification baseSpec() {

        RequestSpecBuilder builder =
                new RequestSpecBuilder()
                        .setBaseUri(
                                ConfigReader.getApiBaseUrl()
                        )
                        .setContentType(
                                ContentType.JSON
                        )
                        .addHeader(
                                "accept",
                                "*/*"
                        );

        if (authToken != null &&
                !authToken.isBlank()) {

            builder.addHeader(
                    "Authorization",
                    "Bearer " + authToken
            );
        }

        return builder.build();
    }

    public ApiClient withAuthToken(String token) {

        this.authToken = token;

        return this;
    }

    public Response get(String endpoint) {

        return RestAssured
                .given()
                .spec(baseSpec())
                .when()
                .get(endpoint)
                .then()
                .extract()
                .response();
    }

    public Response post(String endpoint, Object body) {

        return RestAssured
                .given()
                .spec(baseSpec())
                .body(body)
                .log()
                .all()
                .when()
                .post(endpoint)
                .then()
                .log()
                .all()
                .extract()
                .response();
    }

    public Response put(
            String endpoint,
            Object body) {

        return RestAssured
                .given()
                .spec(baseSpec())
                .body(body)
                .when()
                .put(endpoint)
                .then()
                .extract()
                .response();
    }

    public Response delete(String endpoint) {

        return RestAssured
                .given()
                .spec(baseSpec())
                .when()
                .delete(endpoint)
                .then()
                .extract()
                .response();
    }
}