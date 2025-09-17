package WebDriverAssignment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsExample_3 {
    public static void main(String[] args) throws InterruptedException {
    	String path = System.getProperty("user.dir");
		System.out.println(path);
		String fullpath = path + "\\src\\main\\java\\webdriver\\chromedriver_137.exe";
		System.out.println(fullpath);
		System.setProperty("webdriver.chrome.driver", fullpath);
		WebDriver driver = new ChromeDriver();
        // 3. Open test page with alerts
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        driver.manage().window().maximize();

        // 1.Alert Simple Box
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button")).click();
        Thread.sleep(1000); // just to see alert

        Alert alert1 = driver.switchTo().alert(); // Switch to alert
        System.out.println("Alert text: " + alert1.getText());
        alert1.accept(); // OK click

        // 2.Confirm Box
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button")).click();
        Thread.sleep(1000);

        Alert alert2 = driver.switchTo().alert();
        System.out.println("Confirmation text: " + alert2.getText());
        alert2.dismiss(); // Cancel click

        // 3.Prompt Box
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button")).click();
        Thread.sleep(1000);

        Alert alert3 = driver.switchTo().alert();
        System.out.println("Prompt text: " + alert3.getText());
        alert3.sendKeys("Snehal Solanki"); // Type text
        alert3.accept();

        // Close browser
        //driver.quit();
    }
}
