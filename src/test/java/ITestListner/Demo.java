package ITestListner;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Demo implements ITestListener {

	void ontestStrat (ITestResult result) {
		
		System.out.println("Test started :"+ result.getName());
		
	}
	
	public void onTestSuccess1(ITestResult result) {
		System.out.println("Test pass:"+ result.getName());
		
	}

	public void onTestFaliure(ITestResult result) {
		System.out.println("Test failed:"+ result.getName());
		
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("Test skipped:"+ result.getName());
		
	}

	public void onTestFinish(ITestResult result) {
		System.out.println("Test Finish:"+ result.getName());
		
	}
}
