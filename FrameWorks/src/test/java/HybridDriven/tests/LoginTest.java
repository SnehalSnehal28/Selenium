package HybridDriven.tests;

import HybridDriven.base.BaseTest;
import HybridDriven.pages.LoginPage;
import HybridDriven.utils.ExcelReader;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void loginTest() throws Exception {
        
        for (int i = 1; i <= 3; i++) {  
            String user = ExcelReader.getData("TestData/Hybrid.xlsx", "Login", i, 0);
            String pass = ExcelReader.getData("TestData/Hybrid.xlsx", "Login", i, 1);

            System.out.println("Username: " + user + " Password: " + pass);

            LoginPage lp = new LoginPage(driver);
            lp.login(user, pass);

          
        }
    }
}
