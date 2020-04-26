package com.rashmi.TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Google_webTable {
	WebDriver driver;
  @Test
  public void search() throws InterruptedException {
	  driver.findElement(By.name("q")).sendKeys("selenium");
	  Thread.sleep(6000);
	  String str=driver.findElement(By.xpath("//div[@class='aajZCb']")).getText();
	  Thread.sleep(6000);
	  String[] s=str.split("\n");
	  for(int i=1;i<s.length;i++) {
		  if(s[i].equalsIgnoreCase("selenium webdriver")) {
			  driver.findElement(By.name("q")).clear();
			  driver.findElement(By.name("q")).sendKeys(s[i]);
			  driver.findElement(By.xpath("//input[@class='gNO89b']")).click();
			  System.out.println("found"+s[i]);
		  }
	  }
	  System.out.println(str);
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://www.google.com/");
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
  }

}
