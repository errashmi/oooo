//06-Write a program to login into newtour side by using Name locator ” http://newtours.demoaut.com/mercurywelcome.php”
package com.rex.A;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A6 {
	public WebDriver driver;
	public static void main(String[] args) {
		A6 obj=new A6();
		obj.browserLaunch();
		obj.login();
	}
	public void login() {
		driver.findElement(By.name("userName")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin");
		driver.findElement(By.name("login")).click();
	}
	public void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/mercurywelcome.php");
		driver.manage().window().maximize();
	}
}
