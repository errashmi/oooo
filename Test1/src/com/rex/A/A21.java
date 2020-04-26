//21-Write a program to resize the an object in https://jqueryui.com/resizable/
package com.rex.A;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A21 {
	public WebDriver driver;
	public static void main(String[] args) {
		A21 obj=new A21();
		obj.browserLaunch();
		obj.resize();

	}
	public void resize() {
		driver.switchTo().frame(0);
		WebElement icon = driver.findElement(By.xpath("//div[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']"));
		Actions act=new Actions(driver);
		act.clickAndHold(icon).moveByOffset(100, 70).release().perform();
	}
	
	public void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://jqueryui.com/resizable/");
		driver.manage().window().maximize();
	}
}
