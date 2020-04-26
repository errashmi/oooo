package com.rashmi.TestNG;

import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;

public class BootstrapDropdown2 {
	public WebDriver driver;
  @Test
  public void demoDropDown() throws Exception {
	  //new Select(driver.findElement(By.id("multi-select-demo"))).selectByValue("HTML");
	  WebElement multiselect = driver.findElement(By.id("multi-select-demo"));
	  List<WebElement> opt = multiselect.findElements(By.tagName("option"));
	  Thread.sleep(4000);
	  multiselect.click();
	  for(int i=0;i<opt.size();i++) {
		  System.out.println(opt.get(i).getAttribute("value"));
		  opt.get(i).click();
		  
		  //driver.findElement(By.xpath("ul[@class='multiselect-container dropdown-menu']"));
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
