package WebDriverAssignment;
import org.testng.annotations.Optional; 
import org.testng.annotations.Parameters; 
import org.testng.annotations.Test; 
public class LoginTest { 
   @Test 
   public void testValidLogin() { 
       System.out.println("Executing testValidLogin"); 
       // Add actual login logic here 
   } 
   @Test 
   public void testInvalidLoginWithEmptyPassword() { 
       System.out.println("Executing testInvalidLoginWithEmptyPassword");        
   } 
   @Test 
   @Parameters({"username", "password"}) 
   public void testLoginWithParameters(@Optional("default_username") String username,@Optional("default_password") String password) {        
	   System.out.println("Executing testLoginWithParameters with username: " + username + " and password: " + password); 
       // Add actual login logic here using parameters 
   } 
} 
