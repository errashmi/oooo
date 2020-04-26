package com.rex.U;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasePage {
	public static WebDriver driver;
	public FileInputStream fi;
	String propFilePth="./config.properties";
	public void browserLaunch(String browser, String url) {
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./DriverFiles/geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("chrome")) {}
		driver.get(url);
		driver.manage().window().maximize();
	}
	
//method to get data from property file
	public String getData(String key) throws Exception {
		fi=new FileInputStream(propFilePth);
		Properties p=new Properties();
		p.load(fi);
		return p.getProperty(key);
	}

}
