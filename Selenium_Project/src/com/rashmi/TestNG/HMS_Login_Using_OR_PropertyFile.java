package com.rashmi.TestNG;

import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class HMS_Login_Using_OR_PropertyFile {
	public WebDriver driver;
	
	 public static final String path="./HMS_Login.properties";
	 
	public static String getdata(String key) throws Exception {
		File f=new File(path);
		Properties p=new Properties();
		FileInputStream fi=new FileInputStream(f);
		p.load(fi);
		return p.getProperty(key);
	}
  @Test
  public void verifyLogin() throws Exception {
	  driver.findElement(By.name(getdata("usernameLoc"))).sendKeys(getdata("userName"));
	  driver.findElement(By.name(getdata("passwordLoc"))).sendKeys(getdata("password"));
	  driver.findElement(By.name(getdata("LoginLoc"))).click();
  }
  @BeforeTest
  public void beforeTest() throws Exception {
	  System.out.println(getdata("browser"));
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(getdata("prodURL"));
		driver.manage().window().maximize();
  }

}
