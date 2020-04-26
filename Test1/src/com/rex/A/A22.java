//22-Write a program to demonstrate fileupload and download using selenium http://demo.guru99.com/test/upload/            “http://demo.guru99.com/test/yahoo.html”
package com.rex.A;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A22 {
	public WebDriver driver;
	public static void main(String[] args) {
		A22 obj=new A22();
		obj.browserLaunch();
		obj.fileUpload();

	}
	public void fileUpload() {
		driver.findElement(By.name("uploadfile_0")).sendKeys("D:\\abc.txt");
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("submitbutton")).click();
	}
	public void fileDownload() {
		
	}
	public void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/upload/");
		driver.manage().window().maximize();
	}
}
