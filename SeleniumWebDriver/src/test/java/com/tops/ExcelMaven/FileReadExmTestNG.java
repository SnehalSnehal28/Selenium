package com.tops.ExcelMaven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FileReadExmTestNG {
	
	WebDriver driver;
	String username;
	String password;
	
	@BeforeTest
	public void before() {
	String path = System.getProperty("user.dir");
    String fullpath = path + "\\src\\main\\java\\webdriver\\chromedriver.exe";
    System.setProperty("webdriver.chrome.driver", fullpath);

    driver = new ChromeDriver();
    driver.manage().window().maximize();
	}
	
    @Test
    public void LoginTest() throws IOException {
    	FileInputStream fis = new FileInputStream("TestData/Data.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet = workbook.getSheet("TestData");

        Row row = sheet.getRow(2);
        Cell cell1 = row.getCell(0);
        Cell cell2 = row.getCell(1);

        username = cell1.toString();
        password = cell2.toString();
            
		driver.get("https://www.saucedemo.com/");
		
		WebElement un = driver.findElement(By.id("user-name"));
        un.sendKeys(cell1.toString());
        System.out.println("Logger 1");
      
        WebElement ps = driver.findElement(By.id("password"));
        ps.sendKeys(cell2.toString());
        System.out.println("Logger 2");

        WebElement btn = driver.findElement(By.id("login-button"));
        btn.click();
        System.out.println("Looger 3");
        
        workbook.close();
        fis.close();
	}
	
	@AfterTest
	public void after() {
		System.out.println("I am after");
		//driver.quit();
	}
	

}
