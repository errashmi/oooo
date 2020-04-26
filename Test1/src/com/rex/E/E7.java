//40-Write a program to demonstrate fileupload using  sikuli https://www.freepdfconvert.com/
package com.rex.E;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

public class E7 {
	public static WebDriver driver;
	public static void main(String[] args) throws Exception {
		E7 obj=new E7();
		obj.browserLaunch();
		obj.sikuliDemo();
	}
	public void sikuliDemo() throws Exception {
		driver.findElement(By.xpath("(//div[text()='Choose file'])[1]")).click();
		Thread.sleep(2000);
		Screen scr=new Screen();
		scr.click("D:\\Selenium\\Selenium_WD\\Test1\\SikuliImages\\desktop.png");
	}
	public void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.freepdfconvert.com/");
		driver.manage().window().maximize();
	}
}
