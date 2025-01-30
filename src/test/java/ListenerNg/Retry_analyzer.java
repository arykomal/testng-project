package ListenerNg;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry_analyzer implements IRetryAnalyzer{

	int retrycount =0;
	int maxCount =5;
	
	
	public boolean retry(ITestResult result) {
		
		if (retrycount < maxCount) {
			
			retrycount++;
			
			System.out.println("retrying test :"+ result.getName()+"for the "+retrycount+"time");
			
			return true;
		}
		
		
		return false;
	}
     
	
	
	
	
	
}
