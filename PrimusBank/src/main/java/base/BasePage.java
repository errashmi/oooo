package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class BasePage {
	public static WebDriver driver;
	public String propFilePath="./config.properties";
	public FileInputStream fi=null;
	//method to get current time
	public String getDate() {
		Date dt=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("dd_MM_yy_hh_mm_ss");
		return sdf.format(dt);
		
	}
	//METHOD TO CAPTURE SCREENSHOT
	public File capture(String sName) throws Exception {
		TakesScreenshot tss = (TakesScreenshot)driver;
		File src = tss.getScreenshotAs(OutputType.FILE);
		File dsc=new File("./ScreenShots/"+sName+getDate()+".png");
		FileHandler.copy(src, dsc);
		return dsc;
		
	}
	//METHOD TO GET DATA FROM PROPERTY FILE
	public String getData(String Key) throws Exception {
		fi=new FileInputStream(propFilePath);
		Properties p=new Properties();
		p.load(fi);
		return p.getProperty(Key);
	}
	//METHOD TO LAUNCH BROWSER
	public void browserLaunch(String browser, String url) {
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			
		}
		else if(browser.equalsIgnoreCase("ie")) {
			
		}
		driver.get(url);
		driver.manage().window().maximize();
	}

}
