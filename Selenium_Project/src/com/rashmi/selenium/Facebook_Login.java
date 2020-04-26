package com.rashmi.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class facebook{
	public static WebDriver driver;
	static void open_chrome() {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		
	}
	static void login() {
		driver.findElement(By.id("email")).sendKeys("rsrrasmi@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("9090609399");	
		driver.findElement(By.id("u_0_a")).click();
		
	}
}
public class Facebook_Login {

	public static void main(String[] args) {
		facebook.open_chrome();
		facebook.login();

	}

}
