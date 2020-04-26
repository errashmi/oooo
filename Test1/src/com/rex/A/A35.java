//35-Write a program to Login to Facebook using javascript .” https://www.facebook.com/”
package com.rex.A;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A35 {
	public WebDriver driver;
	public static void main(String[] args) {
		A35 obj=new A35();
		obj.browserLaunch();
		obj.login();

	}
	public void login() {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("document.getElementById('email').value='rashmi'");
		js.executeScript("document.getElementById('pass').value='rashmi'");
		js.executeScript("document.getElementById('loginbutton').click()");
	}
	public void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}
}
