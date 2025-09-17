import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleTabAndWindows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String path = System.getProperty("user.dir");
		System.out.println(path);
		String fullpath = path + "\\src\\main\\java\\webdriver\\chromedriver_137.exe";
		System.out.println(fullpath);
		System.setProperty("webdriver.chrome.driver", fullpath);
		WebDriver driver = new ChromeDriver();
		//Open the target URL
		//main window
		driver.get("https://www.amazon.in/");
		
		//new tab
		driver.switchTo().newWindow(WindowType.TAB);
		//new Window
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Test");
		Thread.sleep(3000);
		
	    //new window
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.flipkart.com/#");
		System.out.println("Title: " + driver.getTitle());
		//maximize window 
		driver.manage().window().maximize();
		//handle multiple windows
		System.out.println("Count size of Window: " + driver.getWindowHandles().size());
		Set<String> windowid = driver.getWindowHandles();
		List<String> windowindex = new ArrayList<>();
		for (String win : windowid) {
		    windowindex.add(win);
		}
		driver.switchTo().window(windowindex.get(0));
		System.out.println("First: " + driver.getTitle());
		driver.switchTo().window(windowindex.get(1));
		System.out.println("Second: " + driver.getTitle());
		driver.switchTo().window(windowindex.get(2));
		System.out.println("Third: "+ driver.getTitle());
	
		}
		
		
	}


