//23-Write a program to accept and dismiss javascript alert in the site http://demo.guru99.com/test/delete_customer.php
package com.rex.D;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D13 {
	public static WebDriver driver;
	public static void main(String[] args) {
		browserLaunch();
		javaScriptAlertDemo();
	}
	public static void javaScriptAlertDemo() {
		driver.findElement(By.name("cusid")).sendKeys("1234");
		driver.findElement(By.name("submit")).click();
		driver.switchTo().alert().accept();
		driver.switchTo().alert().accept();		//accepting the alert
		driver.findElement(By.name("cusid")).sendKeys("9090");
		driver.findElement(By.name("submit")).click();
		driver.switchTo().alert().dismiss();	//rejecting the alert
	}
	public static void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
	}
}
