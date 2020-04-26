//10-Write a program to display all the links in amazon.in page “https://www.amazon.in/”
package com.rex.A;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A10 {
	public WebDriver driver;
	public static void main(String[] args) {
		A10 obj=new A10();
		obj.browserLaunch();
		obj.findAllLinks();
	}
	public void findAllLinks() {
		List<WebElement> links = driver.findElements(By.tagName("a"));
		for(int i=0;i<links.size();i++) {
			System.out.println(links.get(i).getText());
		}
		System.out.println("Total number of links are "+links.size());
	}
	public void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	}
}
