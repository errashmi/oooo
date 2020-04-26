package com.rex.demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test13 {

	public static void main(String[] args) {
		RadioButtonDemo2 rb=new RadioButtonDemo2();
		rb.browserLaunch();
		rb.radio();
	}

}
class RadioButtonDemo2{
	public WebDriver driver;
	public void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://echoecho.com/htmlforms10.htm");
		driver.manage().window().maximize();
	}
	public void radio(){
			driver.findElement(By.xpath("//input[@value='Milk']")).click();
			driver.findElement(By.xpath("//input[@value='Butter']")).click();
			driver.findElement(By.xpath("//input[@value='Cheese']")).click();
			driver.findElement(By.xpath("//input[@value='Water']")).click();
			driver.findElement(By.xpath("//input[@value='Beer']")).click();
			driver.findElement(By.xpath("//input[@value='Wine']")).click();
		}	
	}
