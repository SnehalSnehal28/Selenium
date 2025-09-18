package KeywordDriven.keyword;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionKeywords {
    public static WebDriver driver;

   
    public static void openBrowser() {
        driver = new ChromeDriver();
       
    }

    public static void navigate(String url) {
        driver.get(url);
    }
   
    public static void enterText(String locatorType, String locatorValue, String data) {
        WebElement element = getElement(locatorType, locatorValue);
        element.clear();
        element.sendKeys(data);
    }

    public static void click(String locatorType, String locatorValue) {
        WebElement element = getElement(locatorType, locatorValue);
        element.click();
    }

    public static void closeBrowser() {
        driver.quit();
    }

    private static WebElement getElement(String type, String value) {
        switch (type.toLowerCase()) {
            case "id": return driver.findElement(By.id(value));
            case "name": return driver.findElement(By.name(value));
            case "xpath": return driver.findElement(By.xpath(value));
            case "css": return driver.findElement(By.cssSelector(value));
            default: throw new IllegalArgumentException("Invalid locator type: " + type);
        }
    }
}
