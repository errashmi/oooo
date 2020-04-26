package com.rashmi.TestNG;

import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.demo.Write;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class NewTest1 {
	public WebDriver driver;
	public FileInputStream fi;
	public Workbook wb;
	public Sheet s;
	
	public FileOutputStream fo;
	public WritableWorkbook wwb;
	public WritableSheet ws;
	
	public String str;
	
  @Test
  public void verifylogin() throws Exception {
	  fi=new FileInputStream("C:\\Users\\happy\\Desktop\\test\\testcase.xls");
	  wb=Workbook.getWorkbook(fi);
	  s=wb.getSheet("Sheet1");
	  
	  fo=new FileOutputStream("C:\\Users\\happy\\Desktop\\test\\result.xls");
	  wwb=Workbook.createWorkbook(fo);
	  ws=wwb.createSheet("Sheet1", 0);
	  
	  for(int i=1;i<s.getRows();i++) {
	  driver.findElement(By.name("username")).sendKeys(s.getCell(0,i).getContents());
	  driver.findElement(By.name("password")).sendKeys(s.getCell(1,i).getContents());
	  driver.findElement(By.name("submit")).click();
	  
	  
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
	  
	  //Result printing
	  	 Label result = new Label(2, i, str);
	  	 ws.addCell(result);
	  }
	Label Actual_Result=new Label(2, 0, "Actual Result");
	ws.addCell(Actual_Result);
	
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

}
