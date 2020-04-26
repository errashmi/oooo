package basepage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.Random;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;



public class Basepage {
	public static WebDriver driver;
	public static final String log4jpath="log4j.properties";
	public static ExtentHtmlReporter exReporter;
	public static ExtentReports extent;
	public static ExtentTest test;
	public ITestResult result;
	
	@BeforeSuite
		public void configExtentReport() {
		exReporter = new ExtentHtmlReporter(System.getProperty("user.dir")+"/ExtentReports/test"+getDate()+".html");
		extent=new ExtentReports();
		extent.attachReporter(exReporter);
		
	}
	@AfterSuite
	public void tearDown() {
		extent.flush();
	}
	
	@BeforeMethod
	public void startReport(Method methodName) {
		test=extent.createTest(methodName.getName());
		test.log(Status.INFO, methodName.getName()+" test started");  //This log will be added to extent report
	}
	@AfterMethod
	public void endreport(ITestResult result) throws Exception {   //ITestResult is an interface,it describes the result of a test.
		if(result.getStatus()==ITestResult.SUCCESS) {
			test.log(Status.PASS, result.getName()+" Test is success");
			File FCC = capturescreenshot(result.getName());
			test.pass("Snapshot below"+test.addScreenCaptureFromPath(FCC.getAbsolutePath()));
			}
		else if(result.getStatus()==ITestResult.FAILURE) {
			test.log(Status.FAIL, result.getName()+" Test is failed");
			File FCC = capturescreenshot(result.getName());
			test.fail("Snapshot below :"+test.addScreenCaptureFromPath(FCC.getAbsolutePath()));
			}
		else if(result.getStatus()==ITestResult.SKIP) {
			test.log(Status.SKIP, result.getName()+" Test is skipped");
			test.skip(result.getThrowable());
		}
		
	}
	//METHOD TO LAUNCH BROWSER
	public void browserLaunch(String browser, String url) {
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/DriverFiles/chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/DriverFiles/geckodriver.exe");
			driver=new FirefoxDriver();		
		}
		else if(browser.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"/DriverFiles/IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		}
		driver.get(url);
		driver.manage().window().maximize();
		PropertyConfigurator.configure(log4jpath);
	}
	//METHOD TO GET DATA FROM CONFIG FILE
	public static final String path="./config.properties";
	public String get(String key) throws Exception {
		File f=new File(path);
		FileInputStream fi=new FileInputStream(f);
		Properties p=new Properties();
		p.load(fi);
		return p.getProperty(key);
		
	}
	//METHOD TO GENETATE 4 DIGIT RANDOM NUMBER
	public int getrandom() {
		Random r=new Random();
		int random=r.nextInt(9999);
		return random;
	}
	
	//METHOD TO SELECT INDEX VALUE FROM DROPDOWN
	public void selectoption(WebElement element, int index) {
		new Select(element).selectByIndex(index);
	}
	//METHOD TO CAPTURE SCREENSHOTS
	public File capturescreenshot(String name) throws Exception {
		/*Date dt=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("dd_MM_yy_hh_mm_ss");
		String date = sdf.format(dt);*/
		TakesScreenshot tss = (TakesScreenshot)driver;
		File src = tss.getScreenshotAs(OutputType.FILE);
		//File dsc=new File(System.getProperty("user.dir")+"/Screenshots/"+name+date+".png");
		File dsc=new File(System.getProperty("user.dir")+"/Screenshots/"+name+getDate()+".png");
		FileHandler.copy(src, dsc);
		return dsc;
	}
	//METHOD TO GET CURRENT DATE
	public String getDate() {
		Date dt=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("dd_MM_yy_hh_mm_ss");
		String date = sdf.format(dt);
		return date;
	}
}
