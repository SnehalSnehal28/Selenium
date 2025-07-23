import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ForgotPassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = System.getProperty("user.dir");
		System.out.println(path);
		String fullpath = path + "//src//main//java//webdriver//chromedriver_137.exe";
		System.out.println(fullpath);
		System.setProperty("webdriver.chrome.driver", fullpath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		try {
		 WebElement forgotField = driver.findElement(By.linkText("Forgotten password?"));
		 System.out.println("Avilable");
		}catch(Exception e) {
		System.out.println("Not avilable");
		 
		}

	}
}
