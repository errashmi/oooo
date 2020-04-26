package com.rashmi.TestNG;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class UseInternalDriver {
	public WebDriver driver;
  @Test
  public void f() {
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println(System.getProperty("user.dir"));
	  System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\DriverFiles\\chromedriver.exe" );
	  driver=new ChromeDriver();
	  driver.get("http://www.google.com");
	  
  }

}
