import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisplayAllValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = System.getProperty("user.dir");
		System.out.println(path);
		String fullpath = path + "\\src\\main\\java\\webdriver\\chromedriver_137.exe";
		System.out.println(fullpath);
		System.setProperty("webdriver.chrome.driver", fullpath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://practicesoftwaretesting.com/auth/register");
		driver.manage().window().maximize();
		List<WebElement> allInputs = driver.findElements(By.tagName("input"));
		for(WebElement input : allInputs) {
			input.sendKeys("Hello");
			String val = input.getAttribute("value");
			System.out.println("Input value: " + val);
		}
		List<WebElement> allSpan = driver.findElements(By.tagName("span"));
		for(WebElement span : allSpan) {
			System.out.println("Span: " + span.getText());
		}
		//driver.quit();
	}
}
