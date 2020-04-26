package com.durgasoft.ecommerce.listeners;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.durgasoft.ecommerce.basepage.BasePage;

public class Listeners extends BasePage implements ITestListener {

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
		Reporter.log("Test is Failed "+arg0.getMethod().getMethodName());
		Calendar cal=Calendar.getInstance();
		SimpleDateFormat date=new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
		String methodName=arg0.getName();
		if(!arg0.isSuccess()) {
			//TakesScreenshot tss = ((TakesScreenshot)driver);
			//File file = tss.getScreenshotAs(OutputType.FILE);  //it will take screenshot and save in file
			//FileHandler.copy(from, to);
			
			File sourcePath=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			String reportDirectory=(new File(System.getProperty("user.dir")).getAbsolutePath()+"/src/main/java/com/durgasoft/ecommerce");
			File targetPath=new File((String)reportDirectory+"/failedscreen/"+methodName+""+date.format(cal.getTime())+".png");
			
			
			try {
				
				FileHandler.copy(sourcePath, targetPath);
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
			//It will add the screenshot in Emailable HTML report
			Reporter.log("<a href='"+targetPath.getAbsolutePath()+"'>"+"<img src='"+targetPath.getAbsolutePath()+"' height='100' width='100'/></>");
			
			
		}
		
	
		
	}

	public void onTestSkipped(ITestResult arg0) {
		Reporter.log("Test is skipped "+arg0.getMethod().getMethodName());
		
	}

	public void onTestStart(ITestResult arg0) {
		Reporter.log("Test start Running "+arg0.getMethod().getMethodName());
	}

	public void onTestSuccess(ITestResult arg0) {
		Reporter.log("Test is Success "+arg0.getMethod().getMethodName());
		Calendar cal=Calendar.getInstance();
		SimpleDateFormat date=new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
		String methodName=arg0.getName();
		if(arg0.isSuccess()) {
			//TakesScreenshot tss = ((TakesScreenshot)driver);
			//File file = tss.getScreenshotAs(OutputType.FILE);  //it will take screenshot and save in file
			//FileHandler.copy(from, to);
			
			File sourcePath=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			String reportDirectory=(new File(System.getProperty("user.dir")).getAbsolutePath()+"/src/main/java/com/durgasoft/ecommerce");
			File targetPath=new File((String)reportDirectory+"/passedscreen/"+methodName+""+date.format(cal.getTime())+".png");
			
			
			try {
				
				FileHandler.copy(sourcePath, targetPath);
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
			//It will add the screenshot in Emailable HTML report
			Reporter.log("<a href='"+targetPath.getAbsolutePath()+"'>"+"<img src='"+targetPath.getAbsolutePath()+"' height='100' width='100'/></>");
			
			
		}
		
	}

}
