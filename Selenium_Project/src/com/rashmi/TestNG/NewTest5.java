package com.rashmi.TestNG;

import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

import org.testng.annotations.BeforeTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest5 {
	public WebDriver driver;
	public FileInputStream fi;
	public Workbook wb;
	public Sheet s;
	
	public FileOutputStream fo;
	public WritableWorkbook wwb;
	public WritableSheet ws;
	
	public String res;
	
  @Test
  public void Verifylogin() throws Exception {
	  fi=new FileInputStream("C:\\Users\\happy\\Desktop\\test\\testcase.xls");
	  wb=Workbook.getWorkbook(fi);
	  s=wb.getSheet("Sheet1");
	  
	  fo=new FileOutputStream("C:\\Users\\happy\\Desktop\\test\\testresult.xls");
	  wwb=Workbook.createWorkbook(fo);
	  ws=wwb.createSheet("TestResult", 0);
	  
	  for(int i=1;i<s.getRows();i++) {
		  driver.findElement(By.name("username")).sendKeys(s.getCell(0, i).getContents());
		  driver.findElement(By.name("password")).sendKeys(s.getCell(1, i).getContents());
		  driver.findElement(By.name("submit")).click();
		  Thread.sleep(3000);
		  
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
		  //result print
		  Label result = new Label(2,i, res);
		  ws.addCell(result);
		  //Test Data Print
		  for(int j=0;j<s.getColumns();j++) {
			  //Label data = new Label(j, i, s.getCell(j,i).getContents());
			  //ws.addCell(data);
			  
			  System.out.println(s.getCell(j, i).getContents());
			  jxl.write.Label a=new jxl.write.Label(j, i, s.getCell(j, i).getContents());
			  ws.addCell(a);
		  }
		  
		  Label uname = new Label(0, 0, "UNAME");
		  Label pwd = new Label(1, 0, "PASSWORD");
		  Label exp_res = new Label(2, 0, "RESULT");
		  ws.addCell(uname);
		  ws.addCell(pwd);
		  ws.addCell(exp_res);
		  wwb.write();
		  wwb.close();
	  }
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
	  //driver.quit();
	    }

}
