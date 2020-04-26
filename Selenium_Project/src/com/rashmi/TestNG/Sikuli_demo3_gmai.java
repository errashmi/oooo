package com.rashmi.TestNG;

import org.testng.annotations.Test;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Screen;
import org.testng.annotations.BeforeTest;

public class Sikuli_demo3_gmai {
	public WebDriver driver;
	public Screen s;
	
  @Test
  public void sendmail() throws Exception {
	  driver.findElement(By.linkText("Gmail")).click();
	  driver.findElement(By.linkText("Sign in")).click();
	  Set<String> win = driver.getWindowHandles();
	  System.out.println(win);
	  Object[] obj = win.toArray();
	  driver.switchTo().window(obj[1].toString());
	  Thread.sleep(3000);
	  driver.findElement(By.id("identifierId")).sendKeys("rsrrasmi");
	  driver.findElement(By.id("identifierNext")).click();
	  Thread.sleep(6000);
	  
	  driver.findElement(By.xpath("//input[@type='password']")).sendKeys("9090609399");
	  driver.findElement(By.id("passwordNext")).click();
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji T-I-KE L3']")).click();
	  
	  driver.findElement(By.name("to")).sendKeys("rsrrasmi@gmail.com");
	  driver.findElement(By.name("subjectbox")).sendKeys("test");
	  driver.findElement(By.xpath("//div[@class='Am Al editable LW-avf']")).sendKeys("test mail");
	  driver.findElement(By.xpath("//div[@class='a1 aaA aMZ']")).click();
	  Thread.sleep(4000);
	  s=new Screen();
	  s.hover("D:\\Selenium\\Sikuli.sikuli\\sikuli-6248155103280727755.png");
	  Thread.sleep(4000);
	  s.click("D:\\Selenium\\Sikuli.sikuli\\sikuli-6248155103280727755.png");
	  Thread.sleep(4000);
	  s.hover("D:\\Selenium\\Sikuli.sikuli\\sikuli-335652715411765108.png");
	  Thread.sleep(4000);
	  s.doubleClick("D:\\Selenium\\Sikuli.sikuli\\sikuli-335652715411765108.png");
	  Thread.sleep(4000);
	  s.click("D:\\Selenium\\Sikuli.sikuli\\sikuli-6960985816467304683.png");
	  s.wheel(1, 10);
	  s.click("D:\\Selenium\\Sikuli.sikuli\\sikuli-6471699621558247774.png");
	  s.click("D:\\Selenium\\Sikuli.sikuli\\sikuli-3318100370302830090.png");
	  Thread.sleep(4000);
	  
	  
	  driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji aoO v7 T-I-atl L3']")).click();
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://www.google.com/");
	  driver.manage().window().maximize();
  }

}
