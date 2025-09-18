import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = System.getProperty("user.dir");
		System.out.println(path);
		String fullpath = path + "//src//main//java//webdriver//chromedriver_137.exe";
		System.out.println(fullpath);
		System.setProperty("webdriver.chrome.driver", fullpath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		WebElement firstname = driver.findElement(By.name("firstName"));
		firstname.sendKeys("Snehal");
		
		WebElement lastname = driver.findElement(By.name("lastName"));
		lastname.sendKeys("Solanki");
		
		WebElement phone = driver.findElement(By.name("phone"));
		phone.sendKeys("7433855795");
		
		WebElement email = driver.findElement(By.name("userName"));
		email.sendKeys("snehal@gmail.com");
		
		WebElement add = driver.findElement(By.name("address1"));
		add.sendKeys("Nikol,Ahemedabad");
		
		WebElement city = driver.findElement(By.name("city"));
		city.sendKeys("Ahemedabad");
		
		WebElement state = driver.findElement(By.name("state"));
		state.sendKeys("Gujarat");
		
		WebElement pincode = driver.findElement(By.name("postalCode"));
		pincode.sendKeys("380026");
		
		Select drpCountry = new Select (driver.findElement(By.name("country")));
		drpCountry.selectByValue("INDIA");
		
		
		

	}

}
