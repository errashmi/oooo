package com.rashmi.TestNG;

import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class GetAllTextBox {
	public WebDriver driver;
  @Test
  public void getAllTextBox() {
	  List<WebElement>AllTB=driver.findElements(By.tagName("input"));
	  AllTB.size();
	  for(int i=1;i<AllTB.size();i++) {
		  if(AllTB.get(i).getAttribute("type").equalsIgnoreCase("text")) {
			  System.out.println(AllTB.get(i).getAttribute("name"));
		  }
		  else if(AllTB.get(i).getAttribute("class").equalsIgnoreCase("log")) {
			  System.out.println(AllTB.get(i).getAttribute("value"));
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
