package com.rashmi.TestNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class DemoGetText {
	WebDriver driver;
  @Test
  public void demoGetText() {
	  String str=driver.findElement(By.linkText("HMS")).getText();
	  System.out.println(str);
	  
	  String str1=driver.findElement(By.linkText("SeleniumByMahesh")).getAttribute("title");
	  System.out.println(str1);
	  
	  //driver.navigate().to("https://www.spicejet.com/");  //navigate  is used to navigate to particular URL and does not wait to page load. It maintains browser history or cookies to navigate back or forward.
	  driver.get("https://www.spicejet.com/");  //get is used to navigate particular URL(website) and wait till page load.
	  String str2=driver.findElement(By.xpath("//a[@class='spicejet_logo']")).getAttribute("title");
	  System.out.println(str2);
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://www.seleniumbymahesh.com/");
  }

}
