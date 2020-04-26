package com.rashmi.TestNG;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.sikuli.script.Screen;
import org.testng.annotations.BeforeTest;

public class Sikuli_Demo_1 {
public Screen s;
public WebDriver driver;
@Test
public void demo_1() throws Exception {
	 Screen scr = new Screen(); 
	 scr.click("D:\\Selenium\\Sikuli.sikuli\\sikuli-289355825499824419.png");
	  }
  @BeforeTest
  public void beforeTest() throws Exception {
	  System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");  
  }

}
