//18-Write a program to select "Weather" option in "MORE" dropdown of "https://www.bbc.com/" if it is available
package com.rex.A;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A18 {
	public WebDriver driver;

	public static void main(String[] args) {
		A18 obj=new A18();
		obj.browserLaunch();
		obj.bsDropDownDemo();

	}
	public void bsDropDownDemo() {
		driver.findElement(By.xpath("//a[text()='More']")).click();
		WebElement panel = driver.findElement(By.id("orb-panel-more"));
		List<WebElement> links = panel.findElements(By.tagName("li"));
		for(int i=0;i<links.size();i++) {
			System.out.println(links.get(i).getText());
			if(links.get(i).getText().equalsIgnoreCase("Weather"))
				links.get(i).click();
		}
	}
	public void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.bbc.com/");
		driver.manage().window().maximize();
	}
}
