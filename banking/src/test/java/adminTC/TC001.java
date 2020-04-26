package adminTC;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import base.BankBasePage;
import pageUI.HomePage;

import java.lang.reflect.Method;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class TC001 extends BankBasePage {
  @Test (retryAnalyzer=listeners.Retry.class)
  public void verifyLogin() throws Exception {
	  HomePage hp=new HomePage(driver);
	  hp.login();
  }
  @BeforeTest
  public void beforeTest() throws Exception {
	  //browserLaunch("chrome","http://primusbank.qedgetech.com/");
	  browserLaunch(getData("browser"),getData("url"));
  }
  @BeforeSuite
  public void configureReport() {
	  exReporter=new ExtentHtmlReporter("./ExtentReports/test.html");
	  extent=new ExtentReports();
	  extent.attachReporter(exReporter);
  }
  @BeforeMethod
  public void startReport(Method methodName){
	  test=extent.createTest(methodName.getName());
	  test.log(Status.INFO, methodName.getName()+"test Started");
  }
  @AfterMethod
  public void endReport(ITestResult result) {
	  if(result.getStatus()==ITestResult.SUCCESS) {
		  test.log(Status.PASS, result.getName()+"Test is success");
	  }
	  else if(result.getStatus()==ITestResult.FAILURE) {
		  test.log(Status.FAIL, result.getName()+"Test is failed");
	  }
	  else if(result.getStatus()==ITestResult.SKIP) {
		  test.log(Status.SKIP, result.getName()+"Test is skipped");
	  }
  }
  @AfterSuite
  public void tearDown() {
	  extent.flush();
  }
}
