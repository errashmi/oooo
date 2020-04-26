package com.rashmi.guru99;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class WebTable_Static_16 {
	public WebDriver driver;
  @Test 
  public void webTable_Static() throws Exception {
	  Thread.sleep(3000);
	  driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
	  String str=driver.findElement(By.id("citydropdown")).getText();
	  System.out.println(str);
  }
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://www.spicejet.com/");
	  driver.manage().window().maximize();
  }

}
