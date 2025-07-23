import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox_Google {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = System.getProperty("user.dir");
		System.out.println(path);
		String fullpath = path + "//src//main//java//webdriver//geckodriver.exe";
        System.out.println(fullpath);
        System.setProperty("webdriver.firefox.driver", fullpath);
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com");
        String url = driver.getCurrentUrl();
        System.out.println(url);
        String title = driver.getTitle();
        if(title.equals("Google")) {
        	System.out.println("Title Matched");
        }
        else {
        	System.out.println("Title not matched");
        }
        
       // String source=driver.getPageSource();
        //System.out.println(source);
         
        String window = driver.getWindowHandle();
        System.out.println("Window: " + window);
	}

}
