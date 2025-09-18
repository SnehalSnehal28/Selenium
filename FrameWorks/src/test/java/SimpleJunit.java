
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleJunit {

	WebDriver driver;

	@Before
	public void setUp() {
		// Setup ChromeDriver automatically
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

	@After
	public void tearDown() {
		driver.quit();

	}
}
