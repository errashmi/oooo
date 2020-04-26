package com.rashmi.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class google_lang{
	public static WebDriver driver;
	public static void open_url() {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.google.com");
	}
	public static void lang_sel() {
		driver.findElement(By.xpath("//*[@id='SIvCob']/a[1]")).click();
		driver.findElement(By.xpath("//*[@id='SIvCob']/a[2]")).click();
		driver.findElement(By.xpath("//*[@id='SIvCob']/a[3]")).click();
		driver.findElement(By.xpath("//*[@id='SIvCob']/a[4]")).click();
		driver.findElement(By.xpath("//*[@id='SIvCob']/a[1]")).click();
	}
	public static void lang_select(String str) {
		driver.findElement(By.xpath(str)).click();
	}
}

public class Google_lang_select {

	public static void main(String[] args) {
		google_lang.open_url();
		//google_lang.lang_sel();
		google_lang.lang_select("//*[@id='SIvCob']/a[1]");
		google_lang.lang_select("//*[@id='SIvCob']/a[2]");
		google_lang.lang_select("//*[@id='SIvCob']/a[3]");
		google_lang.lang_select("//*[@id='SIvCob']/a[4]");
		google_lang.lang_select("//*[@id='SIvCob']/a[1]");

	}

}
