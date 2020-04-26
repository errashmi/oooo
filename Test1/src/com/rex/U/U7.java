//16-Write a program to login into FB and perform cross browser testing parallel.
package com.rex.U;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class U7 {
	public static WebDriver driver;
  @Test
  public void verifyLogin() {
	  driver.findElement(By.name("username")).sendKeys("admin");
	  driver.findElement(By.name("password")).sendKeys("admin");
	  driver.findElement(By.name("submit")).click();
  }
  @BeforeTest
  @Parameters({"bwsr"})
  public void beforeTest(String browser) {
	  if(browser.equalsIgnoreCase("chrome")) {
		  System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
			driver=new ChromeDriver();
	  }
	  else if(browser.equalsIgnoreCase("firefox")) {
		  System.setProperty("webdriver.gecko.driver", "./DriverFiles/geckodriver.exe");
			driver=new FirefoxDriver();
	  }
	  
		driver.get("http://www.seleniumbymahesh.com/HMS/");
		driver.manage().window().maximize();
  }

}
