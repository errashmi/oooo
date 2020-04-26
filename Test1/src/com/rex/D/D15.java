//25-pop up window handling in the site http://demo.guru99.com/popup.php
package com.rex.D;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D15 {
	public static WebDriver driver;
	public static void main(String[] args) {
		browserLaunch();
		windowHandeling();
	}
	public static void windowHandeling() {
		driver.findElement(By.linkText("Click Here")).click();
		Set<String> winId = driver.getWindowHandles();
		Object[] winObj = winId.toArray();
		driver.switchTo().window(winObj[1].toString());
		System.out.println(winObj);
		driver.findElement(By.name("emailid")).sendKeys("Rashmi");
	}
	public static void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
	}
}
