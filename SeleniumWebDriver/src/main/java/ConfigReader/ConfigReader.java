package ConfigReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfigReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path=System.getProperty("user.dir");
		System.out.println(path);
		String fullpath=path+"\\src\\main\\java\\webdriver\\chromedriver.exe";
		System.out.println("full path "+fullpath);
		System.setProperty("webdriver.chrome.driver",fullpath);
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		Properties prop = new Properties();
		try {
			
			FileInputStream fis = new FileInputStream("src/main/resources/Config.properties");
			prop.load(fis);
			
			String browser = prop.getProperty("browser");
			String url = prop.getProperty("url");
			String username= prop.getProperty("username");
			String password = prop.getProperty("password");
			
			System.out.println("Browser: " + browser);
			System.out.println("URL: " + url);
			System.out.println("Username: " + username);
			System.out.println("Password: " + password);
			
			WebElement un = driver.findElement(By.id("user-name"));
			un.sendKeys(username);
			
			WebElement ps = driver.findElement(By.id("password"));
			ps.sendKeys(password);
			
			WebElement btn = driver.findElement(By.id("login-button"));
			btn.click();
			}catch(IOException e) {
				System.out.println("Failed to load config.properties file");
			}
	}
}
