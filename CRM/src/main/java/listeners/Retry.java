package listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Retry implements IRetryAnalyzer {
	private int retryCount=0;
	private int maxRetryCount=3;
	public boolean retry(ITestResult arg0) {
		if(retryCount<maxRetryCount) {
			Reporter.log("retrying test"+arg0.getName()+"with status"+getStatusName(arg0.getStatus())+"for the"+(retryCount+1)+"times");
			retryCount++;
			return true;
		}
		return false;
	}
	private String getStatusName(int status) {
		String resultname=null;
		if(status==1)
			resultname="SUCCESS";
		if(status==2)
			resultname="FAIL";
		if(status==3)
			resultname="SKIPPED";
		return resultname;
	}

}
