package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.SearchPage;

public class SearchTest extends BaseTest {

    @Test
    public void testProductSearch() {
        // Step 1: Login
        LoginPage loginPage = new LoginPage(driver);
        loginPage.openLoginPage();
        loginPage.login("yourEmail@gmail.com", "yourPassword"); // use your credentials

        HomePage homePage = new HomePage(driver);
        Assert.assertTrue(homePage.isUserLoggedIn(), "Login failed!");

        // Step 2: Search Product
        SearchPage searchPage = new SearchPage(driver);
        searchPage.searchProduct("shirt");

        
        // Assertion (check product page opened)
        String url = driver.getCurrentUrl().toLowerCase();
        Assert.assertTrue(url.contains("shirt"), "Search failed! Actual URL: " + url);
    }
}
