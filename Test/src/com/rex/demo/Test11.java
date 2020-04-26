package com.rex.demo;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Test11 {
	public static void main(String[] args) {
		TextBox_and_Submit_Demo tb=new TextBox_and_Submit_Demo();
		tb.browserLaunch();
		tb.textBoxSubmit();
	}
}
class TextBox_and_Submit_Demo{
	public WebDriver driver;
	public void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/V4/");
		driver.manage().window().maximize();
	}
	public void textBoxSubmit(){
			driver.findElement(By.name("uid")).sendKeys("admin1");
			driver.findElement(By.name("uid")).clear();
			driver.findElement(By.name("uid")).sendKeys("admin");
			driver.findElement(By.name("password")).sendKeys("admin");
			driver.findElement(By.name("btnLogin")).click();
		}	
	}
