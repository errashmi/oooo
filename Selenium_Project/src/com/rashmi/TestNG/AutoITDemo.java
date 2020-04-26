package com.rashmi.TestNG;

import org.testng.annotations.Test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class AutoITDemo {
	public WebDriver driver;
  @Test
  public void HMSRegd() throws Exception {
	  driver.findElement(By.name("username")).sendKeys("admin");
	  driver.findElement(By.name("password")).sendKeys("admin");
	  driver.findElement(By.name("submit")).click();
	  driver.findElement(By.linkText("Registration")).click();
	  driver.findElement(By.name("image")).click();
	  Thread.sleep(3000);
	  Runtime.getRuntime().exec("D:\\Selenium\\AutoIT\\AutoIt1.exe");
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://www.seleniumbymahesh.com/");
	  driver.manage().window().maximize();
	  driver.findElement(By.linkText("HMS")).click();

	  
  }

}
