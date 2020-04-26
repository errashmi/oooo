package com.rashmi.TestNG;

import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;

import java.io.FileInputStream;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class HMS_Login_Using_OR {
	public WebDriver driver;
	public FileInputStream fi;
	public Workbook w;
	public Sheet s,s1;
	
  @Test
  public void objectRepositoryDemo() throws Exception {
	  fi=new FileInputStream("D:\\Selenium\\ExcelFiles\\test2.xls");
	  w=Workbook.getWorkbook(fi);
	  s=w.getSheet("Sheet1");
	  driver.findElement(By.name(s.getCell(0, 1).getContents())).sendKeys("admin");
	  driver.findElement(By.name(s.getCell(1, 1).getContents())).sendKeys("admin");
	  driver.findElement(By.name(s.getCell(2, 1).getContents())).click();
	  Thread.sleep(5000);
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://seleniumbymahesh.com");
	  driver.manage().window().maximize();
	  driver.findElement(By.linkText("HMS")).click();
  }

}
