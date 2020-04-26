package com.rex.demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test12 {

	public static void main(String[] args) {
		RadioButtonDemo rb=new RadioButtonDemo();
		rb.browserLaunch();
		rb.radio();
	}
}
class RadioButtonDemo{
	public WebDriver driver;
	public void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://echoecho.com/htmlforms10.htm");
		driver.manage().window().maximize();
	}
	public void radio(){
			driver.findElement(By.xpath("//input[@value='Milk']")).click();
			driver.findElement(By.xpath("//input[@value='Water']")).click();
		}	
	}
