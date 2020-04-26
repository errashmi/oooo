package com.rex.demo;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test26 {

	public static void main(String[] args) {
		webTableDemo wt=new webTableDemo();
		wt.browserLaunch();
		wt.staticWebTable();
	}
}
class webTableDemo{
	public WebDriver driver;
	public void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.seleniumbymahesh.com/HMS");
		driver.manage().window().maximize();
	}
	public void staticWebTable(){
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin");
		driver.findElement(By.name("submit")).click();
		driver.findElement(By.linkText("Registration")).click();
		String txt1 = driver.findElement(By.xpath("//table/tbody/tr/td")).getText();
		System.out.println(txt1);
		String txt2 = driver.findElement(By.xpath("//table/tbody/tr[5]/td")).getText();
		System.out.println(txt2);
	}
}