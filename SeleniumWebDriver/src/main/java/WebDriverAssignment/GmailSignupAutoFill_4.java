package WebDriverAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class GmailSignupAutoFill_4 {
    public static void main(String[] args) throws InterruptedException {
    	String path = System.getProperty("user.dir");
		System.out.println(path);
		String fullpath = path + "\\src\\main\\java\\webdriver\\chromedriver_137.exe";
		System.out.println(fullpath);
		System.setProperty("webdriver.chrome.driver", fullpath);
        WebDriver driver = new ChromeDriver();
        driver.get("https://accounts.google.com/signup");
       // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        
        Thread.sleep(2000);
        
        WebElement fn = driver.findElement(By.id("firstName"));
        fn.sendKeys("Reena");
        
        WebElement ln = driver.findElement(By.id("lastName"));
        ln.sendKeys("Parmar");
        
        WebElement btn = driver.findElement(By.xpath("//*[@id=\"collectNameNext\"]/div/button/span"));
        btn.click();
        
        Thread.sleep(2000);
        WebElement monthDropdown = driver.findElement(By.id("month"));
        monthDropdown.click();
        
        driver.findElement(By.xpath("//*[@id=\"month\"]/div/div[2]/ul/li[11]")).click();
       WebElement day = driver.findElement(By.name("day"));
       day.sendKeys("25");
       
       WebElement year = driver.findElement(By.name("year"));
        year.sendKeys("2001");
      
        driver.findElement(By.id("gender")).click();
        driver.findElement(By.xpath("//*[@id=\"gender\"]/div/div[2]/ul/li[1]")).click();
        
        WebElement btn2 = driver.findElement(By.xpath("//*[@id=\"birthdaygenderNext\"]/div/button/span"));
        btn2.click();
        
        Thread.sleep(3000);
        WebElement username = driver.findElement(By.name("Username"));
        username.sendKeys("reenaparamar25");
        
        Thread.sleep(3000);
        WebElement btn3 = driver.findElement(By.xpath("//*[@id='next']/div/button/span"));
        	btn3.click();
        	
        Thread.sleep(3000);
        WebElement pass = driver.findElement(By.name("Passwd"));
        pass.sendKeys("Reena#123");
        
        WebElement cpass = driver.findElement(By.name("PasswdAgain"));
        cpass.sendKeys("Reena#123");
        
        WebElement btn4 = driver.findElement(By.xpath(" //*[@id=\"createpasswordNext\"]/div/button/span"));
    	btn4.click();
    	
    	//note:From this point,CAPTCHA and phone verification appear_cant be bypassed
    	Thread.sleep(5000);
    	System.out.println("Filled Gmail sign-up from (CAPTCH & verification pending).");
       // driver.quit();
        
    }
}

