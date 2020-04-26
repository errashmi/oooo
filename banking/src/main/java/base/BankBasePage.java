package base;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class BankBasePage {
	public static WebDriver driver;
	public String propFilePath="./config.properties";
	public String excelFilePath="D:\\Selenium\\ExcelFiles\\xl1.xlsx";
	public FileInputStream fi;
	public static ExtentHtmlReporter exReporter;
	public static ExtentReports extent;
	public static ExtentTest test;
	public ITestResult result;
	//METHOD TO GET CURRENT DATE TIME
	public String getDate() {
		java.util.Date dt=new java.util.Date();
		SimpleDateFormat sdf=new SimpleDateFormat("dd_MM_yy_hh_mm_ss");
		String date = sdf.format(dt);
		return date;
	}
	//METHOD TO CAPTURE SCREENSHOTS
	public File captureSS(String FileName) throws Exception {
		TakesScreenshot tss = (TakesScreenshot)driver;
		File src = tss.getScreenshotAs(OutputType.FILE);
		File dsc=new File("./Screenshots/"+FileName+"_"+getDate()+".png");
		FileHandler.copy(src, dsc);
		return dsc;
	}
	//METHOD TO GET DATA FROM PROPERTY FILE
	public String getData(String key) throws Exception {
		fi=new FileInputStream(propFilePath);
		Properties p=new Properties();
		p.load(fi);
		return p.getProperty(key);
	}
	//METHOD TO LAUNCH BROWSER
	public void browserLaunch(String browser, String url) {
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./DriverFiles/geckodriver.exe");
			driver=new ChromeDriver();
		}
		driver.get(url);
		driver.manage().window().maximize();
	}

}
