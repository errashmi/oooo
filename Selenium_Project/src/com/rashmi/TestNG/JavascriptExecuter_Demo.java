package com.rashmi.TestNG;

import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class JavascriptExecuter_Demo {
	public WebDriver driver;
  @Test
  public void JSE_Demo() {
	  JavascriptExecutor jse = (JavascriptExecutor)driver;
	  jse.executeScript("document.getElementById('email').value=('rashmi')");
	  jse.executeScript("document.getElementById('pass').value=('123')");
	  jse.executeScript("document.getElementById('u_0_a').click()");
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://www.facebook.com/");
	  driver.manage().window().maximize();
  }

}
