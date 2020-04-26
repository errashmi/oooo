//16-Write a program to click on facebook logo image in "https://www.facebook.com"page.
package com.rex.A;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A16 {
	public WebDriver driver;
	public static void main(String[] args) {
		A16 obj=new A16();
		obj.browserLaunch();
		obj.image();
	}
	public void image() {
		driver.findElement(By.xpath("//i[@class='fb_logo img sp_QPh7VHZc0Ga sx_dad6ce']")).click();
	}
	public void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
	}
}
