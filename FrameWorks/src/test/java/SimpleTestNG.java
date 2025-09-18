import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SimpleTestNG {

	WebDriver driver;

	@BeforeClass
	public void setUp() {

		String path = System.getProperty("user.dir");
		System.out.println(path);
		String fullpath = path + "\\src\\test\\java\\webdriver\\chromedriver.exe";
		System.out.println(fullpath);
		System.setProperty("webdriver.chrome.driver", fullpath);
	}

	@Test
	public void testGoogleTitle() {
		// Open Google
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		String title = driver.getTitle();
		System.out.println("Page Title: " + title);
	}

	@AfterClass
	public void tearDown() {
		// driver.quit();

	}
}
