package com.rashmi.TestNG;

import org.testng.annotations.Test;

import jxl.write.DateTime;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeClass;

public class Sshot {
	public WebDriver driver;
	  @Test
  public void Screenshotdemo() throws Exception {
		  Date dt=new Date();
		  SimpleDateFormat sdf=new SimpleDateFormat("dd_MM_yy_hh_mm_ss");
		  //System.out.println(sdf.format(dt));
		  
		  TakesScreenshot tss = (TakesScreenshot)driver;
		  File src = tss.getScreenshotAs(OutputType.FILE);
		  File Dsc=new File(System.getProperty("user.dir")+"\\Screenshots\\"+sdf.format(dt)+"test3.png");
		  FileHandler.copy(src, Dsc);
  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\DriverFiles\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://www.seleniumbymahesh.com/");
	  driver.manage().window().maximize();
  }

}
