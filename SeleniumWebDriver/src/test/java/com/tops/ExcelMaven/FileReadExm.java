package com.tops.ExcelMaven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileReadExm {

    public static void main(String[] args) throws IOException {
        
        // Excel file read
        FileInputStream fis = new FileInputStream("TestData/Data.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet = workbook.getSheet("TestData");

        Row row = sheet.getRow(2);
        Cell cell1 = row.getCell(0);
        Cell cell2 = row.getCell(1);

        System.out.println("Username from Excel: " + cell1);
        System.out.println("Password from Excel: " + cell2);

        // Path set 
       //second path is fullpath
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sneha\\eclipse-workspace\\SeleniumWebDriver\\src\\main\\java\\webdriver\\chromedriver.exe");

        // Open Chrome
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/v1/");

        // Login
        WebElement un = driver.findElement(By.id("user-name"));
        un.sendKeys(cell1.toString());

        WebElement ps = driver.findElement(By.id("password"));
        ps.sendKeys(cell2.toString());

        WebElement btn = driver.findElement(By.id("login-button"));
        btn.click();
        
        workbook.close();
        fis.close();

        // Close browser
       // driver.quit();
    }
}
