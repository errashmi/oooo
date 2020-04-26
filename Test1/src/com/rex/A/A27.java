//27-write a program to demonstrate dynamic web table in http://demo.guru99.com/test/web-table-element.php
package com.rex.A;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A27 {
	public WebDriver driver;
	public static void main(String[] args) {
		A27 obj=new A27();
		obj.browserLaunch();
		obj.tabledata();

	}
	public void tabledata() {
		List<WebElement> c = driver.findElements(By.xpath("//table[@class='dataTable']/thead/tr/th"));
		System.out.println("No of columns in the table are "+c.size());
		List<WebElement> r = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));
		System.out.println("No of rows in the table are "+r.size());
		
	}
	public void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		driver.manage().window().maximize();
	}
}
