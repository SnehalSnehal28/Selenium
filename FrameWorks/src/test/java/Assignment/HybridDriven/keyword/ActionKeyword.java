package Assignment.HybridDriven.keyword;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ActionKeyword {
	WebDriver driver;

	public ActionKeyword(WebDriver driver) {
		this.driver = driver;
	}

	public void click(By locator) {
		driver.findElement(locator).click();
	}

	public void type(By locator, String data) {
		driver.findElement(locator).sendKeys(data);
	}

	public String getText(By locator) {
		return driver.findElement(locator).getText();
	}

}
