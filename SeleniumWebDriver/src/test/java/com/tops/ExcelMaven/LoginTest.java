package com.tops.ExcelMaven;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import java.time.Duration;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
public class LoginTest {
	
	WebDriver driver;
	
	private static final Logger logger = LogManager.getLogger(LoginTest.class);
	
	@Test(dataProvider = "LoginData", dataProviderClass = DataProviderUtil.class)
	public void testLogin(String username, String password) {
		
		System.out.println("Testing Start");
		logger.info("Testing Start");
		logger.info("Chrome Browser is launched");
		
		driver.get("https://www.saucedemo.com/");
		
		driver.findElement(By.id("user-name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("login-button")).click();
		logger.info("Login tested "+username+" "+password);
		
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sneha\\eclipse-workspace\\SeleniumWebDriver\\src\\main\\java\\webdriver\\chromedriver.exe");
		System.out.println("Before Method");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method");
		//driver.quit();
	}

}
