//15-Write a program to print all the checkbox value and there corresponding status, and select all checkbox in http://echoecho.com/htmlforms09.htm
package com.rex.D;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D7 {
	public static WebDriver driver;
	public static void main(String[] args) {
		browserLaunch();
		checkBoxDemo1();
	}
	public static void checkBoxDemo1() {
		List<WebElement> cb = driver.findElements(By.xpath("//input[@type='checkbox']"));
		for(int i=0;i<cb.size();i++) {
			System.out.println(cb.get(i).getAttribute("value")+"---"+cb.get(i).getAttribute("checked"));
			//if(cb.get(i).getAttribute("checked").equalsIgnoreCase("null")) NullPointerException
			if(!cb.get(i).isSelected())
				cb.get(i).click();
		}
	} 
	public static void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://echoecho.com/htmlforms09.htm");
		driver.manage().window().maximize();
	}
}
