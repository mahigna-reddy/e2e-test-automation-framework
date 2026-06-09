package tests;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.hamcrest.Matchers.*;

public class ProductApiTests {

    @BeforeClass
    public void setupApi() {
        RestAssured.baseURI = "https://fakestoreapi.com";
    }

    @Test
    public void verifyAllProductsApiReturnsSuccess() {
        RestAssured
                .given()
                .when()
                .get("/products")
                .then()
                .statusCode(200)
                .body("size()", greaterThan(0));
    }

    @Test
    public void verifySingleProductApiReturnsValidProductDetails() {
        RestAssured
                .given()
                .when()
                .get("/products/1")
                .then()
                .statusCode(200)
                .body("id", equalTo(1))
                .body("title", notNullValue())
                .body("price", greaterThan(0f))
                .body("category", notNullValue());
    }

    @Test
    public void verifyProductCategoriesApiReturnsData() {
        RestAssured
                .given()
                .when()
                .get("/products/categories")
                .then()
                .statusCode(200)
                .body("size()", greaterThan(0));
    }
}