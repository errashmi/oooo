package com.rashmi.TestNG;

import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

import org.testng.annotations.BeforeTest;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest4 {
	public WebDriver driver;
	public FileInputStream fi;
	public Workbook wb;
	public Sheet s;
	
	public FileOutputStream fo;
	public WritableWorkbook wwb;
	public WritableSheet ws;
	
	public String res;
	
  @Test
  public void verifyLoginUsingExcel() throws Exception, IOException {
	  fi=new FileInputStream("C:\\Users\\happy\\Desktop\\test\\testcase.xls");
	  wb=Workbook.getWorkbook(fi);
	  s=wb.getSheet("Sheet1");
	  
	  fo=new FileOutputStream("C:\\Users\\happy\\Desktop\\test\\testcaseresult.xls");
	  wwb=Workbook.createWorkbook(fo);
	  ws=wwb.createSheet("ResultSheet", 0);
	  
	  for(int i=1;i<s.getRows();i++) {
		  driver.findElement(By.name("username")).sendKeys(s.getCell(0, i).getContents());
		  driver.findElement(By.name("password")).sendKeys(s.getCell(1, i).getContents());
		  driver.findElement(By.name("submit")).click();
		  
		  try {
			  driver.findElement(By.linkText("Logout")).isDisplayed();
			  System.out.println("Valid Credential");
			  driver.findElement(By.linkText("Logout")).click();
			  res="PASS";
			  
		  }
		  catch(Exception e){
			  System.out.println("Invalid Credential");
			  res="FAIL";
		  }
		  Label result = new Label(2, i, res);
		  ws.addCell(result);
		  
		  for(int j=0;j<s.getColumns();j++) {
			 Label inputdata = new Label(j, i,s.getCell(j, i).getContents());
			 ws.addCell(inputdata);
		  }
		  
		  
	  }
	  Label UserId = new Label(0, 0, "UID");
	  Label Password = new Label(1, 0, "PWD");
	  Label Actualresult = new Label(2, 0, "Actual Result");
	  ws.addCell(UserId);
	  ws.addCell(Password);
	  ws.addCell(Actualresult);
	  
	  wwb.write();
	  wwb.close();
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://www.seleniumbymahesh.com/");
	  driver.findElement(By.linkText("HMS")).click();
  }

  @AfterTest
  public void afterTest() {
	  
  }

}
