package Com.tops.FrameWorks.ModuleDriven.Modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginModule {

	public static void performLogin(WebDriver driver, String username, String password) {
		driver.findElement(By.id("user-name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("login-button")).click();
	}

}
