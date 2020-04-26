//07-Write a program to describe LinkText and PartialLinkText. http://newtours.demoaut.com/mercurywelcome.php”
package com.rex.D;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D4 {
	public static WebDriver driver;
	public static void main(String[] args) {
		browserLaunch();
		linkTestDemo();
	}
	public static void linkTestDemo() {
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.partialLinkText("Car ")).click();
	}
	public static void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/mercurywelcome.php");
		driver.manage().window().maximize();
	}
}
