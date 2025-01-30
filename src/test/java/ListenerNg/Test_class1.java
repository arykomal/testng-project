package ListenerNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_class1 {

	@Test
	void TestMethod() {
		
		System.out.println("Executing test method3");
		
		Assert.assertTrue(false, "Failed3");
		
	}
	
	
	@Test
	void TestMethod2 () {
		
		System.out.println("executing test method4");
		
		
		Assert.assertTrue(true, "Failed4");
	}

}
