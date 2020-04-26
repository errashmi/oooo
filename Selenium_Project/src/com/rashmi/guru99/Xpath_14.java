package com.rashmi.guru99;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Xpath_14 {
	public WebDriver driver;
  @Test
  public void getxpath() {
	  //Absolute xpath
	  //relative xpath
	  driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin");   //single attribute
	  driver.findElement(By.xpath("//input[@class='inputtext'][@type='email']")).sendKeys("admin"); //multiple attribute
	  driver.findElement(By.xpath("(//input[@class='inputtext'])[1]")).sendKeys("admin"); //using index value,index starts from 1
	  
	  driver.findElement(By.xpath("//td[@class='login_form_label_field']/div/a")).click(); //using parent child relationship
	  
	  driver.findElement(By.xpath("(//input[@class='inputtext'])[last()]")).sendKeys("admin"); //using last() function
	  driver.findElement(By.xpath("(//input[@class='inputtext'])[last()-1]")).sendKeys("admin"); //using last function
	   
	  driver.findElement(By.xpath("(//input[@class='inputtext'])[position()=1]")).sendKeys("admin"); //using position() function
	  
	  driver.navigate().to("https://www.amazon.in");
	  
	  driver.findElement(By.xpath("//a[text()='Amazon Pay']")).click();  //using text() function
	  driver.findElement(By.xpath("/a[starts-with(text(),'Amazon')]")).click();  //using starts with() function
	  driver.findElement(By.xpath("//a[contains(text(),'Customer')]")).click();  //using contains() function
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://www.facebook.com");
	  driver.manage().window().maximize();
	  
  }

}
