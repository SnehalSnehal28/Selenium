package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    // After login, "My Account" link shows
    private By accountLink = By.xpath("//*[@id=\"sectionsNav\"]/div/div[1]/ul[2]/li[1]/a");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isUserLoggedIn() {
        return driver.findElement(accountLink).isDisplayed();
    }
}
