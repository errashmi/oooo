//20-Write a program to demonstrate drag and drop event in https://jqueryui.com/droppable/
package com.rex.C;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class C20 {
	public static WebDriver driver;
	public static void main(String[] args) {
		browserLaunch();
		C20 obj=new C20();
		obj.dragdropDemo();
	}
	public void dragdropDemo() {
		driver.switchTo().frame(0);
		WebElement src = driver.findElement(By.id("draggable"));
		WebElement dsc = driver.findElement(By.id("droppable"));
		Actions act= new Actions(driver);
		//act.dragAndDrop(src, dsc).perform();
		act.clickAndHold(src).moveToElement(dsc).release().perform();
	}
	public static void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
	}

}
