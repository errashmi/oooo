package com.rashmi.TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
//main method is not available so how to pass parameter
public class google_lang_select {   //this method will be executed only when it is being called
	WebDriver driver;
	public void select_lang(String str) {
		driver.findElement(By.xpath(str)).click();
	}
  @Test
  public void change_lang() {
	  //driver.findElement(By.xpath("//*[@id='SIvCob']/a[1]")).click();
	  //driver.findElement(By.xpath("//*[@id='SIvCob']/a[2]")).click();
	  //driver.findElement(By.xpath("//*[@id='SIvCob']/a[3]")).click();
	  select_lang("//*[@id='SIvCob']/a[1]");
	  select_lang("//*[@id='SIvCob']/a[2]");
	  select_lang("//*[@id='SIvCob']/a[3]");
	  select_lang("//*[@id='SIvCob']/a[1]");
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://google.com");
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
