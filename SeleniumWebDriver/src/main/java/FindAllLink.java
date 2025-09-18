
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindAllLink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = System.getProperty("user.dir");
		System.out.println(path);
		String fullpath = path + "//src//main//java//webdriver//chromedriver_137.exe";
		System.out.println(fullpath);
		System.setProperty("webdriver.chrome.driver", fullpath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://artoftesting.com/sampleSiteForSelenium");
		driver.manage().window().maximize();
		
		//Get list of webelements with tagName -a
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		System.out.println("Total Links found: " + allLinks.size());
		
		//Traversing through the list and printing its along with link address
		for(WebElement link:allLinks) {
			System.out.println("Attributes: " +link.getText() + " - " + link.getAttribute("href"));
		}
		//driver.quit();
		

	}

}
