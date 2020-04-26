//41-Write a program to demonstrate fileupload using  sikuli https://www.freepdfconvert.com/
package com.rex.C;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

public class C40 {
	public static WebDriver driver;
	public static void main(String[] args) throws Exception {
		C40 obj=new C40();
		browserLaunch();
		obj.fileUpload();
		Screen s=new Screen();
		Thread.sleep(3000);
		s.click("SikuliImages\\downloads.png");
		Thread.sleep(3000);
		s.click("SikuliImages\\doc1.png");
	}
	public void fileUpload() {
		driver.findElement(By.xpath("//div[@class='btn btn-success icon-left-large img-plus-white upload-btn']")).click();
	}
	public static void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.freepdfconvert.com/");
		driver.manage().window().maximize();
	}
}
