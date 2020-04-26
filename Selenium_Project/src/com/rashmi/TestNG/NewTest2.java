package com.rashmi.TestNG;

import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;

import java.io.FileInputStream;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class NewTest2 {
	public WebDriver driver;
	public FileInputStream fi;
	public Workbook wb;
	public Sheet s;
  @Test
  public void verifylogin() throws Exception {
	  fi=new FileInputStream("C:\\Users\\happy\\Desktop\\test\\testcase.xls");
	  wb=Workbook.getWorkbook(fi);
	  s=wb.getSheet("Sheet1");
	  for(int i=1;i<s.getRows();i++) {
	  driver.findElement(By.name("username")).sendKeys(s.getCell(0, i).getContents());
	  driver.findElement(By.name("password")).sendKeys(s.getCell(1, i).getContents());
	  driver.findElement(By.name("submit")).click();
	  
	  try {
		  driver.findElement(By.linkText("Logout")).isDisplayed();
		  System.out.println("Valid credential");
		  driver.findElement(By.linkText("Logout")).click();
	  }
	  catch(Exception e){
		  System.out.println("Invalid Creadential");
	  }
	  }
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://www.seleniumbymahesh.com/");
	  driver.findElement(By.linkText("HMS")).click();
  }

}
