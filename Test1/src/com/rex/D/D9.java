//19-Write a program to mouse hover on facebook logo and write your name on userID text box in capital letter by using keyboard and Mouse Event.

package com.rex.D;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class D9 {
	public static WebDriver driver;
	public static void main(String[] args) {
		browserLaunch();
		actionClassDemo();
	}
	public static void actionClassDemo() {
		WebElement logo = driver.findElement(By.xpath("//i[@class='fb_logo img sp_ji5zj_uMwB- sx_bc4a1c']"));
		Actions act=new Actions(driver);
		act.moveToElement(logo).perform();
		WebElement tbEmail = driver.findElement(By.id("email"));
		act.keyDown(tbEmail, Keys.SHIFT).sendKeys("rashmi").build().perform();
	}
	public static void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}
}
