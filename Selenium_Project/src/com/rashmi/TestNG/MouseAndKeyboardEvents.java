package com.rashmi.TestNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;

public class MouseAndKeyboardEvents {
	public WebDriver driver;
	public Actions act;
	
	//Mouse Event
  @Test (enabled=false)
  public void f() throws Exception {
	act=new Actions(driver);
	Thread.sleep(4000);
	act.moveToElement(driver.findElement(By.linkText("FAQ’S"))).build().perform();
	driver.findElement(By.linkText("Selenium FAQ’s")).click();
	

  }
  
  //Keyboard event
  @Test (enabled=false)
  public void mouseEvents() throws Exception {
	act=new Actions(driver);
	Thread.sleep(4000);
	act.moveToElement(driver.findElement(By.linkText("FAQ’S"))).build().perform();
	driver.findElement(By.linkText("Selenium FAQ’s")).click();
	act.keyDown(Keys.CONTROL).sendKeys(Keys.END).build().perform();
	Thread.sleep(3000);
	act.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).build().perform();
	
  }
  
  //Drag and Drop
  @Test (enabled=false)
  public void dragDrop() {
	  driver.navigate().to("https://jqueryui.com/droppable/");
	  driver.switchTo().frame(0);
	  WebElement drag = driver.findElement(By.id("draggable"));
	  WebElement drop = driver.findElement(By.id("droppable"));
	  act=new Actions(driver);
	  //act.dragAndDrop(drag, drop).build().perform();
	  
	  //By using Mouse events
	  act.clickAndHold(drag).moveToElement(drop).release().build().perform();
  }
  //Resize
  @Test (enabled=false)
  public void resize() {
	  driver.navigate().to("https://jqueryui.com/resizable/");
	  driver.switchTo().frame(0);
	  act=new Actions(driver);
	  WebElement rs = driver.findElement(By.xpath("//div[@id='resizable']/div[3]"));
	  act.dragAndDropBy(rs, 80, 50).release().build().perform();  
  }
  
  //Right click
  @Test
  public void reghtclick() {
	  driver.navigate().to("https://jqueryui.com/resizable/");
	  act=new Actions(driver);
	  //for a single event only perform is sufficient
	  act.contextClick(driver.findElement(By.linkText("Accordion"))).perform();
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println(System.getProperty("user.dir"));
	  System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\DriverFiles\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://www.seleniumbymahesh.com");
	  driver.manage().window().maximize();
  }

}
