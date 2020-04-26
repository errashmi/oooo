//36:Write a program to fetch the details of the site like URL of the site, title name and domain name of the site.“https://www.facebook.com/”
package com.rex.D;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D26 {
	public static WebDriver driver;
	public static void main(String[] args) {
		browserLaunch();
		getData();
	}
	public static void getData() {
		System.out.println("URL Of THE PAGE IS : "+driver.getCurrentUrl());
		System.out.println("TITLE OF THE PAGE IS : "+driver.getTitle());
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		String domain=js.executeScript("return document.domain;").toString();
		System.out.println("Domain name of site is : "+domain);
		
	}
	public static void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}
}
