package com.rashmi.TestNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;

public class Deafult_Currency {
	WebDriver driver;
  @Test
 public void checkDefaultCurrency() {
	  WebElement cur=new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"))).getFirstSelectedOption();
	  //cur.getText();
	  //System.out.println(cur.getText());
	  if(cur.getText().equalsIgnoreCase("INR")) {
		  System.out.println("Default currency is "+cur.getText());
	  }
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://www.spicejet.com/");
  }

}
