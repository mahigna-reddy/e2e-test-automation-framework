package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;

    private By searchBox = By.id("small-searchterms");
    private By searchButton = By.cssSelector("input[value='Search']");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void searchProduct(String productName) {
        driver.findElement(searchBox).sendKeys(productName);
        driver.findElement(searchButton).click();
    }

    public String getHomePageTitle() {
        return driver.getTitle();
    }
}