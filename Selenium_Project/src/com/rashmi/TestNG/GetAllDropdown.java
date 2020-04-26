package com.rashmi.TestNG;

import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class GetAllDropdown {
	public WebDriver driver;
  @Test
  public void getalldropdown() throws Exception {
	  driver.findElement(By.linkText("HMS")).click();
	  driver.findElement(By.name("username")).sendKeys("admin");
	  driver.findElement(By.name("password")).sendKeys("admin");
	  driver.findElement(By.name("submit")).click();
	  driver.findElement(By.linkText("Registration")).click();
	  Thread.sleep(2000);
	  List<WebElement>dropdown=driver.findElements(By.tagName("select"));
	  for(int i=1;i<dropdown.size();i++) {
		  String str=dropdown.get(i).getAttribute("name");
		  System.out.println(str);
	  }
	  System.out.println("Total Number of dropdown in the page is "+dropdown.size());
  }
  @BeforeTest
  public void beforeTest() throws Exception {
	  System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://www.seleniumbymahesh.com/");
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
  }

}
