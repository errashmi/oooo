package com.rex.demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Test23 {

	public static void main(String[] args) {
		AlertmsgDemo al=new AlertmsgDemo();
		al.browserLaunch();
		al.alert();
	}
}
class AlertmsgDemo{
	public WebDriver driver;
	public void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
	}
	public void alert(){
		driver.findElement(By.name("cusid")).sendKeys("123");
		driver.findElement(By.name("submit")).click();
		driver.switchTo().alert().accept();
		driver.switchTo().alert().accept();
		driver.findElement(By.name("cusid")).sendKeys("123");
		driver.switchTo().alert().dismiss();
	}
	
}