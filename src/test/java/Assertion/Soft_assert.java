package Assertion;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_assert {

	@Test
	void test1() {
		
		System.out.println("test1");
		
		SoftAssert Assert = new SoftAssert();
		Assert.assertTrue(true);
		
		System.out.println("test1*");
		System.out.println("test1**");
		Assert.assertAll();
	}
}
