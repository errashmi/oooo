//37-Write a program to navigate to a page and scroll down using javascriptexecutor
package com.rex.E;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class E5 {
	public static WebDriver driver;
	public static void main(String[] args) {
		E5 obj=new E5();
		obj.browserLaunch();
		obj.getFB();
	}
	public void getFB() {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("window.location='https://www.facebook.com/'");
		js.executeScript("window.scrollBy(0,600)");
	}
	public void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	}
}
