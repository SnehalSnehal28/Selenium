package Junittest;
import static org.testng.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

class Calculator {
	int add(int a,int b) {
		return (a+b);
	}
	int sub(int a,int b) {
		return(a-b);
	}
}

public class CalculatorTest {
	@Before
	public void before() {
		System.out.println("Before");
	}

      @Test
	  public void testAddition() {
		Calculator c =new Calculator();
		int res =c.add(2,3);
		System.out.println("Addition");
		assertEquals(5, res, "Addition of 2 and 3 should be 5");
		
	}
      @Test
      public void testSub() {
		Calculator c = new Calculator();
		int res = c.sub(5,2);
		System.out.println("Subtraction");
		assertEquals(3,res, "Subtraction of 5 and 2 should be 3");
		
	}
      @After
      public void after() {
			System.out.println("After");
		}
}
