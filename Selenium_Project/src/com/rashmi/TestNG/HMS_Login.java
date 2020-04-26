package com.rashmi.TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class HMS_Login {
	public WebDriver driver;
  
  
  @Test
  public void verify_login() {
	  driver.findElement(By.linkText("HMS")).click();
	  driver.findElement(By.cssSelector("input[name='username']")).sendKeys("admin");
	  driver.findElement(By.name("password")).sendKeys("admin");
	  driver.findElement(By.name("submit")).click();
  }
  @Test
  public void verify_logout() {
	  driver.findElement(By.linkText("Logout")).click();
  }
  
  //it will execute the @annotation in alphabetic order,so it will execute properly
  //but it is not possible to maintain the method name in alphabetic order in real time 
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://seleniumbymahesh.com");
	  driver.manage().window().maximize();
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
