import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome_Google {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path=System.getProperty("user.dir");
		System.out.println(path);
		String fullpath=path + "\\src\\main\\java\\webdriver\\chromedriver.exe";
		System.out.println(fullpath);
		System.setProperty("webdriver.chrome.driver", fullpath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		String url = driver.getCurrentUrl();
		System.out.println(url);
		String title = driver.getTitle();
		System.out.println(title);
		if(title.equals("Google !!!")) {
			System.out.println("Title Matched");
		}
		else {
			System.out.println("Title Not match");
		}
	}

}
