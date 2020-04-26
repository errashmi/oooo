package com.rashmi.guru99;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class FileUploadDownload_13 {
	public WebDriver driver;
  @Test
  public void fileUpload() {
	  driver.findElement(By.xpath("//input[@class='file-upload-input']")).sendKeys("C:\\Users\\happy\\Desktop\\boAt complain no.png");
  }
  
  public void fileDownload() {
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://www.freepdfconvert.com/excel-to-pdf");
	  driver.manage().window().maximize();
	  
  }

}
