package com.rashmi.guru99;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;

public class MouseKeyboard_Events_12 {
	public WebDriver driver;
	Actions act;
  @Test
  public void actionClassDemo() {
	  act=new Actions(driver);
	  act.moveToElement(driver.findElement(By.xpath("//a[@id='highlight-addons']"))).build().perform();
	  //driver.findElement(By.xpath("//a[@id='highlight-addons']")).click();
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://www.spicejet.com");
	  driver.manage().window().maximize();
	  
  }

}
