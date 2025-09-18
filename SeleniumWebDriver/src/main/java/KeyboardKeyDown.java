import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.apache.commons.io.FileUtils;


public class KeyboardKeyDown {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		String path = System.getProperty("user.dir");
		System.out.println(path);
		String fullpath = path + "\\src\\main\\java\\webdriver\\chromedriver_137.exe";
		System.out.println(fullpath);
		System.setProperty("webdriver.chrome.driver", fullpath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://amazon.in");
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("Mobile").perform();
		Thread.sleep(3000);
		actions.sendKeys(Keys.BACK_SPACE).sendKeys(Keys.BACK_SPACE).perform();
		
		//Take Screenshot
		TakesScreenshot ts = (TakesScreenshot)driver;
		File file = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("ecommerce.png"));
		String title = driver.getTitle();
		System.out.println("Captured screenshot for: " + title);
		//driver.quit();
		//WebElement f = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		
	}

}
