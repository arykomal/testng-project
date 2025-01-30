package Assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class hard_assert {
  
	@Test
	void test1() {
		
		System.out.println("test1");
		
		boolean actual_res = false;
		
		Assert.assertTrue(actual_res);
		
		System.out.println("pc");
	}
	
	@Test
	void test2() {
		
		
		System.out.println("test2");
		
		Assert.assertFalse(false);
		
		System.out.println("pc1");
		
	}
	
	@Test
	void test3() {
		
		System.out.println("test3");
		
		
		String S1 = "Java";
		String S2 = "Java";
		String S3 = "Python";
		
		Assert.assertEquals(S1, S2, "Assert passed as exp java found java");
		Assert.assertEquals(S3, S2, "Assert failed as exp python found java");
		Assert.assertEquals(S1, S3, "Assert failed as exp python got java");
		
	}
	
	
	
	
	
}
