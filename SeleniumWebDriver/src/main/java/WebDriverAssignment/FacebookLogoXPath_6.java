package WebDriverAssignment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogoXPath_6 {
    public static void main(String[] args) {
    	String path = System.getProperty("user.dir");
    	System.out.println(path);
    	String fullpath = path + "//src//main//java//webdriver//chromedriver_137.exe";
    	System.out.println(fullpath);
    	System.setProperty("webdriver.chrome.driver", fullpath);
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();

        WebElement logo = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[1]/div/img"));
       
        if (logo.isDisplayed()) {
            System.out.println("Facebook logo is displayed.");
        } else {
            System.out.println("Facebook logo is NOT displayed.");
        }

       // driver.quit();
    }
}
