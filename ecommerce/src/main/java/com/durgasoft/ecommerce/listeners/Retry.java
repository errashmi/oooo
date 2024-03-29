package com.durgasoft.ecommerce.listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Retry implements IRetryAnalyzer {
	private int retryCount=0;
	private int maxRetryCount=3;
	public boolean retry(ITestResult arg0) {
		if(retryCount<maxRetryCount) {
			log("Retrying Test"+arg0.getName()+"With Status"+getResultStatusName(arg0.getStatus())+"for the"+(retryCount+1)+"times");
			retryCount++;
			return true;
		}
		return false;
	}
	public void log(String string) {
		Reporter.log(string);
		
	}
	public String getResultStatusName(int status) {
		String resultName="Null";
		if(status==1) 
			resultName="SUCCESS";
		if(status==2) 
			resultName="FAIL";
		if(status==3) 
			resultName="SKIP";
		return resultName;
	}
}
