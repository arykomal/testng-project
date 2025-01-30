package failed_testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class test_class {

	
	@Test
	void testLogin() {
		
		System.out.println("login");
		
		Assert.assertTrue(false,"failed1");
		
	}
	@Test
	void testLogin1() {
		
		System.out.println("login1");
		
		Assert.assertTrue(false,"failed1");
		
	}
	@Test
	void testLogin2() {
		
		System.out.println("login2");
		
		Assert.assertTrue(false,"failed1");
		
	}
	@Test
	void testLogin3() {
		
		System.out.println("login3");
		
		Assert.assertTrue(false,"failed1");
		
	}
	@Test
	void testLogin4() {
		
		System.out.println("login4");
		
		Assert.assertTrue(false,"failed1");
		
	}
}
