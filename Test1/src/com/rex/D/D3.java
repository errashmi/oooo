//17-Write a program to select birthday in facebook “https://www.facebook.com/”
package com.rex.D;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class D3 {
	public static WebDriver driver;
	public static void main(String[] args) {
		browserLaunch();
		DropDownDemo();
	}
	public static void DropDownDemo() {
		WebElement daySel = driver.findElement(By.id("day"));
		WebElement monSel = driver.findElement(By.id("month"));
		WebElement yearSel = driver.findElement(By.id("year"));
		new Select(daySel).selectByValue("15");
		new Select(monSel).selectByVisibleText("Feb");
		new Select(yearSel).selectByIndex(28);
		
	}
	public static void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}
}
