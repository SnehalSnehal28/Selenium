import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class QA_Automate_Form {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String path = System.getProperty("user.dir");
		System.out.println(path);
		String fullpath = path + "//src//main//java//webdriver//chromedriver.exe";
		System.out.println(fullpath);
		System.setProperty("webdriver.chrome.driver", fullpath);
		WebDriver driver = new ChromeDriver();

        // 2. Navigate to the test page (replace with your test page)
//		driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        // Set timeout
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        // Maximize window and open the form URL
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/automation-practice-form");

        // 1. First Name - By.id<div class="col-md-3 col-sm-12">…</div>
        WebElement firstName = driver.findElement(By.id("firstName"));
        firstName.sendKeys("John");

        // 2. Last Name - By.name
        WebElement lastName = driver.findElement(By.id("lastName"));
        lastName.sendKeys("Doe");

        // 3. Email - By.cssSelector
        Thread.sleep(3000);
        WebElement email = driver.findElement(By.cssSelector("input[placeholder='name@example.com']"));
        email.sendKeys("john.doe@example.com");

        // 4. Gender (Male) - By.xpath
        WebElement genderMale = driver.findElement(By.xpath("//label[normalize-space(text())='Male']"));
        genderMale.click();

        // 5. Mobile Number - By.className
        Thread.sleep(3000);
        WebElement mobile = driver.findElement(By.xpath("//*[@id=\"userNumber\"]"));
        mobile.sendKeys("1234567890");

        // 6. Date of Birth - By.id
        WebElement dob = driver.findElement(By.id("dateOfBirthInput"));
        dob.click(); // open calendar
        // Select month and year and date using cssSelector/xpath
        WebElement monthSelect = driver.findElement(By.cssSelector(".react-datepicker__month-select"));
        new Select(monthSelect).selectByVisibleText("May");

        WebElement yearSelect = driver.findElement(By.cssSelector(".react-datepicker__year-select"));
        new Select(yearSelect).selectByVisibleText("1990");

        WebElement day = driver.findElement(By.xpath("//div[contains(@class,'react-datepicker__day') and text()='13']"));
        day.click();

        // 7. Subjects - By.xpath
        Thread.sleep(3000);
        WebElement subject = driver.findElement(By.id("subjectsInput"));
        subject.sendKeys("Math");
        subject.sendKeys("\n");

        // 8. Hobbies (Sports) - By.xpath
        WebElement hobby = driver.findElement(By.xpath("//label[text()='Sports']"));
        hobby.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 9. Upload Picture - By.id
        WebElement upload = driver.findElement(By.id("uploadPicture"));
        upload.sendKeys("C:\\Users\\sneha\\OneDrive\\Pictures\\a3.gif"); // Update with actual file path

        // 10. Current Address - By.cssSelector
        Thread.sleep(3000);
        WebElement address = driver.findElement(By.cssSelector("textarea#currentAddress"));
        address.sendKeys("123 Main St, Cityville");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 11. State - By.xpath
        WebElement state = driver.findElement(By.xpath("//*[@id='state']/div/div[1]/div[1]"));
        state.click();
        WebElement selectState = driver.findElement(By.xpath("//div[text()='NCR']"));
        selectState.click();

        // 12. City - By.xpath
        Thread.sleep(3000);
        WebElement city = driver.findElement(By.xpath("//div[contains(text(),'Select City')]"));
        city.click();
        WebElement selectCity = driver.findElement(By.xpath("//div[text()='Delhi']"));
        selectCity.click();

        // 13. Submit - By.id
        WebElement submit = driver.findElement(By.id("submit"));
        submit.click();

        // Optional: wait to view results before closing
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Close browser
        //driver.quit();  
        

	}

}
