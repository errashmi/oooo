package com.rashmi.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

class Open_All_Browser{
	public static WebDriver driver; //static variable "driver" is created as it is to be accessed in every method
	public static void open_chrome() {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.google.com");
		driver.close();
	}
	public static void open_FF() {
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver-v0.24.0-win32\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("http://www.google.com");
		driver.close();
	}
	public static void open_IE() {
		System.setProperty("webdriver.ie.driver", "D:\\Selenium\\IEDriverServer_Win32_3.14.0\\IEDriverServer.exe");
		driver=new InternetExplorerDriver();
		driver.get("http://www.google.com");
		driver.close();
	}
	
}
public class Open_All_Browser_2 {

	public static void main(String[] args) {
		Open_All_Browser.open_chrome(); //static method can be accessed directly through class name without creating object
		Open_All_Browser.open_FF();
		Open_All_Browser.open_IE();
		
	}

}
