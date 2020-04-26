package com.rashmi.TestNG;

import org.testng.annotations.Test;

import jxl.write.DateFormat;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeTest;


public class ScreenShot {
	public WebDriver driver;
	
  @Test(enabled=false)
  public void normalScrrnShot()throws Exception {
	  //Convert web driver object to TakeScreenshot
	  TakesScreenshot tss = ((TakesScreenshot)driver);
	  //Call getScreenshotAs method to create image file
	  File file = tss.getScreenshotAs(OutputType.FILE);
	  //Copy file to Desired Location
	  FileHandler.copy(file, new File( "D:\\Selenium\\Screenshots\\HomePage.jpg"));
	  //FileUtils.copyFile();
	  }
  
  //Normal ScreenShot
  @Test(enabled=false)
  public void normalscreenshot() throws Exception {
	  TakesScreenshot tss = ((TakesScreenshot)driver);
	  File file = tss.getScreenshotAs(OutputType.FILE);
	  FileHandler.copy(file, new File("D:\\Selenium\\Screenshots\\HomePageSS.jpg"));
  }
  //Screenshot Based on Condition
  @Test(enabled=false)
  public void conditionbasedScreenShot() throws Exception {
	  Thread.sleep(4000);
	  List<WebElement> links = driver.findElements(By.linkText("CAREERS"));
	  System.out.println(links.size());
	  for(int i=0;i<links.size();i++) {
		  links.get(i).click();
		  Thread.sleep(3000);
	  }
	  if(links.size()==1) {
		  TakesScreenshot tss = ((TakesScreenshot)driver);
		  File file = tss.getScreenshotAs(OutputType.FILE);
		  FileHandler.copy(file, new File("D:\\Selenium\\Screenshots\\CareersPage.jpg"));
	  }
		  }
//Function based screenshot (click all link and take screenshot)	  
  @Test (enabled=false)
  public void functionBasedScreenshot() throws Exception {
  driver.navigate().to("http://newtours.demoaut.com/");
  List<WebElement> allLinks = driver.findElements(By.tagName("a"));
  for(int i=0;i<allLinks.size();i++) {
	  System.out.println(allLinks.get(i).getText());
	  String linkname=allLinks.get(i).getText();
	  allLinks.get(i).click();
	  Thread.sleep(3000);
	  
	  TakesScreenshot tss = ((TakesScreenshot)driver);
	  File file = tss.getScreenshotAs(OutputType.FILE);
	  FileHandler.copy(file, new File("D:\\Selenium\\Screenshots\\"+linkname+".jpg"));
	  allLinks = driver.findElements(By.tagName("a"));  //To avoid StaleElementReferenceException
  }
  
  }
  
  @Test (enabled=false)
  //screenshot based on timing
  
  public void dateTimeScreenShot()throws Exception {
	  driver.navigate().to("http://newtours.demoaut.com/");
	  List<WebElement> allLinks = driver.findElements(By.tagName("a"));
	  for(int i=0;i<allLinks.size();i++) {
		  System.out.println(allLinks.get(i).getText());
		  String linkname=allLinks.get(i).getText();
		  allLinks.get(i).click();
		  Thread.sleep(3000);
		  
		  Date dt = new Date();
		  SimpleDateFormat df = new SimpleDateFormat("dd-MM-yy-hh-mm-ss");
		  
		  
		  
		  TakesScreenshot tss = ((TakesScreenshot)driver);
		  File file = tss.getScreenshotAs(OutputType.FILE);
		  FileHandler.copy(file, new File("D:\\Selenium\\Screenshots\\"+df.format(dt)+"-"+linkname+".jpg"));
		  allLinks = driver.findElements(By.tagName("a"));  //To avoid StaleElementReferenceException
	  }
  }
  
  @Test 
  //screenshot if testcase is passed //not completed
  
  public void PassesScreenShot()throws Exception {
	  driver.navigate().to("http://newtours.demoaut.com/");
	  List<WebElement> allLinks = driver.findElements(By.tagName("a"));
	  for(int i=0;i<allLinks.size();i++) {
		  System.out.println(allLinks.get(i).getText());
		  String linkname=allLinks.get(i).getText();
		  allLinks.get(i).click();
		  Thread.sleep(3000);
		  
		  Date dt = new Date();
		  SimpleDateFormat df = new SimpleDateFormat("dd-MM-yy-hh-mm-ss");
		  
		  if(driver.getTitle().contains("------")) {
			  TakesScreenshot tss = ((TakesScreenshot)driver);
			  File file = tss.getScreenshotAs(OutputType.FILE);
			  FileHandler.copy(file, new File("D:\\Selenium\\Screenshots\\"+df.format(dt)+"-"+linkname+".jpg"));
			  allLinks = driver.findElements(By.tagName("a"));  //To avoid StaleElementReferenceException

			  
		  }
		  
		  TakesScreenshot tss = ((TakesScreenshot)driver);
		  File file = tss.getScreenshotAs(OutputType.FILE);
		  FileHandler.copy(file, new File("D:\\Selenium\\Screenshots\\"+df.format(dt)+"-"+linkname+".jpg"));
		  allLinks = driver.findElements(By.tagName("a"));  //To avoid StaleElementReferenceException
	  }
  }
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  //driver.get("http://www.seleniumbymahesh.com/");
	  driver.manage().window().maximize();
	  
  }

}
