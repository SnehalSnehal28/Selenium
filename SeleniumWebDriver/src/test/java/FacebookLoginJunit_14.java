import java.util.Arrays;
import java.util.Collection;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
@RunWith(Parameterized.class)
public class FacebookLoginJunit_14 {
	String email, pass;
    WebDriver driver;

    // Constructor for parameters
    public FacebookLoginJunit_14(String email, String pass) {
        this.email = email;
        this.pass = pass;
    }

    // Test data
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
            {"Riddhi@gmail.com", "pass1"},
            {"Lakhani@gmail.com", "pass2"}
        });
    }

    @Before
    public void setUp() {
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\sneha\\eclipse-workspace\\SeleniumWebDriver\\src\\main\\java\\webdriver\\chromedriver_137.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void loginTest() throws Exception {
        driver.get("https://www.facebook.com/");
        driver.findElement(By.id("email")).sendKeys(email);
        driver.findElement(By.id("pass")).sendKeys(pass);
        driver.findElement(By.name("login")).click();
        Thread.sleep(2000); // just for demo
    }

    @After
    public void tearDown() {
        //driver.quit();
    }
}

