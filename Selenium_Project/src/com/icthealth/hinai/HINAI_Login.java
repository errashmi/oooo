package com.icthealth.hinai;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HINAI_Login {
	public WebDriver driver;
  @Test(priority=2)
  public void login() {
	  driver.findElement(By.id("login-username")).sendKeys("khl2529");
	  driver.findElement(By.id("login-password")).sendKeys("1234");
	  driver.findElement(By.cssSelector("button[class='base-button']")).click();
  }
	@Test(priority=1)
  public void openURL() {
	  driver.get("http://demo.icthealth.com/brltest");
	  driver.manage().window().maximize();
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
  }

  @AfterTest
  public void afterTest() {
  }

}
