import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
public class Gmail_Testng_16 {
	WebDriver driver;

	@BeforeTest
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
	@AfterTest
    public void tearDown() {
        //driver.quit();
    }
}



