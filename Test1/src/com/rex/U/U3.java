package com.rex.U;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class U3 {
public WebDriver driver;
	@Parameters({"id","pw"})
  @Test
  public void verifyLogin(String uid,String pwd) {
	  driver.findElement(By.id("email")).sendKeys(uid);
	  driver.findElement(By.id("pass")).sendKeys(pwd);
  }
  @BeforeTest
  public void beforeTest() {
	 		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
		
  }

}
