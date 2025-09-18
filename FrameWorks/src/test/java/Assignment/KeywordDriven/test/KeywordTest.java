package Assignment.KeywordDriven.test;

import org.testng.annotations.Test;

import Assignment.KeywordDriven.keyword.ActionKeyword;
import KeywordDriven.utils.ExcelUtils;

public class KeywordTest {

	@Test
	public void runTest() throws Exception {

		ExcelUtils excel = new ExcelUtils("TestData/KeywordDriven.xlsx");

		for (int i = 1; i < excel.getRowCount(); i++) {
			String keyword = excel.getCellData(i, 1);
			String locatorType = excel.getCellData(i, 2);
			String locatorValue = excel.getCellData(i, 3);
			String Data = excel.getCellData(i, 4);

			switch (keyword) {
			case "openBrowser":
				ActionKeyword.openBrowser();
				break;
			case "navigate":
				ActionKeyword.navigate(Data);
				break;
			case "enterText":
				ActionKeyword.enterText(locatorType, locatorValue, Data);
				break;
			case "clickLogin":
				ActionKeyword.clickLogin(locatorType, locatorValue);
				break;
			case "clickLogout":
				ActionKeyword.clickLogout(locatorType, locatorValue);
				break;
			case "closeBrowser":
				ActionKeyword.closeBrowser();
				break;
			default:
				System.out.println("Invalid Keyword " + keyword);
			}
		}
	}
}
