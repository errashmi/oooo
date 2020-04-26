//05-Write a program to login into facebook by using ID Locator
package com.rex.A;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A5 {
	public WebDriver driver;
	public static void main(String[] args) {
		A5 obj=new A5();
		obj.browserLaunch();
		obj.faceBookLogin();

	}
	public void faceBookLogin() {
		driver.findElement(By.id("email")).sendKeys("rashmi");
		driver.findElement(By.id("pass")).sendKeys("rashmi");
		driver.findElement(By.id("pass")).sendKeys(Keys.ENTER);
	}
	public void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}
}
