//14-Write a program to login into HMS by taking data from excel file (.xls)
package com.rex.T;

import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class T14 {
	public  WebDriver driver;
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
	  driver.findElement(By.name("username")).sendKeys(s.getCell(0, 1).getContents());
	  driver.findElement(By.name("password")).sendKeys(s.getCell(1, 1).getContents());
	  driver.findElement(By.name("submit")).click();
  }
  @BeforeTest
  public void beforeTest() { 
		  System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("http://www.seleniumbymahesh.com/HMS/");
  }

}
