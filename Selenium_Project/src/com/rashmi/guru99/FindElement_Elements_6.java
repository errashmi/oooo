package com.rashmi.guru99;

import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class FindElement_Elements_6 {
	public WebDriver driver;
  @Test
  public void findWebElementDEMO() {
	  driver.get("http://demo.icthealth.com/brltest/login.html");
	  driver.findElement(By.id("login-username")).sendKeys("khl2529");
	  driver.findElement(By.id("login-password")).sendKeys("1234");
	  WebElement btn=driver.findElement(By.xpath("//button[@class ='base-button']")); //Its RETURN TYPE IS WEBELEMENT
	  btn.click();
	  
	  List<WebElement>all_links=driver.findElements(By.tagName("a")); //ITS RETURN TYPE IS List<WebElement>
	  //System.out.println(all_links);
	  for(int i=1;i<all_links.size();i++) {
		  System.out.println(all_links.get(i).getText());
	  }
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
