package com.rashmi.TestNG;

import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;

public class DemoGetOption {
	WebDriver driver;
  @Test
  public void option() {
	  driver.findElement(By.linkText("HMS")).click();
	  driver.findElement(By.name("username")).sendKeys("admin");
	  driver.findElement(By.name("password")).sendKeys("admin");
	  driver.findElement(By.className("log")).click();
	  driver.findElement(By.linkText("Registration")).click();
	  java.util.List<WebElement> patcat=new Select(driver.findElement(By.name("PATIENT_CAT"))).getOptions();
	  for(int i=0;i<patcat.size();i++) {  //it will print all the option in the select option
		  System.out.println(patcat.get(i).getText());
	  }
	  for(int i=0;i<patcat.size();i++) {  
		  if(patcat.get(i).getText().equalsIgnoreCase("Staff"))//it will print only one option "staff"
			  System.out.println(patcat.get(i).getText());
	  }
	  for(int i=0;i<patcat.size();i++) {
		  if(!patcat.get(i).getText().equalsIgnoreCase("Staff"))//it will print all option except "staff"
			  System.out.println(patcat.get(i).getText());
	  }
	  
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://www.seleniumbymahesh.com/");
  
  }

}
