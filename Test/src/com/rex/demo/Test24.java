package com.rex.demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test24 {

	public static void main(String[] args) throws Exception {
		AlertmsgDemo2 al=new AlertmsgDemo2();
		al.browserLaunch();
		al.alert();
	}
}
//Bootstrap alert handeling
class AlertmsgDemo2{
	public WebDriver driver;
	public void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://paytm.com/");
		driver.manage().window().maximize();
	}
	public void alert() throws Exception{
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Log In/Sign Up']")).click();
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//span[text()='Login/Signup with mobile number and password']")).click();
		driver.findElement(By.name("username")).sendKeys("rashmi");	
	}
	
}