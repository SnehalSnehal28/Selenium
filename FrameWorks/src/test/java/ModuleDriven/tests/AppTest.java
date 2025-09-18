package ModuleDriven.tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Com.tops.FrameWorks.ModuleDriven.Modules.LoginModule;
import Com.tops.FrameWorks.ModuleDriven.Modules.SearchModule;
import ModuleDriven.utils.ExcelUtils;

public class AppTest{
	WebDriver driver,search;
	ExcelUtils excel;
	
	@BeforeClass
	public void test() throws IOException, InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/v1/");
		Thread.sleep(3000);
		search = new ChromeDriver();
		search.manage().window().maximize();
		search.get("https://www.google.com/");
		excel = new ExcelUtils("TestData/module.xlsx");
	}
	@Test
	public void testLoginAndSearch() {
		String username = excel.getCellData(1, 0);
		String password = excel.getCellData(1, 1);
		String searchItem = excel.getCellData(1, 2);
		System.out.println(username);
		LoginModule.performLogin(driver, username, password);
		SearchModule.search(search, searchItem);
	}
	@AfterClass
	public void tearDown() {
		
		//driver.quit();
	}
	
	
}