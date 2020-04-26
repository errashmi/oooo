//12-Write a program to login to FB using DataProvider
package com.rex.U;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

public class U6 {
	public static WebDriver driver;
	@DataProvider(name="Auth")
	public Object[][]userAuth() {
		return new Object[][] {{"admin","admin"}};
		
	}
  @Test(dataProvider="Auth")
  public void VerifyLoginUsingDataProvider(String uid,String pwd) {
	  driver.findElement(By.name("username")).sendKeys(uid);
	  driver.findElement(By.name("password")).sendKeys(pwd);
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
