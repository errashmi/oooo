package com.rashmi.guru99;

import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;

public class DropDownHandle_10 {
	public WebDriver driver;
  @Test (priority=1)
  //select a single value from DropDown
  public void single_Select() {
	  driver.get("http://demo.guru99.com/test/newtours/register.php");
	  new Select(driver.findElement(By.name("country"))).selectByValue("ANTARCTICA");
	
  }
  @Test (priority=2)
  //Select Multiple Value from dropDown
  public void multiple_select() {
	  driver.navigate().to("http://jsbin.com/osebed/2");
	  Select fruits=new Select(driver.findElement(By.id("fruits")));
	  fruits.selectByValue("banana");
	  fruits.selectByValue("apple");
	  fruits.selectByVisibleText("Orange");
	  fruits.deselectByValue("banana");
	  fruits.deselectAll();
	  if(fruits.isMultiple()) {
		  fruits.selectByVisibleText("Orange");
		  fruits.deselectByValue("banana");
	  }
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
