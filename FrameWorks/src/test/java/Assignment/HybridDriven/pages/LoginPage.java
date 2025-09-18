package Assignment.HybridDriven.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;

	By username = By.name("username");
	By password = By.name("password");
	By loginBtn = By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button");
	By profileMenu = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/span");
	By logoutBtn = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/ul/li[4]/a");

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void login(String user, String pass) {
		driver.findElement(username).clear();
		driver.findElement(username).sendKeys(user);

		driver.findElement(password).clear();
		driver.findElement(password).sendKeys(pass);

		driver.findElement(loginBtn).click();
	}

	// Logout
	public void logout() throws InterruptedException {
		Thread.sleep(2000); // wait for page to load fully

		try {
			// First click on profile dropdown
			driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();
			Thread.sleep(1000);

			// Then click on Logout
			driver.findElement(By.xpath("//a[text()='Logout']")).click();

			System.out.println("Logout successful");
		} catch (Exception e) {
			System.out.println("Logout button not found, maybe login failed!");
		}
	}

}
