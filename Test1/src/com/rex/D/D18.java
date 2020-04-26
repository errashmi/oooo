//28-Write a program to get the tooltip of facebook logo in https://www.facebook.com
package com.rex.D;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D18 {
	public static WebDriver driver;
	public static void main(String[] args) {
		browserLaunch();
		getToolTip();
	}
	public static void getToolTip() {
		String str = driver.findElement(By.xpath("//div[@id='blueBarDOMInspector']/div/div/div/div/h1/a")).getAttribute("title");
		System.out.println("Tooltip of facebook logo is : "+str);
	}
	public static void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
	}
}
