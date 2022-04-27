package testNG;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryListener implements IRetryAnalyzer{

	@Override
	public boolean retry(ITestResult result) {
		int limit=4;
		int failedcount=0;
		while(failedcount<limit)
		{
			failedcount++;
			return true;
		}
		
		return false;
	}

}
