package com.rashmi.guru99;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class ImageClick_9 {
	WebDriver driver;
  @Test
  public void f() {
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://www.facebook.com");
	  driver.findElement(By.cssSelector("a[title='Go to Facebook home']")).click();
	  String title=driver.getTitle();
	  System.out.println(title);
	  if(title.equals("Facebook – log in or sign up"))
		  System.out.println("Image clicked successfully");
	  else
		  System.out.println("Fialure:Try once more");
	  
  }

}
