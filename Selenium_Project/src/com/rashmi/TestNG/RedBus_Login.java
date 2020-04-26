package com.rashmi.TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import org.testng.annotations.AfterTest;

public class RedBus_Login {
	public WebDriver driver;
	public Screen s;
  @Test
  public void verifyLogin() throws Exception {
	  //Handeling Window based pupup through sikuli
	  s=new Screen();
	  s.click("D:\\Selenium\\Sikuli.sikuli\\sikuli-8067540521696124665.png");
	  
	  driver.findElement(By.id("i-icon-profile")).click();
	  driver.findElement(By.id("signInLink")).click();
	  
	  //Handeling frames
	  //driver.switchTo().frame(0);
	  //driver.switchTo().frame("frameName")
	  driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='modalIframe']")));
	  driver.findElement(By.xpath("//button[text()='Sign in with Facebook']")).click();
	  
	  //Handeling Multiple windows
	  Set<String> wins = driver.getWindowHandles();
	  Object[] arr = wins.toArray();
	  driver.switchTo().window(arr[1].toString());
	  driver.findElement(By.id("email")).sendKeys("rsrrasmi@gmail.com");
	  Thread.sleep(3000);
	  driver.close();
	  Thread.sleep(3000);
	  //driver.switchTo().parentFrame();
	  driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='modalIframe']")));
	  
	  driver.findElement(By.id("mobileNoInp")).sendKeys("9090909");
	  driver.findElement(By.id("mobileNoInp")).clear();
	  driver.findElement(By.xpath("//i[@class='icon-close']")).click();
	
			  
  }
  @BeforeTest
  public void beforeTest() throws Exception {
	  System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://www.redbus.in/");
	  driver.manage().window().maximize();
	  Thread.sleep(10000);
  }

  @AfterTest
  public void afterTest() {
	  //driver.quit();
  }

}
