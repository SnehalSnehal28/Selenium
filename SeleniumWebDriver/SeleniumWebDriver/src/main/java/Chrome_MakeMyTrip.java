import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Chrome_MakeMyTrip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String path = System.getProperty("user.dir");
	System.out.println(path);
	String fullpath = path + "//src//main//java//webdriver//chromedriver_137.exe";
	System.out.println(fullpath);
	System.setProperty("webdriver.chrome.driver", fullpath);
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.makemytrip.com");
	String url = driver.getCurrentUrl();
	System.out.println(url);
	String ActualTitle = driver.getTitle();
	String ExpectedTitle = "MakeMyTrip - #1 Travel Website 50% OFF on Hotels, Flights & Holiday";
	System.out.println(ActualTitle);
	if(ActualTitle.equals(ExpectedTitle)) {
		System.out.println("Title Matched");
	}
	else {
		System.out.println("Title not matched");
	}

	}

}
