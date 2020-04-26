//22-Write a program to demonstrate fileupload and download using selenium http://demo.guru99.com/test/upload/            “http://demo.guru99.com/test/yahoo.html”
package com.rex.D;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D12 {
	public static WebDriver driver;
public static void main(String[] args) throws Exception {
	browserLaunch();
	fileUploadDemo();
	fileDownLoadDemo();
}
public static void fileDownLoadDemo() throws Exception {
	driver.navigate().to("http://demo.guru99.com/test/yahoo.html");
	Thread.sleep(2000);
	driver.findElement(By.id("messenger-download")).click();
}
public static void fileUploadDemo() {
	driver.findElement(By.id("uploadfile_0")).sendKeys("D:\\abc.txt");
	driver.findElement(By.id("terms")).click();
	driver.findElement(By.id("submitbutton")).click();
}
public static void browserLaunch() {
	System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://demo.guru99.com/test/upload/");
	driver.manage().window().maximize();
}
}
