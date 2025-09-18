import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertBoxes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String path = System.getProperty("user.dir");
		System.out.println(path);
		String fullpath = path + "\\src\\main\\java\\webdriver\\chromedriver.exe";
		System.out.println(fullpath);
		
		System.setProperty("webdriver.chrome.driver", fullpath);
		
		//Navigate to the test page (Replace with your test page)
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button")).click();
		System.out.println("Alert Text: " + driver.switchTo().alert().getText());
		driver.switchTo().alert().sendKeys("hiii"); // prompt box
		Thread.sleep(5000);
		driver.switchTo().alert().accept(); //OK Button  //Basic box
		//driver.switchTo().alert().dismiss();//Cancel Button //confirm box

	}

}
