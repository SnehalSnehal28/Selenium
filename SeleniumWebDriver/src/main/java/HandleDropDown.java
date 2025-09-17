
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDown {
    public static void main(String[] args) throws InterruptedException {
        
    	String path=System.getProperty("user.dir");
		System.out.println(path);
		String fullpath=path+"\\src\\main\\java\\webdriver\\chromedriver_137.exe";
		System.out.println("full path "+fullpath);
		System.setProperty("webdriver.chrome.driver",fullpath);
        
        // 2. Chrome browser open karo
        WebDriver driver = new ChromeDriver();
        
        // 3. Window maximize karo
        driver.manage().window().maximize();
        
        // 4. Website open karo
        driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
        
        // 5. Dropdown element locate karo
        WebElement countryDropdown = driver.findElement(By.xpath("//select"));
        
        // 6. Select class no object banao
        Select select = new Select(countryDropdown);
        
        // 7. Country = India select karo
        select.selectByValue("IND");
        
        // 8. Thodi wait (optional)
        Thread.sleep(2000);
        
        // 9. Browser close karo
       // driver.quit();
    }
}
