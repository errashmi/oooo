package com.rashmi.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Open_IE {

	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver", "D:\\Selenium\\IEDriverServer_Win32_3.14.0\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		driver.get("http://www.google.com");
		driver.close();
	
	}

}
