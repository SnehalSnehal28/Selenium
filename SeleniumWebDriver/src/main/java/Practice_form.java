import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice_form {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String path = System.getProperty("user.dir");
		System.out.println(path);
		String fullpath = path + "//src//main//java//webdriver//chromedriver_137.exe";
		System.out.println(fullpath);
		System.setProperty("webdriver.chrome.driver", fullpath);
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
        driver.get("https://testpages.eviltester.com/styled/validation/input-validation.html");
        //First Name
        WebElement firstName = driver.findElement(By.name("firstname"));
        firstName.sendKeys("John");
        //last name
        WebElement lastName = driver.findElement(By.id("surname"));
        lastName.sendKeys("Doe");
        //age
        WebElement ages = driver.findElement(By.id("age"));
        ages.sendKeys("21");
        
        //country
        Select drpCountry = new Select (driver.findElement(By.name("country")));
		drpCountry.selectByValue("India");
        
        //Notes
		Thread.sleep(3000);
        WebElement not = driver.findElement(By.id("notes"));
        ages.sendKeys("Abcdefghijkldkjdhjhdsj");
        //Submit Button
        WebElement submit = driver.findElement(By.xpath("/html/body/div/div[3]/form/input[4]"));
        submit.click();

	}

}
