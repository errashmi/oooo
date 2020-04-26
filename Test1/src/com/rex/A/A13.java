//13-Write a program to click on each radio button on http://echoecho.com/htmlforms10.htm
package com.rex.A;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A13 {
	public WebDriver driver;
	public static void main(String[] args) {
		A13 obj=new A13();
		obj.browserLaunch();
		obj.radioDemo2();
	}
	public void radioDemo2() {
		List<WebElement> rad = driver.findElements(By.xpath("//input[@type='radio']"));
		for(int i=0;i<rad.size();i++) {
			rad.get(i).click();
		}
	}
	public void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://echoecho.com/htmlforms10.htm");
		driver.manage().window().maximize();
	}
}
