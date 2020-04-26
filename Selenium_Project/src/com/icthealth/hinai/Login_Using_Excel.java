package com.icthealth.hinai;

import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

import org.testng.annotations.BeforeTest;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Login_Using_Excel {
	public WebDriver driver;
	public FileInputStream fi;
	public Workbook wb;
	public Sheet s;
	 
	public FileOutputStream fo;
	public WritableWorkbook wwb;
	public WritableSheet ws;
		
	public String res;
	
  @Test
  public void verifyLofin() throws Exception {
	  fi=new FileInputStream("D:\\HINAI_TEST\\Testcase.xls");
	  wb=Workbook.getWorkbook(fi);
	  s=wb.getSheet("Sheet1");
	  
	  fo=new FileOutputStream("D:\\HINAI_TEST\\TestcaseResult.xls");
	  wwb=Workbook.createWorkbook(fo);
	  ws=wwb.createSheet("RESULT", 0);
	  
	  for(int i=1;i<s.getRows();i++) {
		  driver.findElement(By.id("login-username")).sendKeys(s.getCell(0, i).getContents());
		  driver.findElement(By.id("login-password")).sendKeys(s.getCell(1, i).getContents());
		  driver.findElement(By.xpath("//button[@class='base-button']")).click();
		  Thread.sleep(3000);
		  
		  try {
			  driver.findElement(By.linkText("Logout")).isDisplayed();
			  System.out.println("Valid Credential");
			  driver.findElement(By.linkText("Logout")).click();
			  res="PASS";
		  }
		  catch(Exception e){
			  System.out.println("invalid credential");
			  res="FAIL";
		  }
		  
		  Label result = new Label(2, i, res);
		  ws.addCell(result);
		  
		  for(int j=0;j<s.getColumns();j++) {
			  Label testdata = new Label(j, i, s.getCell(j, i).getContents());
			  ws.addCell(testdata);
		  }
		  Label userid = new Label(0, 0, "USER NAME");
		  Label pass = new Label(1, 0, "PASSWORD");
		  Label Exp_Res=new Label(2, 0, "Result");
		  ws.addCell(userid);
		  ws.addCell(pass);
		  ws.addCell(Exp_Res);
		  
	  }
	  
	  wwb.write();
	  wwb.close();
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://demo.icthealth.com/brltest/");
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	 
  }

}
