import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = System.getProperty("user.dir");
		System.out.println(path);
		String fullpath = path + "\\src\\main\\java\\webdriver\\chromedriver_137.exe";
		System.out.println(fullpath);
		System.setProperty("webdriver.chrome.driver", fullpath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		WebElement Telecome_Project = driver.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[8]/a"));
		Actions actions = new Actions(driver);
		System.out.println("Telecome: " + Telecome_Project.getCssValue("background-color"));
		actions.moveToElement(Telecome_Project).perform();
		
	}

}
