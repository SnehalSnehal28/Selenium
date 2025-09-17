package WebDriverAssignment;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Facebook_Testng_15 {
	WebDriver driver;
	
    @BeforeClass
    public void setup() {
        String path = System.getProperty("user.dir");
        String fullpath = path + "/src/main/java/webdriver/chromedriver_137.exe";
        System.setProperty("webdriver.chrome.driver", fullpath);

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

        WebElement btn = driver.findElement(By.name("login"));
        btn.click();   
    }
	@AfterClass
    public void tearDown() {
           // driver.quit();
    }
}


