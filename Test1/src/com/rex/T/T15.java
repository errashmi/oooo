package com.rex.T;

import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;

import java.io.FileInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class T15 {
	public WebDriver driver;
	String path="D:\\Selenium\\ExcelFiles\\testdata.xls";
	FileInputStream fi;
	Workbook w;
	Sheet s;
  @Test
  public void HmsLogin() throws Exception {
	  fi=new FileInputStream(path);
	  w=Workbook.getWorkbook(fi);
	  s=w.getSheet("Sheet1");
	  System.out.println(s.getCell(0, 1).getContents());
	  System.out.println(s.getCell(1, 1).getContents());
	  for(int i=0;i<s.getRows();i++) {
		  driver.findElement(By.name("username")).sendKeys(s.getCell(0, i).getContents());
		  driver.findElement(By.name("password")).sendKeys(s.getCell(1, 1).getContents());
		  Thread.sleep(3000);
		  driver.findElement(By.name("username")).clear();
		  driver.findElement(By.name("password")).clear();
	  }
	  
	  
  }
  @BeforeTest
  public void beforeTest() { 
	  System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.seleniumbymahesh.com/HMS/");
}
}
