//39-Write a program to show different mechanism to handle ”staleElementReferenceException".
package com.rex.A;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A39 {
	public WebDriver driver;
	public static void main(String[] args) throws Exception {
		A39 obj=new A39();
		obj.browserLaunch();
		obj.handleExc();
	}
	public void handleExc() {
		WebElement txtEmail = driver.findElement(By.id("email"));
		WebElement txtPass = driver.findElement(By.id("pass"));
		txtEmail.sendKeys("rashmi");
		txtPass.sendKeys("rashmi");
		driver.navigate().refresh();
		//txtEmail.sendKeys("rashmi"); //StaleElementReferenceException
		//txtPass.sendKeys("rashmi");  //StaleElementReferenceException
		//Handeling exception by identifying element once more
		txtEmail = driver.findElement(By.id("email"));
		txtPass = driver.findElement(By.id("pass"));
		txtEmail.sendKeys("ranjan");
		txtPass.sendKeys("ranjan");	
		driver.navigate().refresh();
		//txtEmail.sendKeys("sahoo");
		//txtPass.sendKeys("sahoo");
		//Handeling exception by using try catch block
		try {
			txtEmail.sendKeys("sahoo");
			txtPass.sendKeys("sahoo");
		} catch (StaleElementReferenceException e) {
			txtEmail = driver.findElement(By.id("email"));
			txtPass = driver.findElement(By.id("pass"));
			txtEmail.sendKeys("sahoo");
			txtPass.sendKeys("sahoo");
		}
		
	}
	public void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}
}
