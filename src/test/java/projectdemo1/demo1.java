package projectdemo1;

import org.testng.annotations.Test;

public class demo1 {

	@Test (priority =1)
	
	public void username() {
		
		System.out.println("UN");
	}
	
@Test 
	
	public void username1() {
		
		System.out.println("aN");
	}
@Test (priority = -2)

public void username2() {
	
	System.out.println("bN");
}
@Test 

public void username3() {
	
	System.out.println("cN");
}
	
}
