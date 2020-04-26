package com.rex.demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Test14 {

	public static void main(String[] args) {
		CheckBoxDemo cb=new CheckBoxDemo();
		cb.browserLaunch();
		cb.checkbox();
	}

}
class CheckBoxDemo{
	public WebDriver driver;
	public void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://echoecho.com/htmlforms09.htm");
		driver.manage().window().maximize();
	}
	public void checkbox(){
			driver.findElement(By.xpath("//input[@value='Milk']")).click();
			driver.findElement(By.xpath("//input[@value='Butter']")).click();
			driver.findElement(By.xpath("//input[@value='Cheese']")).click();
		}	
	}
