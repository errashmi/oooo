package com.rashmi.TestNG;

import org.testng.annotations.Test;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class CheckboxDemo {
	public WebDriver driver;
  @Test
  public void f() {
	  driver.findElement(By.xpath("//div[@class='btn-group']/button/span")).click();
	  WebElement dd = driver.findElement(By.xpath("//ul[@class='multiselect-container dropdown-menu']"));
	  List<WebElement> labels = dd.findElements(By.tagName("label"));
	  
	  Random r=new Random();
	  int x=r.nextInt(5);
	  System.out.println(x);
	  for(int i=0;i<labels.size();i++) {
		  System.out.println(labels.get(i).getText());
		  //labels.get(i).click();  All select
		  
		  //single select
		  //if(labels.get(i).getText().equalsIgnoreCase("Bootstrap Tips")) {
			  //labels.get(i).click();
		  //}
		  
		  //random select
		  labels.get(x).click();
		  
	  }
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://jquery-az.com/boots/demo.php?ex=63.0_1");
	  driver.manage().window().maximize();

  }

}
