package com.rashmi.TestNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;

public class Actions_Demo_1 {
	public WebDriver driver;
	
  @Test
  public void mouse_Event() throws Exception {
	  Actions a=new Actions(driver);
	  WebElement ls = driver.findElement(By.id("ctl00_HyperLinkLogin"));
	  a.moveToElement(ls).build().perform();
	  Thread.sleep(3000);
	  driver.findElement(By.linkText("Travel Agent Login")).click();
	  Thread.sleep(3000);
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
  }

}
