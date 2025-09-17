package WebDriverAssignment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class LinkText_PartialLinkText_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = System.getProperty("user.dir");
		System.out.println(path);
		String fullpath = path + "//src//main//java//webdriver//chromedriver_137.exe";
		System.out.println(fullpath);
		System.setProperty("webdriver.chrome.driver", fullpath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		//1.LinkText()
		WebElement link= driver.findElement(By.linkText("Broken Images"));
		System.out.println("Broken Images href " + link.getAttribute("href"));
		
		//2.PartialLinkText()
		WebElement partiallink = driver.findElement(By.partialLinkText("Basic"));
		System.out.println(("Basic Auth href " + partiallink.getAttribute("href")));

	}

}
