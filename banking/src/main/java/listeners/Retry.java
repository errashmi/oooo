package listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Retry implements IRetryAnalyzer {
	int retryCount=0;
	int maxretrycount=3;
	public boolean retry(ITestResult arg0) {
		if(retryCount<maxretrycount) {
			retryCount++;
			Reporter.log("Retrying test"+arg0.getName()+"with status"+getResultStatus(arg0.getStatus())+retryCount+"times");
			return true;
		}
		return false;
	}
	private String getResultStatus(int status) {
		String result="Null";
		if(status==1)
			result="PASSED";
		else if(status==2)
			result="FAILED";
		else if(status==3)
			result="SKIPPED";	
		return result;
	}
}
