//31-Write a program to select a particular date in the url http://demo.guru99.com/test/
package com.rex.D;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D21 {
	public static WebDriver driver;
	public static void main(String[] args) {
		browserLaunch();
		selectDate();
	}
	public static void selectDate() {
		WebElement bdate = driver.findElement(By.name("bdaytime"));
		bdate.sendKeys("02/15/1992");
		bdate.sendKeys(Keys.TAB);
		bdate.sendKeys("02:24PM");
	}
	public static void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/");
		driver.manage().window().maximize();
	}
}
