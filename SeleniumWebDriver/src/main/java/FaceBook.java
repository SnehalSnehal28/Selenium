import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class FaceBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path=System.getProperty("user.dir");
		System.out.println(path);
		String fullpath=path+"\\src\\main\\java\\webdriver\\chromedriver_137.exe";
		System.out.println("full path "+fullpath);
		System.setProperty("webdriver.chrome.driver",fullpath);
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement webElement = driver.findElement(By.name("email"));
		WebElement webElement1 = driver.findElement(By.name("pass"));
		WebElement webElement2 = driver.findElement(By.name("login"));
		
		webElement.sendKeys("snehalgmaicom");
		webElement1.sendKeys("123344");
		webElement2.submit();
	}

}
