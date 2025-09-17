import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ImplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = System.getProperty("user.dir");
		System.out.println(path);
		String fullpath = path + "//src//main//java//webdriver//chromedriver_137.exe";
		System.out.println(fullpath);
		System.setProperty("webdriver.chrome.driver", fullpath);
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().minimize();
		driver.get("https://practicesoftwaretesting.com/auth/register");
		
		WebElement fn = driver.findElement(By.id("first_name"));
		fn.sendKeys("Reena");
		
		WebElement ln = driver.findElement(By.id("last_name"));
		ln.sendKeys("Paramar");
		
		WebElement dob = driver.findElement(By.id("dob"));
		dob.sendKeys("2003-11-22");
		
		WebElement street = driver.findElement(By.id("street"));
		street.sendKeys("Himanshu Park,Amd");
		
		WebElement pc = driver.findElement(By.id("postal_code"));
		pc.sendKeys("380026");
		
		WebElement city = driver.findElement(By.id("city"));
		city.sendKeys("Ahemedabad");
		
		WebElement state = driver.findElement(By.id("state"));
		state.sendKeys("Gujrat");
		
		Select drpCountry = new Select (driver.findElement(By.id("country")));
		drpCountry.selectByValue("IN");
		
		WebElement phn = driver.findElement(By.id("phone"));
		phn.sendKeys("8866867140");
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("reena@gmail.com");
		
		WebElement pw = driver.findElement(By.id("password"));
		pw.sendKeys("Reena#123");
		
		WebElement reg = driver.findElement(By.xpath("/html/body/app-root/div/app-register/div/div/div/form/div/button"));
		reg.click();
		

	}

}
