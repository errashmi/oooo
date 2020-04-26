package com.rashmi.TestNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;

public class Actions_Drag_Drop {
	public WebDriver driver;
  @Test
  public void dragDrop() throws Exception {
	  Actions a=new Actions(driver);
	  driver.switchTo().frame(0);
	  Thread.sleep(3000);
	  WebElement src = driver.findElement(By.id("draggable"));
	  WebElement dsc = driver.findElement(By.id("droppable"));
	  Thread.sleep(3000);
	  a.dragAndDrop(src, dsc).build().perform();
	  Thread.sleep(3000);
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
  }

}
