package com.rashmi.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Open_All_Browser_1 {

	public void open_chrome() {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver dri=new ChromeDriver();	//"dri" is reference variable so we can give any name
		dri.get("http://www.google.com");
		dri.close();
	}
	public void open_IE() {
		System.setProperty("webdriver.ie.driver", "D:\\Selenium\\IEDriverServer_Win32_3.14.0\\IEDriverServer.exe");
		InternetExplorerDriver driver=new InternetExplorerDriver(); //"InternetExplorerDriver" is a concrete class which implements the interface "webdriver",so we can create object of it and access its member
		driver.get("http://www.google.com");
		driver.close();
	}
	public void open_FF(){
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver-v0.24.0-win32\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.google.com");
		driver.close();
	}
	public static void main(String[] args) {
	
		Open_All_Browser_1 oab1=new Open_All_Browser_1();
		oab1.open_chrome();
		oab1.open_FF();
		oab1.open_IE();
	}

}
