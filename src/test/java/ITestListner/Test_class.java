package ITestListner;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_class {
  @Test
	public void testMehtod() {
		System.out.println("executing test method");
	}
	
	@Test
	public void testMethod1() {
		System.out.println("executing test method 1");
		Assert.assertFalse(true);
	}
	
}
