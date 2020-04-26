package com.rashmi.TestNG;

import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class RadioButtonDemo {
	public WebDriver driver;
  @Test
  public void radioDem() throws Exception {
	  WebElement tbl = driver.findElement(By.xpath("(//td[@class='table5'])[2]"));
	  //List<WebElement> rbtn = tbl.findElements(By.tagName("input"));
	  //for(int i=0;i<rbtn.size();i++) {
		  					//print all button name with status
		  //System.out.println(rbtn.get(i).getAttribute("value")+"---"+rbtn.get(i).getAttribute("checked"));
		  					//select a radio button
		  //if(rbtn.get(i).getAttribute("value").equalsIgnoreCase("milk")) {
			//  rbtn.get(i).click();
		  //}
		  
		  //print group wise status
		  for(int k=1;k<3;k++) {
			  List<WebElement> grad = tbl.findElements(By.name("group"+k));
			  for(int l=0;l<grad.size();l++) {
				  grad.get(l).click();
				  for(int m=0;m<grad.size();m++) {
					  System.out.println(grad.get(m).getAttribute("value")+"-------"+grad.get(m).getAttribute("checked"));
					  Thread.sleep(3000);
				  }
			  }
		  //}
		  
		  
	  }
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://echoecho.com/htmlforms10.htm");
	  driver.manage().window().maximize();
  }

}
