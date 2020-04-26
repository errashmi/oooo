//38-Write a program to explain double click and right click on a element.” http://demo.guru99.com/test/simple_context_menu.html
package com.rex.D;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.BrowserType;

public class D27 {
	public static WebDriver driver;
	public static void main(String[] args) {
		browserLaunch();
		mouseEvent();
	}
	public static void mouseEvent() {
		WebElement e1 = driver.findElement(By.xpath("//span[text()='right click me']"));
		WebElement e2 = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		Actions act=new Actions(driver);
		act.contextClick(e1).build().perform(); //Right click demo
		act.doubleClick(e2).build().perform();	//Double click demo
	}
	public static void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
	}
}
