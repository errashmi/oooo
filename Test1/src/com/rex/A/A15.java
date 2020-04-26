//15-Write a program to print all the checkbox value and there corresponding status, 
//and select all checkbox in http://echoecho.com/htmlforms09.htm
package com.rex.A;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A15 {
	public WebDriver driver;
	public static void main(String[] args) {
		A15 obj=new A15();
		obj.browserLaunch();
		obj.checkBoxDemo2();

	}
	public void checkBoxDemo2() {
		List<WebElement> cbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		for(int i=0;i<cbox.size();i++) {
			System.out.println(cbox.get(i).getAttribute("value")+cbox.get(i).getAttribute("checked"));
			if(!cbox.get(i).isSelected())
				cbox.get(i).click();
		}
	}
	public void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://echoecho.com/htmlforms09.htm");
		driver.manage().window().maximize();
	}
}
