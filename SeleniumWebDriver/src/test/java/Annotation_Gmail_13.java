
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Annotation_Gmail_13 {
	WebDriver driver;

	 @Before
	    public void setup() {
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://mail.google.com/");
	    }

	 @Test
	    public void testLogin() {
	        WebElement email = driver.findElement(By.xpath("//*[@id='identifierId']"));
	        email.sendKeys("dummyemail@example.com");

	        WebElement btn = driver.findElement(By.xpath("//*[@id='identifierNext']/div/button/span"));
	        btn.click();
	    }
	 @After
	    public void tearDown() {
	        driver.quit();
	    }
	}

