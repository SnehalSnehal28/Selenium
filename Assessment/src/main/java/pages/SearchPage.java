package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage {
    private WebDriver driver;

    // Locators
    private By searchBox = By.name("q");    // Search input box
    private By searchButton = By.cssSelector("form[action='/search'] button[type='submit']");  // Search button
    
   
    public SearchPage(WebDriver driver) {
        this.driver = driver;
    }

    // Enter product in search box
    public void searchProduct(String product) {
        driver.findElement(searchBox).clear();
        driver.findElement(searchBox).sendKeys(product);
        driver.findElement(searchButton).click();
    }
    }

