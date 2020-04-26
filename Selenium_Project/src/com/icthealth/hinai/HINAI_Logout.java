package com.icthealth.hinai;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class HINAI_Logout {
	WebDriver driver;
  @Test
  public void logout() {
	  driver.findElement(By.linkText("Logout")).click();
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new ChromeDriver();
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
