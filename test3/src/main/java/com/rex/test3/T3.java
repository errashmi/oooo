//03-Write a program to Login into HMS “http://www.seleniumbymahesh.com/”
package com.rex.test3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T3 {
	public static WebDriver driver;
	public static void main(String[] args) throws Exception {
		browserLaunch();
		Thread.sleep(3000);
		verifyLogin();

	}
	public static void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.seleniumbymahesh.com/");
		driver.manage().window().maximize();
	}
	public static void verifyLogin() throws Exception {
		driver.findElement(By.linkText("HMS")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin");
		driver.findElement(By.name("submit")).click();
	}
}
