//28-Write a program to get the tooltip of facebook logo in https://www.facebook.com
package com.rex.A;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A28 {
	public WebDriver driver;
	public static void main(String[] args) {
		A28 obj=new A28();
		obj.browserLaunch();
		obj.toooltip();

	}
	public void toooltip() {
		WebElement logo = driver.findElement(By.xpath("//div[@class='lfloat _ohe']/h1/a"));
		System.out.println(logo.getAttribute("title"));
	}
	public void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
	}
}
