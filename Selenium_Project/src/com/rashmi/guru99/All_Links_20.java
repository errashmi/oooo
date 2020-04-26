package com.rashmi.guru99;

import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class All_Links_20 {
	public WebDriver driver;
  @Test
  public void getAllLinks() {
	  List<WebElement> wl = driver.findElements(By.tagName("a"));
	  int l=wl.size();
	  for(int i=1;i<=l;i++) {
		  System.out.println(wl.get(i).getText());
	  }
	  
	  System.out.println(wl);
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.seleniumbymahesh.com/");
		driver.manage().window().maximize();
		
  }

}
