package WebDriverAssignment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertBox_9 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String path = System.getProperty("user.dir");
		System.out.println(path);
		String fullpath = path + "\\src\\main\\java\\webdriver\\chromedriver_137.exe";
		System.out.println(fullpath);
		System.setProperty("webdriver.chrome.driver", fullpath);
		WebDriver driver = new ChromeDriver();
        // 3. Open test page with alerts
        driver.get("https://demo.automationtesting.in/Register.html");

        driver.manage().window().maximize();
         WebElement a = driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[4]/a"));
         a.click();
         WebElement b = driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[4]/ul/li[1]/a"));
         b.click();
        // 1.Alert Simple Box
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[1]/a")).click();
        // just to see alert
        WebElement c = driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button"));
        c.click();
        Thread.sleep(1000); 
        Alert alert1 = driver.switchTo().alert(); // Switch to alert
        System.out.println("Alert text: " + alert1.getText());
        alert1.accept(); // OK click

        // 2.Confirm Box
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
        WebElement d = driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button"));
        d.click();
        Thread.sleep(1000);

        Alert alert2 = driver.switchTo().alert();
        System.out.println("Confirmation text: " + alert2.getText());
        alert2.dismiss(); // Cancel click

        // 3.Prompt Box
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
        WebElement e = driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button"));
        e.click();
        Thread.sleep(1000);

        Alert alert3 = driver.switchTo().alert();
        System.out.println("Prompt text: " + alert3.getText());
        alert3.sendKeys("Snehal Solanki"); // Type text
        alert3.accept();

        // Close browser
        //driver.quit();
	}

}
