//24-Write a program to login to paytm by handle bootstrap alert in https://paytm.com/
package com.rex.A;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A24 {
	public WebDriver driver;
	public static void main(String[] args) throws Exception {
		A24 obj=new A24();
		obj.browserLaunch();
		obj.bootStrapAlertHandeling();
	}
	public void bootStrapAlertHandeling() throws Exception {
		driver.findElement(By.xpath("//div[text()='Log In/Sign Up']")).click();
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//span[text()='Login/Signup with mobile number and password']")).click();
	}
	public void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://paytm.com/");
		driver.manage().window().maximize();
	}
}
