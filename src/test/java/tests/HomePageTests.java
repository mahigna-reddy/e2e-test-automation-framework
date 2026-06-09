package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SearchResultsPage;
import pages.ProductDetailsPage;
import pages.CartPage;

public class HomePageTests extends BaseTest {

    @Test
    public void verifyHomePageTitle() {
        HomePage homePage = new HomePage(driver);

        String actualTitle = homePage.getHomePageTitle();
        String expectedTitle = "Demo Web Shop";

        Assert.assertEquals(actualTitle, expectedTitle, "Home page title does not match.");
    }

    @Test
    public void verifyProductSearchFunctionality() {
        HomePage homePage = new HomePage(driver);
        SearchResultsPage searchResultsPage = new SearchResultsPage(driver);

        homePage.searchProduct("book");

        Assert.assertTrue(
                searchResultsPage.areSearchResultsDisplayed(),
                "Search results are not displayed."
        );
    }

    @Test
    public void verifyProductCanBeAddedToCart() {
        HomePage homePage = new HomePage(driver);
        SearchResultsPage searchResultsPage = new SearchResultsPage(driver);
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(driver);

        homePage.searchProduct("book");
        searchResultsPage.clickFirstProduct();
        productDetailsPage.addProductToCart();

        String successMessage = productDetailsPage.getSuccessMessage();

        Assert.assertTrue(
                successMessage.contains("The product has been added to your shopping cart"),
                "Product was not added to cart successfully."
        );
    }

    @Test
    public void verifyProductIsDisplayedInCart() {
        HomePage homePage = new HomePage(driver);
        SearchResultsPage searchResultsPage = new SearchResultsPage(driver);
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(driver);
        CartPage cartPage = new CartPage(driver);

        homePage.searchProduct("book");
        searchResultsPage.clickFirstProduct();
        productDetailsPage.addProductToCart();
        productDetailsPage.openShoppingCart();

        Assert.assertTrue(
                cartPage.isProductDisplayedInCart(),
                "Added product is not displayed in the shopping cart."
        );
    }
}