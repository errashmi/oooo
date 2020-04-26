//13-Write a program to click on each radio button on http://echoecho.com/htmlforms10.htm
package com.rex.D;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D6 {
	public static WebDriver driver;
public static void main(String[] args) {
	browserLaunch();
	radioDemo1();
}
public static void radioDemo1() {
	List<WebElement> rbtn = driver.findElements(By.xpath("//input[@type='radio']"));
	for(int i=0;i<rbtn.size();i++) {
		rbtn.get(i).click();
	}
}
public static void browserLaunch() {
	System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://echoecho.com/htmlforms10.htm");
	driver.manage().window().maximize();
}
}
