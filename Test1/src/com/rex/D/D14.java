//24-Write a program to login to paytm by handle bootstrap alert in https://paytm.com/
package com.rex.D;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D14 {
	public static WebDriver driver;
	public static void main(String[] args) throws Exception {
		browserLaunch();
		bootStrapAlertDemo();
	}
	public static void bootStrapAlertDemo() throws Exception {
		driver.findElement(By.xpath("//div[text()='Log In/Sign Up']")).click();
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//span[text()='Login/Signup with mobile number and password']")).click();
		driver.findElement(By.name("username")).sendKeys("Rashmi");
	}
	public static void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://paytm.com/");
		driver.manage().window().maximize();
	}
}
