package com.rex.demo;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Test19 {
	public static void main(String[] args) {
		keyboardAndMouseEventDemo km=new keyboardAndMouseEventDemo();
		km.browserLaunch();
		km.keyMouse();
	}
}
class keyboardAndMouseEventDemo{
	public WebDriver driver;
	public void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}
	public void keyMouse(){
		Actions act = new Actions(driver);
		WebElement logo = driver.findElement(By.xpath("//i[@class='fb_logo img sp_QPh7VHZc0Ga sx_dad6ce']"));
		WebElement userid=driver.findElement(By.id("email"));
		act.moveToElement(logo).build().perform();	//Mouse event
		act.keyDown(userid, Keys.SHIFT).sendKeys(userid, "rashmi").build().perform();	//Keyboard event
	}
	}

