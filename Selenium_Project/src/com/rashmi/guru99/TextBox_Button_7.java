package com.rashmi.guru99;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class TextBox_Button_7 {
	public WebDriver driver;
  @Test
  public void textBox_Demo() {
	  driver.get("http://demo.icthealth.com/brltest/login.html");
	  WebElement uname=driver.findElement(By.id("login-username"));
	  uname.clear(); //The clear() method is used to delete the text in an input box
	  uname.sendKeys("khl2529");
	  driver.findElement(By.id("login-password")).sendKeys("1234");
	  //driver.findElement(By.className("base-button")).click();  //We can use the click () method on the web element like a normal button
	  driver.findElement(By.className("base-button")).submit();  //When submit() is used, WebDriver will look up the DOM to know which form the element belongs to, and then trigger its submit function.
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
