
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Facebook_Testng_15 {
	WebDriver driver;
	
	@BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
    }
    
	@Test
    public void testLogin() {
        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("dummyemail@example.com");

        WebElement pass = driver.findElement(By.name("pass"));
        pass.sendKeys("dummyPassword123");

        WebElement btn = driver.findElement(By.name("login"));
        btn.click();
    }
	@AfterClass
    public void tearDown() {
       // driver.quit();
    }
}


