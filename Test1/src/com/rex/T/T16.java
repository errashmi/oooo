//16-Write a program to login into HMS and perform cross browser testing parallel.
package com.rex.T;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class T16 {
	public WebDriver driver;
  @Test
  public void VerifyLogin() {
	  driver.findElement(By.name("username")).sendKeys("admin");
	  driver.findElement(By.name("password")).sendKeys("admin");
	  driver.findElement(By.name("submit")).click();
  }
  @BeforeTest
  @Parameters({"browser"})
  public void beforeTest(String browser){
	  if(browser.equalsIgnoreCase("chrome")) {
		  System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		  driver=new ChromeDriver();
	  }
	  else if(browser.equalsIgnoreCase("ie")) {
		  	System.setProperty("webdriver.ie.driver", "");
			driver=new InternetExplorerDriver();
	  }
	  else if(browser.equalsIgnoreCase("firefox")) {
		  System.setProperty("webdriver.gecko.driver", "./DriverFiles/geckodriver.exe");
			driver=new FirefoxDriver();
	  }
	  driver.get("http://www.seleniumbymahesh.com/HMS/");
}

}
