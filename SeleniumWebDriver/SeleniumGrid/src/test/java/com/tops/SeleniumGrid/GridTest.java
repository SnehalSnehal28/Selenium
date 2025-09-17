package com.tops.SeleniumGrid;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;

public class GridTest {
	
	@Test
	public void testOnChrome() throws MalformedURLException {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setBrowserName("chrome");
		
		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444"),caps);
		driver.get("https://www.google.com");
		System.out.println("Title on Chrome: " + driver.getTitle());
		//driver.quit();
		
	}
	@Test
	public void testOnFirefox() throws MalformedURLException {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setBrowserName("firefox");
		
		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444"),caps);
		driver.get("https://www.google.com");
		System.out.println("Title on Firefox: " + driver.getTitle());
		//driver.quit();
		
	}
}
