package WebDriverAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class RadioButtonLoop_5{
    public static void main(String[] args) throws InterruptedException {
        
    	String path = System.getProperty("user.dir");
		System.out.println(path);
		String fullpath = path + "\\src\\main\\java\\webdriver\\chromedriver.exe";
		System.out.println(fullpath);
		System.setProperty("webdriver.chrome.driver", fullpath);
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Register.html");
        driver.manage().window().maximize();
        
       
        List<WebElement> radioButtons = driver.findElements(By.name("radiooptions"));
        
        
        for (WebElement radio : radioButtons) {
            radio.click();
            Thread.sleep(1000); // 1 second wait just to see effect
        }
        
       // driver.quit();
    }
}

