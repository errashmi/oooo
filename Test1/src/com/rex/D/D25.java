//35-Write a program to Login to Facebook using javascript .” https://www.facebook.com/”
package com.rex.D;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D25 {
	public static WebDriver driver;
	public static void main(String[] args) {
		browserLaunch();
		javascriptExecutorDemo();
	}
	public static void javascriptExecutorDemo() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.getElementById('email').value='rashmi'");
		js.executeScript("document.getElementById('pass').value='rashmi'");
		js.executeScript("document.getElementById('u_0_b').click()");
	}
	public static void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}
}
