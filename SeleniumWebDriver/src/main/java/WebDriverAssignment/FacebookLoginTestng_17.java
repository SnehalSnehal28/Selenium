package WebDriverAssignment;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class FacebookLoginTestng_17 {

    @Test
    @Parameters({"username", "password"})
    public void loginTest(String uname, String pass) {
        System.out.println("Username: " + uname);
        System.out.println("Password: " + pass);
    }
}
