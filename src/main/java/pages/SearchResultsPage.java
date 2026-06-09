package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SearchResultsPage {

    private WebDriver driver;
    private WebDriverWait wait;

    private By firstProductLink = By.cssSelector(".product-title a");
    private By productGrid = By.cssSelector(".product-grid");

    public SearchResultsPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void clickFirstProduct() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(productGrid));
        wait.until(ExpectedConditions.elementToBeClickable(firstProductLink)).click();
    }

    public boolean areSearchResultsDisplayed() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(productGrid)).isDisplayed();
    }
}