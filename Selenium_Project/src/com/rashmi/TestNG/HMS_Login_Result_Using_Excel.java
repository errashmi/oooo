package com.rashmi.TestNG;

import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class HMS_Login_Result_Using_Excel {
	public WebDriver driver;
	public FileInputStream fi;
	public Workbook w;
	public Sheet s;
	public FileOutputStream fo;
	public WritableWorkbook wb;
	public WritableSheet ws;
	public String str;
	
	
  @Test
  public void loginLogot() throws Exception {
	  fi=new FileInputStream("D:\\Selenium\\ExcelFiles\\login.xls");
	  w=Workbook.getWorkbook(fi);
	  s=w.getSheet("Sheet1");
	  
	  fo=new FileOutputStream("D:\\Selenium\\ExcelFiles\\Results.xls");
	  wb=Workbook.createWorkbook(fo);
	  ws=wb.createSheet("Results", 0);
	  
	  for(int i=1;i<s.getRows();i++) {
		  driver.findElement(By.name("username")).sendKeys(s.getCell(0, i).getContents());
		  driver.findElement(By.name("password")).sendKeys(s.getCell(1, i).getContents());
		  driver.findElement(By.name("submit")).click();
		  Thread.sleep(3000);
		  
		  try {
			  driver.findElement(By.linkText("Logout")).isDisplayed();
			  System.out.println("Valid Credential");
			  driver.findElement(By.linkText("Logout")).click();
			  str="PASS";
		  }
		  catch(Exception e){
			  System.out.println("Invalid Credential");
			  str="FAIL";
			  
		  }
		  jxl.write.Label results=new jxl.write.Label(2, i, str);
		  ws.addCell(results);
		  for(int j=0;j<s.getColumns();j++) {
			  System.out.println(s.getCell(j, i).getContents());
			  jxl.write.Label a=new jxl.write.Label(j, i, s.getCell(j, i).getContents());
			  ws.addCell(a);
		  }
		  
	  }
  jxl.write.Label un=new jxl.write.Label(0, 0, "UserName");
  jxl.write.Label pw=new jxl.write.Label(1, 0, "Password");
  jxl.write.Label rs=new jxl.write.Label(2, 0, "Results");
  ws.addCell(un);
  ws.addCell(pw);
  ws.addCell(rs);
  
  wb.write();
  wb.close();
  
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
