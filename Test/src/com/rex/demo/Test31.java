package com.rex.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test31 {
	public WebDriver driver;
	public static void main(String[] args) {
		Test31 obj=new Test31();
		obj.browserLaunch();
		obj.selectDate();
	}
	public void selectDate() {
		driver.findElement(By.name("bdaytime")).sendKeys("02/15/1992");
		driver.findElement(By.name("bdaytime")).sendKeys(Keys.TAB);
		driver.findElement(By.name("bdaytime")).sendKeys("1223PM");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
	}
	public void browserLaunch() {
		  System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get("http://demo.guru99.com/test/");
		  driver.manage().window().maximize();  
	  }
}
