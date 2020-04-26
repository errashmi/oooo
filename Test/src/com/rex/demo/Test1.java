package com.rex.demo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Test1 {
	public static void main(String[]args) {
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://seleniumbymahesh.com/");
	driver.manage().window().maximize();
	}
}
