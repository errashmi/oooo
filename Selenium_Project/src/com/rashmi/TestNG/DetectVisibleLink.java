package com.rashmi.TestNG;

import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class DetectVisibleLink {
	WebDriver driver;
  @Test
  public void visible_link() {
	  List<WebElement>vlinks=driver.findElements(By.tagName("a"));
	  System.out.println("Total No of links in the page"+vlinks.size());
	  int count=0;
	  for(int i=1;i<vlinks.size();i++) {
		  if(!vlinks.get(i).getText().isEmpty()) {
			  System.out.println(vlinks.get(i).getText());
			  count+=1;
		  }
			  
	  }
	  System.out.println("Total visible link in the page is"+count);
  }
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://www.seleniumbymahesh.com/");
	  Thread.sleep(2000);
  }

}
