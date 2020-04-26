//21-Write a program to resize the an object in https://jqueryui.com/resizable/
package com.rex.C;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class C21 {
	public static WebDriver driver;
	public static void main(String[] args) {
		browserLaunch();
		C21 obj=new C21();
		obj.resizrDemo();
	}
	public void resizrDemo() {
		driver.switchTo().frame(0);
		WebElement resizeIcon = driver.findElement(By.xpath("//div[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']"));
		Actions act=new Actions(driver);
		act.clickAndHold(resizeIcon).moveByOffset(300, 80).release().build().perform();
	}
	public static void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://jqueryui.com/resizable/");
		driver.manage().window().maximize();
	}
}
