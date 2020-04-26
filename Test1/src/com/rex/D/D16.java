//26-Write a program to get text from static webTable  http://www.seleniumbymahesh.com/HMS/
package com.rex.D;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D16 {
	public static WebDriver driver;
	public static void main(String[] args) {
		browserLaunch();
		staticWebtableDemo();

	}
	public static void staticWebtableDemo() {
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin");
		driver.findElement(By.name("submit")).click();
		driver.findElement(By.linkText("Registration")).click();
		List<WebElement> tblText = driver.findElements(By.xpath("//form[@id='form1']/div/table/tbody/tr"));
		for(int i=0;i<tblText.size();i++) {
			System.out.println(tblText.get(i).getText());
		}
	}
	public static void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.seleniumbymahesh.com/HMS/");
		driver.manage().window().maximize();
	}
}
