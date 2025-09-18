package Com.tops.FrameWorks.ModuleDriven.Modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchModule {

	public static void search(WebDriver driver, String item) {
		driver.findElement(By.name("q")).sendKeys(item);
	}

}
