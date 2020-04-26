package com.rashmi.guru99;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class WebTable_Dynamic_17 {
	public WebDriver driver;
	@Test 
	  public void webTable_Dynamic() throws Exception {
		  
		  driver.findElement(By.name("q")).sendKeys("odisha");
		  Thread.sleep(6000);
		  String str=driver.findElement(By.xpath("//div[@class='aajZCb']")).getText();
		  System.out.println(str);
	}
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://www.google.com");
	  driver.manage().window().maximize();
  }

}
