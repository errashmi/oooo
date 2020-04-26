//11-write a program to demonstrate how to write on textbox ,clear textbox and submit the form “http://www.seleniumbymahesh.com/HMS/”
package com.rex.D;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D2 {
	public static WebDriver driver;
	public static void main(String[] args) throws Exception {
		browserLaunch();	//Static method can be called without creating object
		D2 obj=new D2();
		obj.verifyLogin();
	}
	public static void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.seleniumbymahesh.com/HMS/");
		driver.manage().window().maximize();
	}
	public void verifyLogin() throws Exception {
		driver.findElement(By.name("username")).sendKeys("admin123");
		driver.findElement(By.name("username")).clear();
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin");
		driver.findElement(By.name("submit")).click();
	}

}
