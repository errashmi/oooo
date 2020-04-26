package basePage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public static WebDriver driver;
	public String configFilePath="./config.properties";
	public String log4jconfigFilePath="./log4j.properties";
	//method to get data from property file
	public String get(String key) throws Exception {
		FileInputStream fi=new FileInputStream(configFilePath);
		Properties p=new Properties();
		p.load(fi);
		return p.getProperty(key);
	}
	//method to launch browser
	public void browserLaunch(String browser, String url) {
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./DriverFiles/geckodriver.exe");
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", "./DriverFiles/IEDriverServer.exe");
			driver=new ChromeDriver();
		}
		driver.get(url);
		driver.manage().window().maximize();
	}

}
