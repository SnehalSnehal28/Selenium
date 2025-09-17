package WebDriverAssignment;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Keyboard_Actions_8 {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		String path = System.getProperty("user.dir");
		System.out.println(path);
		String fullpath = path + "\\src\\main\\java\\webdriver\\chromedriver.exe";
		System.out.println(fullpath);
		System.setProperty("webdriver.chrome.driver", fullpath);

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html ");

		WebElement mouse = driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[5]/a"));

		Actions action = new Actions(driver);

		System.out.println("Widgets: " + mouse.getCssValue("background-color"));
		action.moveToElement(mouse).perform();

		// keyboard
		WebElement a = driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[5]/a"));
		a.click();
		WebElement b = driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[5]/ul/li[2]/a"));
		b.click();

		action.moveToElement(driver.findElement(By.xpath("/html/body/section/div[1]/div[2]/div[1]/div"))).click()
				.keyDown(Keys.SHIFT).sendKeys("Ahemedabad ").build().perform();
		Thread.sleep(3000);
		action.sendKeys(Keys.BACK_SPACE).sendKeys(Keys.BACK_SPACE).build().perform();

	}

}
