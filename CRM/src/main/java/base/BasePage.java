package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.logging.FileHandler;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BasePage {
	public static WebDriver driver;
	public String propFilePath="./config.properties";
	//method to launch browser
	public void launchBrowser(String browser, String url) {
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/DriverFiles/chromedriver.exe");
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
		String log4jFilePath="./log4j.properties";
		PropertyConfigurator.configure(log4jFilePath);
	}
//method to get data from property file
	public String getData(String key) throws Exception {
		FileInputStream fi=new FileInputStream(propFilePath);
		Properties prop=new Properties();
		prop.load(fi);
		String val=prop.getProperty(key);
		return val;
	}
	
//Method to capture screenshot
	public File captureScreenShot(String fileName) throws Exception {
		TakesScreenshot tss = (TakesScreenshot)driver;
		File src = tss.getScreenshotAs(OutputType.FILE);
		File dsc=new File("./Screenshots/"+fileName+getDate()+".png");
		org.openqa.selenium.io.FileHandler.copy(src, dsc);
		return dsc;
		
	}
	
//Method to get current date
	public String getDate() {
		Date dt=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("dd_MM_yy_hh_mm_ss");
		String date=sdf.format(dt);
		return date;
	}
}
