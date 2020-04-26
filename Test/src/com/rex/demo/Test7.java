package com.rex.demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Test7 {

	public static void main(String[] args) {
		locatorDemo2 ld=new locatorDemo2();
		ld.browserLaunch();
		ld.LinkTextLocatorDemo();
	}
}
class locatorDemo2{
	public WebDriver driver;
	public void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
	}
	public void LinkTextLocatorDemo() {
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.partialLinkText("Car")).click();
	}
}