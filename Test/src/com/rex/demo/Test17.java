package com.rex.demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Test17 {
	public static void main(String[] args) {
		dropdown dd=new dropdown();
		dd.browserLaunch();
		dd.dropdownDemo();
	}
}
class dropdown{
	public WebDriver driver;
	public void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://echoecho.com/htmlforms11.htm");
		driver.manage().window().maximize();
	}
	public void dropdownDemo(){
			WebElement dDown1 = driver.findElement(By.xpath("//select[@name='dropdownmenu']"));
			new Select(dDown1).selectByValue("Cheese");
			new Select(dDown1).selectByVisibleText("Milk");
	}
	}
