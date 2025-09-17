import org.testng.annotations.Test;

public class TestNg_priority_exp {
	@Test
	public void myFirstTest() {
		System.out.println("Excute myFirstTest");
	}
	@Test(priority=2)
	public void mySecondTest() {
		System.out.println("Executing mySecondTest with priority 2");
	}
	@Test(priority=1)
	public void myThirdTest() {
		System.out.println("Excuting myThirdTest with priority 1");
	}

}
