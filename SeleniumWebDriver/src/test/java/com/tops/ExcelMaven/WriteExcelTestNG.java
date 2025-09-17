package com.tops.ExcelMaven;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WriteExcelTestNG {
	WebDriver driver;
	String username;
	String password;
	
	@BeforeClass
	public void before() {
		String path = System.getProperty("user.dir");
	    String fullpath = path + "\\src\\main\\java\\webdriver\\chromedriver.exe";
	    System.setProperty("webdriver.chrome.driver", fullpath);
		}
	
	@Test
	public void LoginTest() throws IOException {
		
	XSSFWorkbook workbook = new XSSFWorkbook();
	XSSFSheet sheet = workbook.createSheet("TestData");
	
	Row row = sheet.createRow(0);
	row.createCell(0).setCellValue("Username");
	row.createCell(1).setCellValue("Password");
	
	Row row1 = sheet.createRow(1);
	row1.createCell(0).setCellValue("Admin");
	row1.createCell(1).setCellValue("Admin_123");
	
	XSSFSheet sheet1 = workbook.createSheet("TestData1");
	
	Row sheet1row = sheet1.createRow(3);
	sheet1row .createCell(0).setCellValue("First-Name");
	sheet1row .createCell(1).setCellValue("Second-Name");
	
	Row sheet1row1 = sheet1.createRow(4);
	sheet1row1.createCell(0).setCellValue("Snehal");
	sheet1row1.createCell(1).setCellValue("Solanki");
	
	FileOutputStream fos = new FileOutputStream("TestData/Data1.xlsx");
	workbook.write(fos);
	workbook.close();
	fos.close();
	System.out.println("Data written to Excel successfully");
	
}
	@AfterClass
	public void after() {
		System.out.println("I am after");
		//driver.quit();
	}

}
