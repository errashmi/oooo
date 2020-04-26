package com.rex.demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test28 {

	public static void main(String[] args) throws Exception {
		tooltipDemo tp=new tooltipDemo();
		tp.browserLaunch();
		tp.tooltip();
	}
}
class tooltipDemo{
	public WebDriver driver;
	public void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}
	public void tooltip() throws Exception{
		WebElement img = driver.findElement(By.xpath("//i[@class='fb_logo img sp_QPh7VHZc0Ga sx_dad6ce']"));
		Actions act=new Actions(driver);
		act.moveToElement(img).build().perform();
		String tooltip = driver.findElement(By.xpath("//div[@id='blueBarDOMInspector']/div/div/div/div/h1/a")).getAttribute("title");
		System.out.println(tooltip);
	}
}