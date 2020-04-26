package com.rashmi.TestNG;

import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class DetectLinks {
	WebDriver driver;
  @Test
  public void get_All_Links() throws InterruptedException{
	  List<WebElement>links=driver.findElements(By.tagName("a"));
	  System.out.println(links.size());
	  for(int i=1;i<links.size();i++) {
		  System.out.println(links.get(i).getText());
		  Thread.sleep(1000);
	  }
  }
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://www.seleniumbymahesh.com/");
	  Thread.sleep(2000);
  }

}
