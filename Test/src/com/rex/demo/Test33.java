package com.rex.demo;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test33 {
	public WebDriver driver;
	public static void main(String[] args) throws Exception {
		Test33 obj=new Test33();
		obj.browserLaunch();
		obj.framesDemo();
	}
	public void framesDemo() throws Exception {
		List<WebElement> fm = driver.findElements(By.tagName("frame"));
		System.out.println("Total no of frames are "+fm.size());
		//driver.findElement(By.linkText("com.thoughtworks.selenium")).click(); //NosuchElement exception as it is present in different frame
		driver.switchTo().frame(2);
		driver.findElement(By.linkText("com.thoughtworks.selenium")).click();
		//WebElement frm1 = driver.findElement(By.xpath("//frame[@name='packageFrame']"));
		driver.switchTo().parentFrame();
		driver.switchTo().frame(1);
		driver.findElement(By.linkText("Actions")).click();
		driver.switchTo().parentFrame();
		driver.switchTo().frame("packageListFrame");
		driver.findElement(By.linkText("org.openqa.selenium")).click();
		Thread.sleep(3000);
		driver.switchTo().parentFrame();
		driver.switchTo().frame(1);
		driver.findElement(By.linkText("WebDriver")).click();
	}
	public void browserLaunch() {
		  System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get("https://seleniumhq.github.io/selenium/docs/api/java/");
		  driver.manage().window().maximize();  
	  }
}
