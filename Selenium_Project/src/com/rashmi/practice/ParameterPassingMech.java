package com.rashmi.practice;

import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

public class ParameterPassingMech {
public WebDriver driver;
	//PARAMETER PASSING USING METHODS
	public void lang_select(String str) throws Exception {
		driver.findElement(By.xpath("//div[@id='SIvCob']/"+str)).click();
		Thread.sleep(3000);
	}
	@Test(enabled=false)
  public void parameterPassingByMethod() throws Exception {
		/*driver.findElement(By.xpath("//div[@id='SIvCob']/a[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='SIvCob']/a[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='SIvCob']/a[3]")).click();
		Thread.sleep(3000);*/
		
		lang_select("a[1]");
		lang_select("a[2]");
		lang_select("a[3]");
		lang_select("a[4]");
		lang_select("a[1]");
  }
	
//PARAMETER PASSING USING XML //REF:paramtest.xml
	
	@Test (enabled=false)
	@org.testng.annotations.Parameters({"uname","pwd"})
	public void parameterPassingUsingXML(String uname,String pwd) {
		driver.navigate().to("http://demo.icthealth.com/brltest/login.html");
		driver.findElement(By.id("login-username")).sendKeys(uname);
		driver.findElement(By.id("login-password")).sendKeys(pwd);
		driver.findElement(By.className("base-button")).click();
		driver.findElement(By.linkText("Logout")).click();
	}
	
//PARAMETER PASSING USING DATA PROVIDER
	
	
	@Test(dataProvider="Authentication",enabled=false )
	public void parameterPassingUsingDP(String uname,String pwd) {
		driver.navigate().to("http://demo.icthealth.com/brltest/login.html");
		driver.findElement(By.id("login-username")).sendKeys(uname);
		driver.findElement(By.id("login-password")).sendKeys(pwd);
		driver.findElement(By.className("base-button")).click();
		driver.findElement(By.linkText("Logout")).click();
		
		
	}
	
	@DataProvider(name="Authentication")
	public Object[][]dp(){
		return new Object[][] {
			{"khl2529","1234"},{"admin","12345"}
		};
		
	}
	
	//PARAMETER PASSING USING EXCEL SHEET (.XLS FILE)
	public FileInputStream fi;
	public Workbook w;
	public Sheet s;
	
	@Test
	public void parameterPassUsingExcel() throws Exception {
		driver.navigate().to("http://demo.icthealth.com/brltest/login.html");
		fi=new FileInputStream("D:\\Selenium\\ExcelFiles\\HINAI_LOGIN.xls");
		w=Workbook.getWorkbook(fi);
		s=w.getSheet("Sheet1");
		
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
	  System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\DriverFiles\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://www.google.com");
	  driver.manage().window().maximize();
  }

}
