package com.rashmi.guru99;

import org.testng.annotations.Test;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Window_Handeling_15 {
	public WebDriver driver;
  @Test
  public void window_handle() throws Exception {
	  driver.findElement(By.linkText("Registration")).click();
	  String winID=driver.getWindowHandle();
	  System.out.println(winID);
	  driver.findElement(By.linkText("Feedback")).click();
	  Set<String>ID_set=driver.getWindowHandles();
	  Object[]obj=ID_set.toArray();
	  driver.switchTo().window(obj[1].toString());
	  driver.findElement(By.id("name")).sendKeys("RAshmi");
	  driver.close();
	  driver.switchTo().window(obj[0].toString());
	  driver.findElement(By.name("PNT_NAME")).sendKeys("rashmi");
	  driver.quit();
	  
	  
  }
  @BeforeTest
  public void beforeTest() throws Exception {
	  System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.seleniumbymahesh.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("HMS")).click();
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin");
		driver.findElement(By.name("submit")).click();
		
		Thread.sleep(3000);
  }

}
