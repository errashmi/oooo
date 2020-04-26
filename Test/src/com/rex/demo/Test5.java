package com.rex.demo;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Test5 {
	public static void main(String[] args) {
		locatorDemo ld=new locatorDemo();
		ld.browserLaunch();
		ld.IdLocatorDemo();
	}
}
class locatorDemo{
	public WebDriver driver;
	public void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}
	public void IdLocatorDemo() {
		driver.findElement(By.id("email")).sendKeys("rashmi");
		driver.findElement(By.id("pass")).sendKeys("admin");
		//driver.findElement(By.id("u_0_4")).click();   //NoSuchElementException
		driver.findElement(By.id("pass")).sendKeys(Keys.ENTER);
	}
}
