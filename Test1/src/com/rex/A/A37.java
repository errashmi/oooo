
package com.rex.A;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A37 {
	public WebDriver driver;
	public static void main(String[] args) {
		A37 obj=new A37();
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
