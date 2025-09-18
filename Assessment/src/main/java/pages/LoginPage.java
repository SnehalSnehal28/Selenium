package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;

    // Locators
    private By loginLink = By.xpath("//*[@id=\"sectionsNav\"]/div/div[1]/ul[2]/li[1]/a");       
    private By emailField = By.id("username");        
    private By passwordField = By.id("password");      
    private By loginButton = By.xpath("//*[@id=\"password\"]");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openLoginPage() {
        driver.findElement(loginLink).click();
    }

    public void login(String email, String password) {
        driver.findElement(emailField).sendKeys(email);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(loginButton).click();
    }
}
