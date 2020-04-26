//18-Write a program to select "Weather" option in "MORE" dropdown of "https://www.bbc.com/" if it is available
package com.rex.D;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D8 {
	public static WebDriver driver;
	public static void main(String[] args) {
		browserLaunch();
		bootStrapDropDownDemo();
	}
	public static void bootStrapDropDownDemo() {
		driver.findElement(By.linkText("More")).click();
		WebElement panel = driver.findElement(By.xpath("//div[@class='orb-panel-content b-g-p b-r orb-nav-sec']"));
		List<WebElement> links = panel.findElements(By.tagName("a"));
		for(int i=0;i<links.size();i++) {
			System.out.println(links.get(i).getText());
			if(links.get(i).getText().equalsIgnoreCase("Weather"))
				links.get(i).click();
		}
	} 
	public static void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.bbc.com/");
		driver.manage().window().maximize();
	}
}
