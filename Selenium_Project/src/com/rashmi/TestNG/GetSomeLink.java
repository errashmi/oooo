package com.rashmi.TestNG;

import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class GetSomeLink {
	public WebDriver driver;
  @Test
  public void getNavigationLink() {
	  WebElement navmenu = driver.findElement(By.id("sc_hdu"));
	  List<WebElement> alllinks = navmenu.findElements(By.tagName("a"));
	  for(int i=1;i<alllinks.size();i++) {
		  if(!alllinks.get(i).getText().isEmpty())
			  System.out.println(alllinks.get(i).getText());
		  		if(alllinks.get(i).getText().equalsIgnoreCase("Maps")) {
		  			System.out.println("The link is available"+alllinks.get(i).getText());
		  			alllinks.get(i).click();
		  			break;
		  		}
	  }
  }
  @BeforeTest
  
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://www.bing.com");
	  driver.manage().window().maximize();
  }

}
