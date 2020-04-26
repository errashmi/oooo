package com.rashmi.TestNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class GetAllText {
	public WebDriver driver;
  @Test
  public void getText() {
	  String str=driver.findElement(By.xpath("//form[@id='form1']/div[1]")).getText();
	  //System.out.println(str);
	  String[] str1=str.split("\n");
	  //System.out.println(str1.length);
	  for(int i=1;i<str1.length;i++) {
		  
		  if(str1[i].contains("*")) {
			  //System.out.println(str1[i]);
			  if(str1[i].equalsIgnoreCase("Relation*"))
				  System.out.println(str1[i]);
			  	else if(str1[i].equalsIgnoreCase("Title*"))
				  System.out.println(str1[i]);  
		  }
	  }
  }
  @BeforeTest
  public void beforeTest() throws Exception {
	  System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://www.seleniumbymahesh.com/");
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
	  driver.findElement(By.linkText("HMS")).click();
	  driver.findElement(By.name("username")).sendKeys("admin");
	  driver.findElement(By.name("password")).sendKeys("admin");
	  driver.findElement(By.name("submit")).click();
	  driver.findElement(By.linkText("Registration")).click();
	  Thread.sleep(2000);
  }

}
