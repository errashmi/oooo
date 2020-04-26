package com.rashmi.guru99;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Priority_25 {
	public WebDriver driver;
  @Test(priority=0)
  public void openURL() {
	  driver.get("http://www.seleniumbymahesh.com/");
		driver.manage().window().maximize();
		
  }
  @Test(priority=1)
  public void Login() {
		driver.findElement(By.linkText("HMS")).click();
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin");
		driver.findElement(By.name("submit")).click();
  }
  @Test(priority=2)
  public void logout() {
	  driver.findElement(By.linkText("Logout")).click();
	  driver.close();
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
	  
  }

}
