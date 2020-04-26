//39-Write a program to show different mechanism to handle” staleElementReference” Exception
package com.rex.E;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E6 {
	public static WebDriver driver;
	public static void main(String[] args) {
		E6 obj=new E6();
		obj.browserLaunch();
		obj.hendleStaleExc();
	}
	public void hendleStaleExc() {
		WebElement txtEmail = driver.findElement(By.id("email"));
		WebElement txtPass = driver.findElement(By.id("pass"));
		txtEmail.sendKeys("rashmi");
		txtPass.sendKeys("rashmi");
		driver.navigate().to("http://www.google.com");
		driver.navigate().back();
		txtEmail = driver.findElement(By.id("email"));
		txtPass = driver.findElement(By.id("pass"));
		txtEmail.sendKeys("ranjan");
		txtPass.sendKeys("ranjan");
		driver.navigate().to("http://www.google.com");
		driver.navigate().back();
		try {
			txtEmail.sendKeys("sahoo");
			txtPass.sendKeys("sahoo");
		} catch (Exception e) {
			txtEmail = driver.findElement(By.id("email"));
			txtPass = driver.findElement(By.id("pass"));
			txtEmail.sendKeys("sahoo");
			txtPass.sendKeys("sahoo");
			e.printStackTrace();
		}
	}
	public void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}
}
