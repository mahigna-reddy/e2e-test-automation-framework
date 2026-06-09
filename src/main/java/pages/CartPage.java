package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CartPage {

    private WebDriver driver;
    private WebDriverWait wait;

    private By cartTable = By.cssSelector(".cart");
    private By cartProductRows = By.cssSelector(".cart tbody tr");

    public CartPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public boolean isProductDisplayedInCart() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(cartTable));
        return driver.findElements(cartProductRows).size() > 0;
    }
}