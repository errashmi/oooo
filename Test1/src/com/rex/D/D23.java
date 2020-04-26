//33-Write a program to demonstrate iframe in the site https://seleniumhq.github.io/selenium/docs/api/java/
package com.rex.D;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D23 {
	public static WebDriver driver;
	public static void main(String[] args) throws Exception {
		browserLaunch();
		iframeDemo();
	}
	public static void iframeDemo() throws Exception {
		driver.switchTo().frame(0);  //switching to frame by Index
		driver.findElement(By.linkText("org.openqa.selenium")).click();
		driver.switchTo().parentFrame();
		driver.switchTo().frame("packageListFrame"); //switching to frame by name
		Thread.sleep(2000);
		driver.findElement(By.linkText("org.openqa.selenium.chrome")).click();
		driver.switchTo().defaultContent();
		WebElement frame2 = driver.findElement(By.xpath("//frame[@name='packageFrame']"));
		driver.switchTo().frame(frame2);  //switching to frame by webElement
		Thread.sleep(2000);
		driver.findElement(By.linkText("ChromeDriver")).click();
	}
	public static void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://seleniumhq.github.io/selenium/docs/api/java/");
		driver.manage().window().maximize();
	}
}
