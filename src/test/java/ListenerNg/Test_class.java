package ListenerNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_class {

	@Test
	void TestMethod() {
		
		System.out.println("Executing test method");
		
		Assert.assertTrue(false, "Failed");
		
	}
	
	
	@Test
	void TestMethod2 () {
		
		System.out.println("executing test method1");
		
		
		Assert.assertTrue(true, "Failed");
	}
}
