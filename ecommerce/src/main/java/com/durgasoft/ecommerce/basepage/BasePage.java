package com.durgasoft.ecommerce.basepage;

import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;
import java.util.Random;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.relevantcodes.extentreports.LogStatus;

public class BasePage {
	public static com.relevantcodes.extentreports.ExtentReports extent;
	public com.relevantcodes.extentreports.ExtentTest test;
	public ITestResult currentMethod;
	public static WebDriver driver;
	public String log4jPath="./log4j.properties";  //variable for log4j property file path
	
	static {
		Date dt=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("dd_MM_yy_hh_mm_ss");
		String cdate = sdf.format(dt);
		
		extent=new com.relevantcodes.extentreports.ExtentReports(System.getProperty("user.dir")+"/ExtentReports/Report "+cdate+".html");
	}
	
	/*public void getResult(ITestResult result2) {
		
		test.log(LogStatus.PASS,result2.getName()+"Test is passed");
	}*/
	@BeforeMethod
	//public void startReport(Method currentMethod) {
	public void startReport(Method currentMethod) {  //A Method provides information about, and access to, a single method on a class or interface
		test=extent.startTest(currentMethod.getName());
		test.log(LogStatus.INFO, currentMethod.getName()+"test started");
	}
	@AfterMethod
	public void endreport(ITestResult result) {   //ITestResult is an interface,it describes the result of a test.
		//getResult(result);
		if(result.getStatus()==ITestResult.SUCCESS) {
			test.log(LogStatus.PASS, result.getName()+"Test is success");
		}
		else if(result.getStatus()==ITestResult.FAILURE) {
			test.log(LogStatus.FAIL, result.getName()+"Test is failed");
		}
		else if(result.getStatus()==ITestResult.SKIP) {
			test.log(LogStatus.SKIP, result.getName()+"Test is skipped");
		}
	}
	//METHOD TO RETRIVE DATA FROM CONGIF FILE
	public static final String path="./config.properties";
	public String getData(String key) throws Exception {
		File f=new File(path);
		FileInputStream fi=new FileInputStream(f);
		Properties p=new Properties();
		p.load(fi);	
		return p.getProperty(key);
	}

	//METHOD TO LAUNCH BROWSER
	public void browserLaunch(String browser, String url) {
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			
		}
		else if(browser.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver","D:\\Selenium\\IEDriverServer_Win32_3.14.0\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
			
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver-v0.24.0-win32\\geckodriver.exe");
			driver=new FirefoxDriver();
			
		}
		driver.get(url);
		driver.manage().window().maximize();
		PropertyConfigurator.configure(log4jPath);//  log4j congiguration with property file
	}
	//METHOD TO GENERATE A RANDOM NUMBER
	public int randomNumber() {
		Random r=new Random();
		int random=r.nextInt(9999);
		return random;
				
	}
	//METHOD TO SELECT OPTIONS FROM DROPDOWN
	public void selectOptions(WebElement element, int index) {
		//new Select(element).selectByIndex(index);
		Select s=new Select(element);
		s.selectByIndex(index);
		System.out.println(s);
	}
	//METHOD TO GET CURRENT DATE AND TIME
	public static Date getDate() {
		Date dt=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("dd_MM_yy_hh_mm_ss");
		sdf.format(dt);
		return dt;
	}
	
}
