import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome_Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = System.getProperty("user.dir");
		System.out.println(path);
		String fullpath = path + "//src//main//java//webdriver//chromedriver_137.exe";
		System.out.println(fullpath);
		System.getProperty("webdriver.chrome.driver",fullpath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String url = driver.getCurrentUrl();
		System.out.println(url);
		String ActualTitle = driver.getTitle();
	    String ExpectedTitle = "Facebook – log in or sign up";
	    System.out.println(ActualTitle);
	    if(ActualTitle.equals(ExpectedTitle)) {
	    	System.out.println("Title matched");
	    }
	    else {
	    	System.out.println("Title Not Match");
	    }
	    String source = driver.getPageSource();
	    System.out.println(source);
	    
	    String window = driver.getWindowHandle();
	    System.out.println("Source " + window);
	    
	}

}
