import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = System.getProperty("user.dir");
		System.out.println(path);
		String fullpath = path + "//src//main//java//webdriver//chromedriver_137.exe";
		System.out.println(fullpath);
		System.setProperty("webdriver.chrome.driver", fullpath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://practicesoftwaretesting.com/auth/register"); 
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait (driver,Duration.ofSeconds(10));
		WebElement fn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("first_name")));
		fn.sendKeys("Riddhi");
		
		WebElement ln = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("last_name")));
		ln.sendKeys("Siddhpura");
		
		WebElement dob = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("dob")));
		dob.sendKeys("2013-10-07");
		
		WebElement st = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("street")));
		st.sendKeys("Kuldeep,Amd");
		
		WebElement pc = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("postal_code")));
		pc.sendKeys("380026");
		
		WebElement city = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("city")));
		city.sendKeys("Ahemedabad");
		
		WebElement state = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("state")));
		state.sendKeys("Gujrat");
		
		Select drpd = new Select (driver.findElement(By.id("country")));
		drpd.selectByValue("IN");
		
		WebElement phn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("phone")));
		phn.sendKeys("9601033618");
		
		WebElement email = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
		email.sendKeys("ridhi@gmain.com");
		
		WebElement pw = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));
		pw.sendKeys("Riddhi#123");
		
		WebElement reg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/div/app-register/div/div/div/form/div/button")));
		reg.click();
	}

}
