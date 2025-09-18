package Assignment.HybridDriven.test;

import Assignment.HybridDriven.base.BaseTest;
import Assignment.HybridDriven.pages.LoginPage;
import Assignment.HybridDriven.utils.ExcelReader;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

	@Test
	public void loginTest() throws Exception {

		for (int i = 1; i <= 2; i++) {
			String user = ExcelReader.getData("TestData/HybridDriven.xlsx", "Login", i, 0);
			String pass = ExcelReader.getData("TestData/HybridDriven.xlsx", "Login", i, 1);

			System.out.println("Username: " + user + " Password: " + pass);

			LoginPage lp = new LoginPage(driver);
			lp.login(user, pass);
			lp.logout();

		}
	}
}
