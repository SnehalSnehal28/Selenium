import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = System.getProperty("user.dir");
		System.out.println(path);
		String fullpath = path + "//src//main//java//webdriver//chromedriver_137.exe";
		System.out.println(fullpath);
		System.setProperty("webdriver.chrome.driver", fullpath);
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/sneha/eclipse-workspace/SeleniumWebDriver/src/main/java/demo.html");

		// 1. By.id
		WebElement usernameById = driver.findElement(By.id("username"));
		usernameById .sendKeys("admin");
		
		// 2. By.name
		WebElement passwordByName= driver.findElement(By.name("pass"));
		passwordByName .sendKeys("123456");
		
		// 3. By.ClassName
		WebElement passwordByClass= driver.findElement(By.className("password-field"));
		passwordByClass .sendKeys("password123");
		
		// 4. By.tagName
		WebElement firstInput= driver.findElement(By.tagName("input"));
		System.out.println("First input tag placeholder: " + firstInput.getAttribute("placeholder"));
		
		// 5. By.linkText
		WebElement homelink= driver.findElement(By.linkText("Home"));
		System.out.println("Home link href: " + homelink.getAttribute("href"));
		
		// 6. By.partialLinkText
		WebElement aboutLink= driver.findElement(By.partialLinkText("About"));
		System.out.println("About Link href " + aboutLink.getAttribute("href"));
		
		// 7. By.cssSelector
		WebElement usernameByCss= driver.findElement(By.cssSelector("input#username"));
		usernameByCss.clear();
		usernameByCss.sendKeys("cssSelectorUser");
		
		// 7. By.cssSelector
		WebElement passwordByXpath= driver.findElement(By.xpath("//input[@type='password']"));
		passwordByXpath.clear();
		passwordByXpath.sendKeys("xpathPassword");
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		//driver.quit();	
	}

}
