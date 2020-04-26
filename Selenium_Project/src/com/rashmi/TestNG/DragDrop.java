package com.rashmi.TestNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.testng.annotations.BeforeTest;

public class DragDrop {
	public WebDriver driver;
  @Test
  public void dragdropTest() {
	  Actions act =new Actions(driver);
	  act.keyDown(Keys.SHIFT)
	  .keyDown(Keys.ALT)
	  .keyDown(Keys.CONTROL)
	  .build()
	  .perform();
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://www.facebook.com/");
	  driver.manage().window().maximize();
  }

}
