//29-Write a program to demonstrate bootstrap tooltip in http://demo.guru99.com/test/tooltip.html
package com.rex.D;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class D19 {
	public static WebDriver driver;
	public static void main(String[] args) throws Exception {
		browserLaunch();
		tooltipDemo1();
	}
	public static void tooltipDemo1() throws Exception {
		driver.navigate().to("http://demo.guru99.com/test/tooltip.html");
		Thread.sleep(3000);
		WebElement btnDownload = driver.findElement(By.linkText("Download now"));
		Actions act=new Actions(driver);
		act.moveToElement(btnDownload).build().perform();
		driver.findElement(By.linkText("What's new in 3.2")).click();
		driver.navigate().back();
		//act.moveToElement(btnDownload).build().perform();  StaleElementReferenceException
		btnDownload = driver.findElement(By.linkText("Download now"));
		act.moveToElement(btnDownload).build().perform();
		System.out.println(driver.findElement(By.xpath("//div[@class='tooltip']/table")).getText());
	}
	public static void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
	}
}
