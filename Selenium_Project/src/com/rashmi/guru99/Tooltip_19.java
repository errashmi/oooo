package com.rashmi.guru99;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Tooltip_19 {
	public WebDriver driver;
  @Test
  public void getTooltip() {
	  String tooltip=driver.findElement(By.xpath("//a[@class='spicejet_logo']")).getAttribute("title");
	  System.out.println(tooltip);
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://www.spicejet.com/");
	  driver.manage().window().maximize();
  }

}
