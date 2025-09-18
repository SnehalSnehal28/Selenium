package tests;

import base.BaseTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.HomePage;
import pages.LoginPage;
import pages.SearchPage;

public class CartTest extends BaseTest {

	@Test
	public void testAddToCartFromSearch() {
		// Step 1: Login
		LoginPage loginPage = new LoginPage(driver);
		loginPage.openLoginPage();
		loginPage.login("yourEmail@gmail.com", "yourPassword");

		HomePage homePage = new HomePage(driver);
		Assert.assertTrue(homePage.isUserLoggedIn(), "Login failed!");

		// Step 2: Search Product
		SearchPage searchPage = new SearchPage(driver);
		searchPage.searchProduct("shirt");

		new WebDriverWait(driver, Duration.ofSeconds(10))
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#products .card")));

// Step 3: Quick View
		CartPage cartPage = new CartPage(driver);
		cartPage.clickFirstProduct();
		cartPage.chooseColor();
		cartPage.chooseSize();
		cartPage.addFirstProductToCart();
		cartPage.viewCart();
		System.out.println("Product added to cart successfully!");

		cartPage.quantityDropdown(10);
		System.out.println("Increase Decrease successfully");
       
    }

}
