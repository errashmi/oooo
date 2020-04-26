//26-Write a program to get text from static webTable "http://www.seleniumbymahesh.com/HMS"
package com.rex.A;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A26 {
	public WebDriver driver;
	public static void main(String[] args) {
		A26 obj=new A26();
		obj.browserLaunch();
		obj.login();
		obj.getTableData();
		
	}
	public void getTableData() {
		System.out.println(driver.findElement(By.xpath("//form[@id='form1']/div/table/tbody/tr/td")).getText());
		
	}
	public void login() {
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin");
		driver.findElement(By.name("submit")).click();
		driver.findElement(By.linkText("Registration")).click();
		
	}
	public void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.seleniumbymahesh.com/HMS");
		driver.manage().window().maximize();
	}
}