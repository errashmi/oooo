package com.rex.demo;

import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Test34 {
	public WebDriver driver;
	public static void main(String[] args) throws Exception {
		Test34 obj=new Test34();
		obj.browserLaunch();
		obj.screenshotDemo();
	}
	public void screenshotDemo() throws Exception {
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin");
		driver.findElement(By.name("submit")).click();
		TakesScreenshot tss = (TakesScreenshot)driver;
		File src = tss.getScreenshotAs(OutputType.FILE);
		File dsc=new File("./Screenshot/test.png");
		FileHandler.copy(src, dsc);	
	}
	public void browserLaunch() {
		  System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get("http://www.seleniumbymahesh.com/HMS/");
		  driver.manage().window().maximize();  
	  }
}
