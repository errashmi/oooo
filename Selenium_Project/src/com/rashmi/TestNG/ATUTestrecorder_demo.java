package com.rashmi.TestNG;

import org.testng.annotations.Test;

import atu.testrecorder.ATUTestRecorder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class ATUTestrecorder_demo {
	public ATUTestRecorder recorder;
	public WebDriver driver;
	
	@Test(priority=1)
	  public void verify_login() {
		  driver.findElement(By.linkText("HMS")).click();
		  driver.findElement(By.cssSelector("input[name='username']")).sendKeys("admin");
		  driver.findElement(By.name("password")).sendKeys("admin");
		  driver.findElement(By.name("submit")).click();
	  }
	  @Test(priority=3)
	  public void verify_logout() throws Exception {
		  driver.findElement(By.linkText("Logout")).click();
		  driver.quit();
		  recorder.stop();
	  }
	  
	  
  @BeforeTest
  public void beforeTest() throws Exception {
	  recorder=new ATUTestRecorder("D:\\Selenium\\Recordings", "hms_login", false);
	  recorder.start();
	  System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://seleniumbymahesh.com");
	  driver.manage().window().maximize();
	  
  }

}
