//17-Write a program to select birthday in facebook “https://www.facebook.com/”
package com.rex.A;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class A17 {
	public WebDriver driver;

	public static void main(String[] args) {
		A17 obj=new A17();
		obj.browserLaunch();
		obj.seleceBirthday();

	}
	public void seleceBirthday() {
		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
		new Select(day).selectByValue("15");
		new Select(month).selectByVisibleText("Feb");
		//new Select(year).selectByValue("1992");
		new Select(year).selectByIndex(28);
		
	}
	public void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}
}
