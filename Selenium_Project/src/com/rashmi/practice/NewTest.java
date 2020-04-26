package com.rashmi.practice;

import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class NewTest {
	//PARAMETER PASSING MECHANISM
  public WebDriver driver;
  //parameter passing by method
  public void changeLang(String str) {
	  String str1="//div[@id='SIvCob']";
	  driver.findElement(By.xpath(str1+str)).click();
  }
	@Test(enabled=false)
  public void parameterPassingByMethod() {
		//driver.findElement(By.xpath("//div[@id='SIvCob']/a[2]")).click();
		changeLang("/a[2]");
		changeLang("/a[3]");
		changeLang("/a[1]");
  }
	//parameter passing using XML file
	
	@Test(enabled=false)
	@Parameters({"uid","pass"})
	public void parameterPassingUsingXML(String uid,String pass) {
		driver.navigate().to("http://demo.icthealth.com/brltest");
		driver.findElement(By.id("login-username")).sendKeys(uid);
		driver.findElement(By.id("login-password")).sendKeys(pass);
		driver.findElement(By.className("base-button")).click();
		driver.findElement(By.linkText("Logout")).click();
	}
	
	//parameter passing using DATA PROVIDER
	@DataProvider(name="userCredential")
	public Object[][]dp(){
		return new Object[][] {
			{"khl2529","1234"},{"admin","admin"}
		};
		
	}
	
	@Test(dataProvider="userCredential",enabled=false)
	public void parameterPassingUsingDP(String uid,String pass) {
		driver.navigate().to("http://demo.icthealth.com/brltest");
		driver.findElement(By.id("login-username")).sendKeys(uid);
		driver.findElement(By.id("login-password")).sendKeys(pass);
		driver.findElement(By.className("base-button")).click();
		driver.findElement(By.linkText("Logout")).click();

	}
//parameter passing using excel sheet (.xls file)
	FileInputStream fi;
	Workbook wb;
	Sheet s;
	@Test
	public void parameterPassingUsingEXCEL() throws Exception {
		fi=new FileInputStream("D:\\Selenium\\ExcelFiles\\HINAI_LOGIN.xls");
		wb=Workbook.getWorkbook(fi);
		s=wb.getSheet("Sheet1");
		driver.navigate().to("http://demo.icthealth.com/brltest");
		for(int i=1;i<s.getRows();i++) {
			driver.findElement(By.id("login-username")).sendKeys(s.getCell(0, i).getContents());
			driver.findElement(By.id("login-password")).sendKeys(s.getCell(1, i).getContents());
			driver.findElement(By.className("base-button")).click();
			driver.findElement(By.linkText("Logout")).click();
		}
		

	}
  @BeforeTest
  public void beforeTest() {
	  System.out.println(System.getProperty("user.dir"));
	  System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\DriverFiles\\chromedriver.exe" );
	  driver=new ChromeDriver();
	  driver.get("http://www.google.com");
	  driver.manage().window().maximize();
  }

}
