
import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitDemo {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");

        // Create FluentWait
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(20))   // max wait 20 sec
                .pollingEvery(Duration.ofSeconds(2))   // check every 2 sec
                .ignoring(NoSuchElementException.class); // ignore element not found

        // Use FluentWait to find the search box
        WebElement searchBox = wait.until(driver1 -> driver1.findElement(By.name("q")));

        // Type something in Google search box
        searchBox.sendKeys("Selenium WebDriver");
        System.out.println("Text typed in search box successfully!");

        //driver.quit();
    }
}

