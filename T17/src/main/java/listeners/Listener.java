package listeners;

import java.io.File;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import base.BasePage;

public class Listener extends BasePage implements ITestListener {

	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestStart(ITestResult arg0) {
		System.out.println(arg0.getName()+"Test Started successfully");
		Reporter.log(arg0.getName()+"Test Started successfully");
		
		try {
			//capture("Listener");
			File ss =capture(arg0.getName()+"Teststarted");
			//Reporter.log("<img src='"+ ss.getAbsolutePath()+"' height='100' width='100'>");
			Reporter.log("<a href='"+ss.getAbsolutePath()+"'><img src='"+ ss.getAbsolutePath()+"' height='100' width='100'></a>");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

}
