package WebDriverAssignment;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MultiSelectDropdown_2{
    public static void main(String[] args) throws InterruptedException {
    	String path = System.getProperty("user.dir");
		System.out.println(path);
		String fullpath = path + "//src//main//java//webdriver//chromedriver_137.exe";
		System.out.println(fullpath);
		System.setProperty("webdriver.chrome.driver", fullpath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");

		driver.manage().window().maximize();
		WebElement multiSelect = driver.findElement(By.id("colors"));

        // Select class object
        Select select = new Select(multiSelect);

        if (select.isMultiple()) {
            select.selectByVisibleText("Red");
            Thread.sleep(1000);
            select.selectByVisibleText("Green");
            Thread.sleep(1000);
            select.selectByVisibleText("Blue");

            System.out.println("Selected: Red");
            System.out.println("Selected: Green");
            System.out.println("Selected: Blue");
        } else {
            System.out.println("Dropdown is NOT multi-select.");
        }

        //driver.quit();
    }
}