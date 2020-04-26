package com.rashmi.TestNG;

import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class GetAllRButton {
	WebDriver driver;
  @Test
  public void getRadButton() {
	  List<WebElement>rbtn=driver.findElements(By.tagName("input"));
	  int count=0;
	  for(int i=1;i<rbtn.size();i++) {
		  if(rbtn.get(i).getAttribute("type").equalsIgnoreCase("radio")){
			  
			  System.out.println(rbtn.get(i).getAttribute("value"));
			  count+=1;
		  }
	  }
	  System.out.println(count);
  }
  @Test
  public void getCheckBox() {
	  List<WebElement>rbtn=driver.findElements(By.tagName("input"));
	  int count=0;
	  for(int i=1;i<rbtn.size();i++) {
		  if(rbtn.get(i).getAttribute("type").equalsIgnoreCase("checkbox")){
			  
			  System.out.println(rbtn.get(i).getAttribute("name"));
			  count+=1;
		  }
	  }
	  System.out.println(count);
  }
  @BeforeTest
  public void beforeTest() throws Exception {
	  System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://www.spicejet.com");
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
  }

}
