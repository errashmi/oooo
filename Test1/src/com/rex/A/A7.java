//07-Write a program to describe LinkText and PartialLinkText.
package com.rex.A;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A7 {
	public WebDriver driver;
	public static void main(String[] args) {
		A7 obj=new A7();
		obj.browserLaunch();
		obj.linkDemo();

	}
	public void linkDemo() {
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.partialLinkText("Car")).click();
	}
	public void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/mercurywelcome.php");
		driver.manage().window().maximize();
	}
}
