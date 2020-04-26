//17-Write a program to create log file using log4j
package com.rex.U;

import org.testng.annotations.Test;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class U8 {
	public String log4jPath="D:\\Selenium\\Selenium_WD\\Test1\\src\\com\\rex\\U\\log4j.properties";
	public static Logger log=Logger.getLogger(U8.class.getName());
	public static WebDriver driver;
  @Test
  public void VerifyLogin() {
	  log.info("***LoginPage Opened****");
	  driver.findElement(By.name("username")).sendKeys("admin");
	  driver.findElement(By.name("password")).sendKeys("admin");
	  driver.findElement(By.name("submit")).click();
	  log.info("****Login credential entered****");
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.seleniumbymahesh.com/HMS/");
		driver.manage().window().maximize();
		PropertyConfigurator.configure(log4jPath);
  }

}
