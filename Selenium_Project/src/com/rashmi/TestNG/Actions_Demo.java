package com.rashmi.TestNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;

public class Actions_Demo {
	public WebDriver driver;
	
	
  @Test
  public void mouseEvents() throws Exception {
		Actions a=new Actions(driver);
		Thread.sleep(3000);
		WebElement faq = driver.findElement(By.xpath("//li[@id='menu-item-85']"));
		a.moveToElement(faq).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Selenium FAQ’s")).click();
		//a.keyDown(Keys.CONTROL).sendKeys(Keys.END).build().perform();
		//Thread.sleep(3000);
		//a.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).build().perform();
		
			}
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.seleniumbymahesh.com/");
		driver.manage().window().maximize();
  }

}
