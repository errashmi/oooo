//25-pop up window handling in the site http://demo.guru99.com/popup.php
package com.rex.A;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A25 {
	public WebDriver driver;
	public static void main(String[] args) {
		A25 obj=new A25();
		obj.browserLaunch();
		obj.windowHandeling();

	}
	public void windowHandeling() {
		driver.findElement(By.linkText("Click Here")).click();
		Set<String> winID = driver.getWindowHandles();
		Object[] id = winID.toArray();
		driver.switchTo().window(id[1].toString());
		driver.findElement(By.name("emailid")).sendKeys("rashmi");
	}
	public void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
	}
}
