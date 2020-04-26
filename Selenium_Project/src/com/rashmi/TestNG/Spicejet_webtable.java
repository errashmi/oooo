package com.rashmi.TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Spicejet_webtable {
	WebDriver driver;
  @Test
  public void webtable_handle() {
	  driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
	  String str=driver.findElement(By.id("glsctl00_mainContent_ddl_originStation1_CTNR")).getText();
	  String[] s=str.split("\n"); //converting string to string array by using newline separator
	  System.out.println(str);
	  	for(int i=0;i<=s.length;i++)
		  if(s[i].equalsIgnoreCase("Amritsar (ATQ)"))
		  {
			  	System.out.println("Amritsar found");
			  	driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).clear();
			  	driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).sendKeys(s[i]);
			  	driver.findElement(By.name("ctl00$mainContent$btn_FindFlights")).click();
		  }
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://www.spicejet.com/");
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
  }

}
