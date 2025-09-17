import org.junit.Ignore;
import org.testng.annotations.Test;

public class IgnoreTest_Testng {
	@Test
	public void myFirst() {
		System.out.println("Excute My first");
	}
	@Ignore
	public void mySecond() {
		System.out.println("Excute My Second with priority 2");
	}

}
