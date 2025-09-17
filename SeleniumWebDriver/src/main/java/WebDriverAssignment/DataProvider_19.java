package WebDriverAssignment;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_19 {
	@DataProvider(name = "loginData")
	public Object[][] provideLoginData(){
		return new Object[][] {
			{"user1","pass1"},
			{"user2","pass2"},
			{"user3","pass3"}
		};
	}
	@Test(dataProvider = "loginData")
	public void testLogin(String username, String password) {
		System.out.println("Testing login with username: " + username + " and password: " + password);
		
	}

}
