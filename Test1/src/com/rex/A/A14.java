//14-Write a program to demonstrate checkBox "on http://echoecho.com/htmlforms09.htm"
package com.rex.A;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A14 {
	public WebDriver driver;
	public static void main(String[] args) {
		A14 obj=new A14();
		obj.browserLaunch();
		obj.checkBoxDemo();

	}
	public void checkBoxDemo() {
		driver.findElement(By.xpath("//input[@value='Milk']")).click();
		driver.findElement(By.xpath("//input[@value='Butter']")).click();
	}
	public void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://echoecho.com/htmlforms09.htm");
		driver.manage().window().maximize();
	}
}
