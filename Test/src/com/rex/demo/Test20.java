package com.rex.demo;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test20 {
	public static void main(String[] args) {
		keyboardAndMouseEventDemo2 km=new keyboardAndMouseEventDemo2();
		km.browserLaunch();
		km.dragdrop();
	}
}
class keyboardAndMouseEventDemo2{
	public WebDriver driver;
	public void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
	}
	public void dragdrop(){
		driver.switchTo().frame(0);
		WebElement src=driver.findElement(By.id("draggable"));
		WebElement dsc=driver.findElement(By.id("droppable"));
		Actions act=new Actions(driver);
		act.dragAndDrop(src, dsc).build().perform();
	}
	}

