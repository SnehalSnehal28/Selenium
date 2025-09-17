import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameExample {
    public static void main(String[] args) {
    	String path = System.getProperty("user.dir");
		System.out.println(path);
		String fullpath = path + "//src//main//java//webdriver//chromedriver_137.exe";
		System.out.println(fullpath);
		System.setProperty("webdriver.chrome.driver", fullpath);
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");

        // Switch to frame
        driver.switchTo().frame("iframeResult");

        // Click button inside frame
        WebElement btn = driver.findElement(By.xpath("//button[text()='Try it']"));
        btn.click();

        // Handle alert first
        driver.switchTo().alert().accept();

        // Now switch back to main content
        driver.switchTo().defaultContent();

        System.out.println("Test Completed Successfully!");

       // driver.quit();
    }
}
