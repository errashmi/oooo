//36-Write a program to fetch the details of the site like URL of the site, title name and domain name of the site.
package com.rex.A;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A36 {
	public WebDriver driver;
	public static void main(String[] args) {
		A36 obj=new A36();
		obj.browserLaunch();
		obj.siteDetails();

	}
	public void siteDetails() {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		String url=js.executeScript("return document.URL;").toString();
		String domain=js.executeScript("return document.domain;").toString();
		String title=js.executeScript("return document.title;").toString();
		System.out.println("Url of site is : "+url);
		System.out.println("Domain name of site is : "+domain);
		System.out.println("Title of site is : "+title);
	}
	public void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}
}
