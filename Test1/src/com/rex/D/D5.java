//10-Write a program to display all the links in amazon.in page “https://www.amazon.in/
package com.rex.D;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D5 {
	public static WebDriver driver;
	public static void main(String[] args) {
		browserLaunch();
		getAllLinks();
	}
	public static void getAllLinks() {
		List<WebElement> links = driver.findElements(By.tagName("a"));
		for(int i=0;i<links.size();i++) {
			System.out.println(links.get(i).getText());
		}
		System.out.println("Total links count :"+links.size());
	}
	public static void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
	}
}
