import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox_Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = System.getProperty("user.dir");
		System.out.println(path);
		String fullpath = path + "//src//main//java//webdriver//geckodriver.exe";
		System.out.println(fullpath);
        System.getProperty("driver.firefox.driver",fullpath);
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.facebook.com");
        String url = driver.getCurrentUrl();
        System.out.println(url);
        String ActualTitle = driver.getTitle();
       String ExpectedTitle = "Facebook – log in or sign up";
        System.out.println(ActualTitle);
        if(ActualTitle.equals(ExpectedTitle)) {
        	System.out.println("Title matched");
        }
        else {
        	System.out.println("Title not matched");
        }
	}

}
