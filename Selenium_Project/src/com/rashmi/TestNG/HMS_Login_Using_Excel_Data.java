package com.rashmi.TestNG;

import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;

import java.io.FileInputStream;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class HMS_Login_Using_Excel_Data {
	public WebDriver driver;
  @Test
  public void login() throws Exception {
	  FileInputStream fi=new FileInputStream("D:\\Selenium\\ExcelFiles\\test1.xls");
	  Workbook w=Workbook.getWorkbook(fi);
	  Sheet s=w.getSheet("Sheet1");
	  driver.findElement(By.linkText("HMS")).click();
	  driver.findElement(By.cssSelector("input[name='username']")).sendKeys(s.getCell(0, 1).getContents());
	  driver.findElement(By.name("password")).sendKeys(s.getCell(1, 1).getContents());
	  driver.findElement(By.name("submit")).click();
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://seleniumbymahesh.com");
	  driver.manage().window().maximize();
  }

}
