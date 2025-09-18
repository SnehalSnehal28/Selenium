package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void testLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.openLoginPage();
        loginPage.login("demo@broadleafcommerce.org", "password"); // use demo credentials

        HomePage homePage = new HomePage(driver);
        Assert.assertTrue(homePage.isUserLoggedIn(), "Login failed, My Account not displayed!");
    }
}
