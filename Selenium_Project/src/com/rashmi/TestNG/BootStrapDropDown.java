package com.rashmi.TestNG;

import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class BootStrapDropDown {
	public WebDriver driver;
  @Test
  public void f() {
	  driver.findElement(By.xpath("//li[@id='orb-nav-more']/a")).click();
	  WebElement dropdown = driver.findElement(By.xpath("//div[@class='orb-panel-content b-g-p b-r orb-nav-sec']"));
	  List<WebElement> allLinks = dropdown.findElements(By.tagName("a"));
	  for(int i=0;i<allLinks.size();i++) {
		  System.out.println(allLinks.get(i).getText());
		  if(allLinks.get(i).getText().equalsIgnoreCase("Music")) {
			  allLinks.get(i).click();
		  }
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
