
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_junit_12 {
	WebDriver driver;

	 @Before
	    public void setup() {
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://www.facebook.com/");
	    }
    @Test
    public void testLogin()  {
            
        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("dummyemail@example.com");
        
        WebElement pass = driver.findElement(By.name("pass"));
        pass.sendKeys("dummyPassword123");

        // Click Login
        WebElement btn = driver.findElement(By.name("login"));
        btn.click();   
    }
	@After
    public void tearDown() {
           // driver.quit();
    }
}



