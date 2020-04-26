//38-Write a program to explain double click and right click on a element.” http://demo.guru99.com/test/simple_context_menu.html   “http://demo.guru99.com/test/simple_context_menu.html”
package com.rex.A;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A38 {
	public WebDriver driver;
	public static void main(String[] args) throws Exception {
		A38 obj=new A38();
		obj.browserLaunch();
		obj.doubleClickRighrClickDemo();

	}
	public void doubleClickRighrClickDemo() throws Exception {
		//driver.navigate().to("http://demo.guru99.com/test/simple_context_menu.html");
		Actions act=new Actions(driver);
		WebElement btn = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		act.doubleClick(btn).build().perform();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		//Right click demo
		WebElement rbtn = driver.findElement(By.xpath("//span[text()='right click me']"));
		act.contextClick(rbtn).build().perform();
	}
	public void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
	}
}
