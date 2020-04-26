package com.rashmi.TestNG;

import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;

import java.io.FileInputStream;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class HMS_Login_Retesting {
	public WebDriver driver;
	public FileInputStream fi;
	public Workbook w;
	public Sheet s;
  @Test
 public void multipleTestDataFromExcel() throws Exception {
	  fi=new FileInputStream("D:\\Selenium\\ExcelFiles\\test4.xls");
	  w=Workbook.getWorkbook(fi);
	  s=w.getSheet("Sheet1");
	  for(int i=1;i<s.getRows();i++) {
		  driver.findElement(By.name("username")).sendKeys(s.getCell(0, i).getContents());
		  driver.findElement(By.name("password")).sendKeys(s.getCell(1, i).getContents());
		  driver.findElement(By.name("submit")).click();
		  Thread.sleep(3000);
		  
		  try {
			  driver.findElement(By.linkText("Logout")).isDisplayed();
			  driver.findElement(By.linkText("Logout")).click();
			  System.out.println("Valid credential");
			 }
		  catch (Exception e) {
			  System.out.println("invalid credentials");
		  }
		  
	  }
	  
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
