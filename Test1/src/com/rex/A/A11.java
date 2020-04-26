//11-write a program to demonstrate how to write on textbox ,clear textbox and submit the form “http://www.seleniumbymahesh.com/HMS/”
package com.rex.A;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A11 {
	public WebDriver driver;
	public static void main(String[] args) {
		A11 obj=new A11();
		obj.browserLaunch();
		obj.textBoxDemo();

	}
	public void textBoxDemo() {
	driver.findElement(By.name("username")).sendKeys("rashmi");
	driver.findElement(By.name("username")).clear();
	driver.findElement(By.name("username")).sendKeys("admin");
	driver.findElement(By.name("password")).sendKeys("admin");
	driver.findElement(By.name("submit")).click();
	}
	public void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.seleniumbymahesh.com/HMS/");
		driver.manage().window().maximize();
	}
}
