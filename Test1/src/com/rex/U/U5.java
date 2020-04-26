//11-Write a program to login to FB by passing parameter from xml file.
package com.rex.U;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class U5 {
	public static WebDriver driver;
  @Test
  @Parameters({"uid","pwd"})
  public void verifyLogin(String userId,String Pass) {
	  driver.findElement(By.name("username")).sendKeys(userId);
	  driver.findElement(By.name("password")).sendKeys(Pass);
	  driver.findElement(By.name("submit")).click();
  }
  @BeforeTest
  public void beforeTest() {
			System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("http://www.seleniumbymahesh.com/HMS/");
			driver.manage().window().maximize();
  }

}
