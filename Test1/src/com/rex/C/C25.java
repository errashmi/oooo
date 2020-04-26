//25-pop up window handling in the site http://demo.guru99.com/popup.php
package com.rex.C;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C25 {
	public static WebDriver driver;
	public static void main(String[] args) throws Exception {
		browserLaunch();
		C25 obj= new C25();
		obj.winHandling();
	}
	public void winHandling() throws Exception {
		driver.findElement(By.linkText("Click Here")).click();
		Thread.sleep(3000);
		Set<String> sid = driver.getWindowHandles();
		Object[] aid = sid.toArray();
		driver.switchTo().window(aid[1].toString());
		driver.findElement(By.name("emailid")).sendKeys("rashmi");
	}
	public static void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
	}
}
