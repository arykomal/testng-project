package failed_testcases;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class retry_impl implements IRetryAnalyzer {

	int retryCount =0;
	int maxCount = 5;
	
	public boolean retry(ITestResult result) {
	
		
		if (retryCount < maxCount) {
			
			retryCount++;
			
			return true;
		}
		
		return false;
	}

}
