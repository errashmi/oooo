package com.rashmi.TestNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class FacebookLogin {
	public WebDriver driver;
  @Test
  public void verifyLogin() {
	  driver.findElement(By.id("email")).sendKeys("rashmi");
	  driver.findElement(By.id("pass")).sendKeys("1111");
	  driver.findElement(By.id("pass")).sendKeys(Keys.ENTER);
	  
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//DriverFiles//chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://www.facebook.com/");
  
  }

}
