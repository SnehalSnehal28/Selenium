import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path=System.getProperty("user.dir");
		String fullpath=path+"\\src\\main\\java\\webdriver\\chromedriver_137.exe";
		System.out.println("full path "+fullpath);
		System.setProperty("webdriver.chrome.driver",fullpath);
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/sneha/eclipse-workspace/SeleniumWebDriver/src/main/java/WebTableDemo.html");
	    String text=driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]")).getText();
	    System.out.println(text);
		  WebElement table = driver.findElement(By.tagName("table")); // Assuming your table is the first table on the page

          // Get the number of rows
          List<WebElement> rows = table.findElements(By.tagName("tr"));
          int rowCount = rows.size();
          System.out.println("Number of rows: " + rowCount);

          // Get the number of columns (assuming all rows have the same number of columns)
          List<WebElement> cells = rows.get(1).findElements(By.tagName("td"));
          int columnCount = cells.size();
          System.out.println("Number of columns: " + columnCount);

          // Accessing data in a specific cell
          WebElement cell = rows.get(1).findElements(By.tagName("td")).get(0);
          String cellText = cell.getText();
          System.out.println("Text in cell (row 2, column 1): " + cellText);
          String Expected = "Box Shadow";
          boolean flag = false;
          
          for(int i=1; i< rowCount; i++) {
        	  WebElement cols= rows.get(i).findElements(By.tagName("td")).get(0);
        	  System.out.println(cols.getText());
        	  if(Expected.equals(cols.getText())) {
        		  flag=true;
        	  }
        	  
          }
          if(flag) {
        	  System.out.println("Box Shadow is exist");
          }

	}

}


