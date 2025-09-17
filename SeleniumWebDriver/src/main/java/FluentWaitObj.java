import java.time.Duration;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
public class FluentWaitObj {

	public static void main(String[] args) throws TimeoutException {
		// TODO Auto-generated method stub
		String path = System.getProperty("user.dir");
		System.out.println(path);
		String fullpath = path + "\\src\\main\\java\\webdriver\\chromedriver_137.exe";
		System.out.println(fullpath);
		System.setProperty("webdriver.chrome.driver", fullpath);
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://practicesoftwaretesting.com/auth/register");
		Wait<WebDriver> wait
		    =  new FluentWait<>(driver)
		          .withTimeout(Duration.ofSeconds(40))
		          .pollingEvery(Duration.ofSeconds(3))
		          .ignoring(TimeoutException.class);
		try {
			WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("street")));
			element.click();
			System.out.println("Element clicked successfully!");
		}
		finally {
			//driver.quit();
		}
	}
	}

