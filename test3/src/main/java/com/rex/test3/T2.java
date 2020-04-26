//02-Write a program to launch "Mercury Tours" site and verify its title.” http://newtours.demoaut.com/mercurywelcome.php
package com.rex.test3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2 {
	public static WebDriver driver;
	public static void main(String[] args) {
		browserLaunch();
		verifyTitle();
	}
	public static void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/mercurywelcome.php");
		driver.manage().window().maximize();
	}
	public static void verifyTitle() {
		String tit=driver.getTitle();
		System.out.println(tit);
		if(tit.equalsIgnoreCase("Welcome: Mercury Tours")) {
			System.out.println("Title verified successfully");
		}
	}

}
