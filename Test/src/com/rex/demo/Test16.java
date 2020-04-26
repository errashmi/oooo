package com.rex.demo;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test16 {

	public static void main(String[] args) {
		imagebutton ib=new imagebutton();
		ib.browserLaunch();
		ib.image();

	}

}
class imagebutton{
	public WebDriver driver;
	public void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}
	public void image(){
			driver.findElement(By.xpath("//i[@class='fb_logo img sp_QPh7VHZc0Ga sx_dad6ce']")).click();
	}
	}
