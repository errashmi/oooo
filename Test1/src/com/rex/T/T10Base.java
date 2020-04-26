package com.rex.T;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T10Base {
	public WebDriver driver;
	public void BrowserLaunch(String browser, String url) {
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
			driver=new ChromeDriver();		
		}
		else if(browser.equalsIgnoreCase("firefox")) {}
		else if(browser.equalsIgnoreCase("ie")) {}
		driver.get(url);
		driver.manage().window().maximize();
	}

}
