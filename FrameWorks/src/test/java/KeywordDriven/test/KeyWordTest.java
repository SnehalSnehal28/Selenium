package KeywordDriven.test;

import org.testng.annotations.Test;
import KeywordDriven.keyword.ActionKeywords;
import KeywordDriven.utils.ExcelUtils;

public class KeyWordTest {

    @Test
    public void runTest() throws Exception {
        ExcelUtils excel = new ExcelUtils("TestData/testSteps.xlsx");

        for (int i = 1; i < excel.getRowCount(); i++) {
            String keyword = excel.getCellData(i, 1);
            System.out.println("Executing keyword: " + keyword);
            String locatorType = excel.getCellData(i, 2);
            System.out.println("Locator Type: " + locatorType);
            String locatorValue = excel.getCellData(i, 3);
            System.out.println("Locator Value: " + locatorValue);
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
