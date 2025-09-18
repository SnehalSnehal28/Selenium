package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class CartPage {
    private WebDriver driver;

    // Locators
    private By click = By.xpath("//*[@id=\"products\"]/div[1]/div/a/div");
    
    private By selectColor = By.xpath("//*[@id=\"product_content\"]/div[2]/div[3]/div[2]/div/a[2]/div");
    private By selectSize = By.xpath("//*[@id=\"product_content\"]/div[2]/div[3]/div[3]/div/select/option[3]");
    private By firstAddToCartButton = By.xpath("//*[@id=\"product-main-button-panel\"]/div[1]/button");
    private By viewCartButton = By.xpath("//*[@id=\"sectionsNav\"]/div/div[1]/ul[2]/li[4]/ul/li[3]/a");
    
    
    
    public CartPage(WebDriver driver) {
        this.driver = driver;
    }
    
    public void quantityDropdown(int quantity) {
		Select drpCountry = new Select (driver.findElement(By.name("quantity")));
		drpCountry.selectByValue("10");
		
    }

    public void clickFirstProduct() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(click)).click();
	}
       
    
    public void chooseColor() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(selectColor)).click();
    }
    
    public void chooseSize() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(selectSize)).click();
    }
    
    public void addFirstProductToCart() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(firstAddToCartButton)).click();
    }

    public void viewCart() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(viewCartButton)).click();
    }
    
    
   
}
