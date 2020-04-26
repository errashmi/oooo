package com.rashmi.TestNG;

import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class CheckboxDemo2 {
	public WebDriver driver;

  @Test
  public void checkboxdemo() {
	  WebElement tbl = driver.findElement(By.xpath("(//td[@class='table5'])[2]"));
	  List<WebElement> cbox = tbl.findElements(By.tagName("input"));
	  for(int i=0;i<cbox.size();i++) {
		  //print all check box option with status
		  System.out.println(cbox.get(i).getAttribute("value")+"----"+cbox.get(i).getAttribute("checked"));
		  
		  //select all check box
		  //cbox.get(i).click();   it will deselect the selected checkbox
		  
		  if(!cbox.get(i).isSelected()) {
			  cbox.get(i).click();
		  }
	  }
  }
  @BeforeTest
  	  public void beforeTest() {
		  System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get("http://echoecho.com/htmlforms09.htm");
		  driver.manage().window().maximize();

  }

}
