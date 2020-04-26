package basepage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class BasePage {
	public static WebDriver driver;
	public static ExtentHtmlReporter extent;
	public ExtentReports report;
	
	public static String path="./config.properties";
	@BeforeSuite
	public void setupSuite(){
		extent=new ExtentHtmlReporter(System.getProperty("user.dir")+"/ExtentReports/test.html");
		report=new ExtentReports();
		report.attachReporter(extent);
	}
	public void browserLaunch(String browser, String url) {
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//DriverFiles//chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"//DriverFiles//geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver",System.getProperty("user.dir")+"//DriverFiles//IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		}
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	public String getData(String key) throws Exception {
		FileInputStream fi=new FileInputStream(path);
		Properties p=new Properties();
		p.load(fi);
		return p.getProperty(key);
		
	}
	public void captureScreenshot() throws Exception {
		TakesScreenshot tss = (TakesScreenshot)driver;
		File src = tss.getScreenshotAs(OutputType.FILE);
		File dsc=new File(System.getProperty("user.dir")+"/Screenshots/test.png");
		FileHandler.copy(src, dsc);
		
	}


}
