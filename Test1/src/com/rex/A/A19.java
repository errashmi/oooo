//19-Write a program to mouse hover on facebook logo and write your name on userID text box in capital letter by using keyBoard and MouseEvent.

package com.rex.A;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A19 {
	public WebDriver driver;
	public static void main(String[] args) {
		A19 obj=new A19();
		obj.browserLaunch();
		obj.actionsDemo();
	}
	public void actionsDemo() {
		WebElement logoImg = driver.findElement(By.xpath("//i[@class='fb_logo img sp_QPh7VHZc0Ga sx_dad6ce']"));
		Actions act=new Actions(driver);
		act.moveToElement(logoImg).build().perform();
		WebElement id = driver.findElement(By.id("email"));
		act.keyDown(id, Keys.SHIFT).sendKeys(id, "RASHMI").perform();
	}
	public void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}
}
