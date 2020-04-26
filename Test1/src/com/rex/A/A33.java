//33-Write a program to demonstrate iframe in the site "https://seleniumhq.github.io/selenium/docs/api/java/"
package com.rex.A;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A33 {
	public WebDriver driver;
	public static void main(String[] args) throws Exception {
		A33 obj=new A33();
		obj.browserLaunch();
		obj.frameHandeling();

	}
	public void frameHandeling() throws Exception {
		//driver.findElement(By.linkText("org.openqa.selenium")).click();	NoSuchElementException:
		driver.switchTo().frame("packageListFrame");
		driver.findElement(By.linkText("org.openqa.selenium")).click();
		Thread.sleep(3000);
		driver.switchTo().parentFrame();
		driver.switchTo().frame(1);
		driver.findElement(By.linkText("WebDriver")).click();
	}
	public void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://seleniumhq.github.io/selenium/docs/api/java/");
		driver.manage().window().maximize();
	}
}
