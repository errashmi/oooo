package com.rashmi.TestNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Screen;
import org.testng.annotations.BeforeTest;

public class Sikuli_demo2 {
	public WebDriver driver;
	public Screen s;
  @Test
  public void sikulidemo() throws Exception {
	  s=new Screen();
	  s.hover("D:\\Selenium\\Sikuli.sikuli\\sikuli-3705310408179951099.png");
	  driver.findElement(By.linkText("Selenium FAQ’s")).click();
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://www.seleniumbymahesh.com/");
	  driver.manage().window().maximize();
  }

}
