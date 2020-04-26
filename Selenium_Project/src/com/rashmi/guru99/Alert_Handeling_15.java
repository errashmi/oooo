package com.rashmi.guru99;

import org.testng.annotations.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Alert_Handeling_15 {
	public WebDriver driver;
  @Test
  public void alert() {
	  driver.findElement(By.name("submit")).click();
	  // Switching to Alert 
	  Alert alert=driver.switchTo().alert();
	  // Capturing alert message.
	  System.out.println(alert.getText());
	  // Accepting alert
	  alert.accept();
	  //driver.switchTo().alert().accept();
	  //Rejecting alert
	  //alert.dismiss();
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://demo.guru99.com/test/delete_customer.php");
  }

}
