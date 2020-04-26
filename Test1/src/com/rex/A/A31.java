//31-Write a program to select a particular data in the url "http://demo.guru99.com/test/"
package com.rex.A;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A31 {
	public static WebDriver driver;
	

	public static void main(String[] args) {
		A31 obj=new A31();
		obj.browserLaunch();
		obj.selectDate();
		
		
	}
	public void selectDate() {
		WebElement date = driver.findElement(By.name("bdaytime"));
		date.sendKeys("02/15/1992");
		date.sendKeys(Keys.TAB);
		date.sendKeys("1223PM");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
	public void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/");
		driver.manage().window().maximize();
	}
}
