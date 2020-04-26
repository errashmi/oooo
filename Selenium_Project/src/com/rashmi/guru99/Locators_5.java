package com.rashmi.guru99;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Locators_5 {
	public WebDriver driver;
  @Test
  public void Element_Locators_demo() {
	  //Locating by ID
	  driver.findElement(By.id("login-username")).sendKeys("khl2529");
	  //Locating by Name
	  driver.findElement(By.name("j_password")).sendKeys("1234");
	  //Locating by Name using Filters
	  
	  
	  driver.findElement(By.className("base-button")).click();
	  //Locating by Link Text
	  driver.findElement(By.linkText("Logout")).click();
	  //Locating by CSS Selector
	  driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("admin");
	  driver.findElement(By.cssSelector("input[type='password']")).sendKeys("123");
	  driver.findElement(By.cssSelector("button[class='base-button']")).click();
	  driver.findElement(By.linkText("Logout")).click();
	  //Locating By XPATH
	  driver.findElement(By.xpath("//input[@name='j_username']")).sendKeys("admin");
	  driver.findElement(By.xpath("//input[@name='j_password']")).sendKeys("123");
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
	  
	
	  
	  
	 
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://demo.icthealth.com/brltest/login.html");
  }

}
