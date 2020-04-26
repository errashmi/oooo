//23-Write a program to accept and dismiss javascript alert in the site http://demo.guru99.com/test/delete_customer.php
package com.rex.A;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A23 {
	public WebDriver driver;
	public static void main(String[] args) {
		A23 obj=new A23();
		obj.browserLaunch();
		obj.javascriptAlerthandeling();

	}
	public void javascriptAlerthandeling() {
		driver.findElement(By.name("cusid")).sendKeys("123");
		driver.findElement(By.name("submit")).click();
		driver.switchTo().alert().accept();
		driver.switchTo().alert().accept();
		driver.findElement(By.name("cusid")).sendKeys("111");
		driver.findElement(By.name("submit")).click();
		driver.switchTo().alert().dismiss();
	}
	public void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
	}
}
