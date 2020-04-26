package com.rashmi.guru99;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class CheckBox_RadioButton_Handle_8 {
	public WebDriver driver;
  @Test
  public void demoRadioButton() {
	  driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
	  driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_2")).click();
	  WebElement oneway=driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0"));
	  if(oneway.isSelected());
	  System.out.println("Oneway is Auto selected");
  }
  @Test
  public void demoCheckBox() {
	  driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
	  driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).click();
	  driver.findElement(By.id("ctl00_mainContent_chk_IndArm")).click();
	  driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).click();
	  driver.findElement(By.id("ctl00_mainContent_chk_Unmr")).click();
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.spicejet.com");
  }

}
