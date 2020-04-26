//27-write a program to count no of rows and columns and get data from dynamic web table in http://demo.guru99.com/test/web-table-element.php
package com.rex.D;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D17 {
	public static WebDriver driver;
	public static void main(String[] args) {
		browserLaunch();
		dynamicWebTableDemo();
	}
	public static void dynamicWebTableDemo() {
		List<WebElement> cols = driver.findElements(By.xpath("//table[@class='dataTable']/thead/tr/th"));
		System.out.println("No of Columns in the table are : "+cols.size());
		List<WebElement> rows = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));
		System.out.println("No of rows in the table are : "+rows.size());
		
	}
	public static void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		driver.manage().window().maximize();
	}
}
