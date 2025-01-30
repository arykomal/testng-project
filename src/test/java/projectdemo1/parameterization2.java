package projectdemo1;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameterization2 {

	
	@Parameters ({"a","b"})
	
	@Test
	public void test(int a, int b) {
		
		 int sum = a+b;
		 System.out.println(sum);
		
	}
	
	
	
	
}
