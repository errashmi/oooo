package com.rashmi.TestNG;

import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class GetLinksfrombbc {
	public WebDriver driver;
  @Test
  public void getBBCDynamiclink() throws Exception {
	  WebElement toplist = driver.findElement(By.xpath("//div[@class='top-list']"));
	  List<WebElement> alllink = toplist.findElements(By.tagName("a"));
	  for(int i=1;i<alllink.size();i++) {
		  System.out.println(alllink.get(i).getText());
		  alllink.get(i).click();
		  Thread.sleep(5000);
		  System.out.println(driver.getCurrentUrl());
		  driver.navigate().back();
		  Thread.sleep(3000);
		  //To avoid StaleElementReferenceException
		  toplist = driver.findElement(By.xpath("//div[@class='top-list']"));
		  alllink = toplist.findElements(By.tagName("a"));
		  
		  
	  }
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://www.bbc.com");
	  driver.manage().window().maximize();
  }

}
