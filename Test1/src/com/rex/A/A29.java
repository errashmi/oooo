//29-Write a program to demonstrate bootstrap tooltip in http://demo.guru99.com/test/tooltip.html
package com.rex.A;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A29 {
	public WebDriver driver;
	public static void main(String[] args) {
		A29 obj=new A29();
		obj.browserLaunch();
		obj.tooltip();
	}
	public void tooltip() {
		WebElement btn = driver.findElement(By.linkText("Download now"));
		Actions act=new Actions(driver);
		act.moveToElement(btn).build().perform();;
		driver.findElement(By.linkText("What's new in 3.2")).click();
	}
	public void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/tooltip.html");
		driver.manage().window().maximize();
	}
}
