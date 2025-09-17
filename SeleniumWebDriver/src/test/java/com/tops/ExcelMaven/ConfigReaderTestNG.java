package com.tops.ExcelMaven;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class ConfigReaderTestNG {

    WebDriver driver;  
    Properties prop = new Properties();
    private static final Logger logger = LogManager.getLogger(ConfigReaderTestNG.class);

    @BeforeClass
    public void before() throws IOException {
    	logger.info("Test Started - Setting up browser");
        FileInputStream fis = new FileInputStream("src/main/resources/Config.properties");
        prop.load(fis);

        String path = System.getProperty("user.dir");
        String fullpath = path + "\\src\\main\\java\\webdriver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", fullpath);

        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.saucedemo.com/v1/");
        
        logger.info("Browser launched and navigated to the url ");
    }

    @Test
    public void LoginTest() {
    	 logger.info("Starting Login Test");
    	 
        String browser = prop.getProperty("browser");
        String url = prop.getProperty("url");
        String username = prop.getProperty("username");
        String password = prop.getProperty("password");

        System.out.println("Browser: " + browser);
        System.out.println("URL: " + url);
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);

        WebElement un = driver.findElement(By.id("user-name"));
        un.sendKeys(username);

        WebElement ps = driver.findElement(By.id("password"));
        ps.sendKeys(password);

        WebElement btn = driver.findElement(By.id("login-button"));
        btn.click();
        
        logger.info("Clicked login button");
    }

    @AfterClass
    public void after() {
        System.out.println("I am After");
        logger.info("Clicked login button");
        driver.quit();
    }
}
