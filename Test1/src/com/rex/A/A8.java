//08-Write a program to login into facebook using cssSelector https://www.facebook.com/
package com.rex.A;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A8 {
	public WebDriver driver;
	public static void main(String[] args) {
		A8 obj=new A8();
		obj.browserLaunch();
		obj.cssSelectorDemo();
	}
	public void cssSelectorDemo() {
		driver.findElement(By.cssSelector("input#email")).sendKeys("rashmi");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("rashmi");
	}
	public void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}
}
