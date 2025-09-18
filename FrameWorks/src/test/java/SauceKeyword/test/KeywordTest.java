package SauceKeyword.test;

import org.testng.annotations.Test;
import SauceKeyword.keyword.ActionKeywords;
import SauceKeyword.util.ExcelUtils;



public class KeywordTest {

    @Test
    public void runTest() throws Exception {
        ExcelUtils excel = new ExcelUtils("TestData/testSteps2.xlsx");

        for (int i = 1; i < excel.getRowCount(); i++) {
            String keyword = excel.getCellData(i, 1);
            String locatorType = excel.getCellData(i, 2);
            String locatorValue = excel.getCellData(i, 3);
            String data = excel.getCellData(i, 4);
            

            switch (keyword) {
                case "openBrowser":
                    ActionKeywords.openBrowser();
                    break;
                case "navigate":
                    ActionKeywords.navigate(data);
                    break;
                case "enterText":
                    ActionKeywords.enterText(locatorType, locatorValue, data);
                    break;
                case "click":
                	Thread.sleep(2000);
                    ActionKeywords.click(locatorType, locatorValue);
                    break;
                case "closeBrowser":
                    ActionKeywords.closeBrowser();
                    break;
                default:
                    System.out.println("Invalid keyword: " + keyword);
            }
        }
    }
}

