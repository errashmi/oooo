package com.rex.demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test21 {
	public static void main(String[] args) throws Exception {
		keyboardAndMouseEventDemo3 km=new keyboardAndMouseEventDemo3();
		km.browserLaunch();
		km.resize();
	}
}
class keyboardAndMouseEventDemo3{
	public WebDriver driver;
	public void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://jqueryui.com/resizable/");
		driver.manage().window().maximize();
	}
	public void resize() throws Exception{
		driver.switchTo().frame(0);
		WebElement icon=driver.findElement(By.xpath("//div[@id='resizable']/div[3]"));
		Actions act=new Actions(driver);
		Thread.sleep(3000);
		act.clickAndHold(icon).moveByOffset(100,20).release().build().perform();
	}
	}

