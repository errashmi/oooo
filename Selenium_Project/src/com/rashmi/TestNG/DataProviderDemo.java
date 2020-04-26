package com.rashmi.TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class DataProviderDemo {
	public WebDriver driver;
  @Test(dataProvider = "Authentication")
  public void login(String uname, String pwd) {
	  //driver.findElement(By.linkText("HMS")).click();
	  driver.navigate().to("http://www.seleniumbymahesh.com/HMS/");
	  driver.findElement(By.cssSelector("input[name='username']")).sendKeys(uname);
	  driver.findElement(By.name("password")).sendKeys(pwd);
	  driver.findElement(By.name("submit")).click();
	  driver.findElement(By.linkText("Logout")).click();
  }
  
  @DataProvider (name="Authentication")
  public Object[][] credentials() {
    return new Object[][] {
    	{"admin","admin"},{"sunny","sunny"},{"mahesh","mahesh"},{"bunny","bunny"}
    };
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://seleniumbymahesh.com");
	  driver.manage().window().maximize();
  }
  
}
