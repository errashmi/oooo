package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class BasePage {
	public static WebDriver driver;
	String propPath="D:\\Selenium\\Selenium_WD\\T17\\config.properties";
	FileInputStream fi;
	//METHOD TO GET CURRENT DATE TIME
	public String getDate() {
		java.util.Date dt=new java.util.Date();
		SimpleDateFormat sdf=new SimpleDateFormat("dd_MM_yy_hh_mm_ss");
		String date=sdf.format(dt);
		return date;
	}
	
	
	//METHOD TO TAKE SCREENSHOT
	/*public void capture(String name) throws Exception {
		TakesScreenshot tss = (TakesScreenshot)driver;
		File src = tss.getScreenshotAs(OutputType.FILE);
		File dsc=new File(System.getProperty("user.dir")+"\\Screenshots\\"+name+ getDate()+".png");
		FileHandler.copy(src, dsc);
		}*/
	
	public File capture(String name) throws Exception {
		TakesScreenshot tss = (TakesScreenshot)driver;
		File src = tss.getScreenshotAs(OutputType.FILE);
		File dsc=new File(System.getProperty("user.dir")+"\\Screenshots\\"+name+ getDate()+".png");
		FileHandler.copy(src, dsc);
		return dsc;
		}
	//METHOD TO GET DATA FROM PROPERTY FILE
	public String getData(String key) throws Exception {
		fi=new FileInputStream(propPath);
		Properties prop=new Properties();
		prop.load(fi);
		return prop.getProperty(key);
	}
	//METHOD TO LAUNCH BROWSER
	public void browserLaunch(String browser, String url) {
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("chrome")) {}
		else if(browser.equalsIgnoreCase("chrome")) {}
		driver.get(url);
		driver.manage().window().maximize();
	}

}
