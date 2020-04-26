package com.rashmi.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

class locators{
	public static WebDriver driver;
	public static void open_chrome() {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.icthealth.com/brltest");
		driver.manage().window().maximize();
	}
	public static void show_locators() {
		driver.findElement(By.id("login-username")).sendKeys("khl2529");		//id
		driver.findElement(By.name("j_password")).sendKeys("1234");			    //name
		//driver.findElement(By.xpath("//*[@class='base-button']")).click();		//xpath
		//driver.findElement(By.xpath("//button[@class='base-button']")).click();		//Relative xpath
		driver.findElement(By.xpath("//html/body/div[2]/div/form/button[@class='base-button']")).click();//Absolute xpath
		driver.findElement(By.linkText("Apps")).click();   //linktext
		driver.findElement(By.partialLinkText("Ambulatory")).click(); //partial link text
		//driver.findElement(By.className("OutpatientIcon Registration")).click(); //className
		//driver.findElement(By.linkText("Registration")).click();
		//new Select(driver.findElement(By.tagName("select"))).selectByVisibleText("Mr.");
		driver.findElement(By.xpath("//*[@class='icon registration']")).click();
		driver.findElement(By.xpath("//*[@class='OutpatientIcon Registration']")).click();
		driver.findElement(By.linkText("Registration")).click();
		driver.findElement(By.cssSelector("input[class='placeFirstName']")).sendKeys("test");//cssSelector
		
	}
}
public class WD_Locators {

	public static void main(String[] args) {
		locators.open_chrome();
		locators.show_locators();
		
		
		
		

	}

}
