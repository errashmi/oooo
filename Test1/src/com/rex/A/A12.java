//12-Write a program to click on radio button on http://echoecho.com/htmlforms10.htm
package com.rex.A;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A12 {
	public WebDriver driver;
	public static void main(String[] args) {
		A12 obj=new A12();
		obj.browserLaunch();
		obj.radioDemo();
	}
	public void radioDemo() {
		driver.findElement(By.xpath("//input[@value='Milk']")).click();
		driver.findElement(By.xpath("//input[@value='Water']")).click();
	}
	public void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://echoecho.com/htmlforms10.htm");
		driver.manage().window().maximize();
	}
}
