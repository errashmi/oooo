package com.rex.demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test8 {
	public static void main(String[] args) throws Exception {
		locatorDemo3 ld=new locatorDemo3();
		ld.browserLaunch();
		ld.cssSelectorLocatorDemo();
	}
}
class locatorDemo3{
	public WebDriver driver;
	public void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}
	public void cssSelectorLocatorDemo() throws Exception {
		driver.findElement(By.cssSelector("input#email")).sendKeys("rashmi");  //Tag with ID name
		//driver.findElement(By.cssSelector("input#email")).clear();
		//Thread.sleep(3000);
		//driver.findElement(By.cssSelector("input.inputtext login_form_input_box")).sendKeys("happy");  //Tag with class name
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("pass");  //Tag with other attribute
	}
}