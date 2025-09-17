import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		String path = System.getProperty("user.dir");
		System.out.println(path);
		String fullpath = path + "//src//main//java//webdriver//chromedriver_137.exe";
		System.out.println(fullpath);
		System.setProperty("webdriver.chrome.driver", fullpath);
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/sneha/eclipse-workspace/SeleniumWebDriver/src/main/java/DemoXpath.html");
		
		//1.Absolute Path (Not recommended in real projects)
		WebElement usernameAbs = driver.findElement(By.xpath("/html/body/div/input[@id='username']"));
		
		//2.Relative Xpath
		WebElement usernameRel = driver.findElement(By.xpath("//input[@id='username']"));
		usernameRel.clear();
		usernameRel.sendKeys("relative");
		System.out.println("Relative " + usernameRel);
		
		//3.Contains()
		WebElement passwordContains = driver.findElement(By.xpath("//input[contains(@placeholder, 'password')]"));
		passwordContains.sendKeys("contains123");
		System.out.println("Contains " + passwordContains);
		
		//4.Starts.with
		WebElement usernameStart = driver.findElement(By.xpath("//input[starts-with(@placeholder, 'Enter')]"));
		usernameStart.clear();
		usernameStart.sendKeys("startsWith");
		System.out.println("UserNameStart " + usernameStart);
		
		//5.text()
		WebElement registerLink = driver.findElement(By.xpath("//a[text()='Register']"));
		System.out.println("Text Found: " + registerLink.getText());
		
		//6.Xpath using AND
		WebElement userByAnd = driver.findElement(By.xpath("//input[@type='text' and @id='username']"));
		userByAnd.clear();
		userByAnd.sendKeys("andUser");
		
		//7.Xpath using OR
		WebElement passByOr = driver.findElement(By.xpath("//input[@type='text' or @type='password']"));
		System.out.println("OR matched element placeholder: " + passByOr.getAttribute("placeholder"));
		
		//8.Xpath using parent exis
		WebElement parent = driver.findElement(By.xpath("//input[@id='username']/parent::*"));
		System.out.println("Parent tag name: " + parent.getTagName());
		
		//9.Xpath using Following
		WebElement followingElement = driver.findElement(By.xpath("//label[text()='Username:']/following::input[2]"));
		followingElement.clear();
		followingElement.sendKeys("followed");
		System.out.println("Followed: " +followingElement);
		
		//10.Xpath using preceding
		WebElement precedingLabel = driver.findElement(By.xpath("//input[@id='username']/preceding::label[1]"));
		System.out.println("Preceding label: "+ precedingLabel.getText());
		
		//findh test
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}

}
