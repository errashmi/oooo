package com.rex.U;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class U4 {
	public WebDriver driver;
	@DataProvider(name="LoginCred")
	public Object[][] testData() {
		return new Object[][] {{"admin","admin"}};
		
	}
  @Test(dataProvider="LoginCred")
  public void FBLogin(String uid,String pwd) {
	  driver.findElement(By.name("email")).sendKeys(uid);
	  driver.findElement(By.name("pass")).sendKeys(pwd);
	  driver.findElement(By.id("u_0_4")).click();
  }
  
  @Parameters({"browser"})
  @BeforeTest
  
  public void beforeTest(String browser) {
	  if(browser.equalsIgnoreCase("chrome")) {
		  System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
			driver=new ChromeDriver();
	  }
	  else if(browser.equalsIgnoreCase("firefox")) {
		  System.setProperty("webdriver.gecko.driver", "./DriverFiles/geckodriver.exe");
			driver=new FirefoxDriver();
	 }
	 driver.get("https://www.facebook.com/");
}
}