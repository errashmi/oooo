//21-Write a program to resize the an object in https://jqueryui.com/resizable/
package com.rex.D;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class D11 {
	public static WebDriver driver;
	public static void main(String[] args) {
		browserLaunch();
		resizeDemo();
	}
	public static void resizeDemo() {
		driver.switchTo().frame(0);
		WebElement icon = driver.findElement(By.xpath("//div[@id='resizable']/div[3]"));
		Actions act=new Actions(driver);
		act.clickAndHold(icon).moveByOffset(100, 80).release().build().perform();
	}

	public static void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://jqueryui.com/resizable/");
		driver.manage().window().maximize();
	}
}
