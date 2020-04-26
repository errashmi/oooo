package com.rashmi.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class gmail{
	public static WebDriver driver;
	static void open_chrome() {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.gmail.com");
		driver.findElement(By.id("identifierId")).sendKeys("rsrrasmi@gmail.com");
		driver.findElement(By.cssSelector("span.RveJvd.snByac")).click();
		
		//driver.close();
	}
	static void login() {}
}
public class Gmail_Login {

	public static void main(String[] args) {
		gmail.open_chrome();

	}

}
