package com.rex.demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Test29 {
	public static void main(String[] args) throws Exception {
		tooltipDemo2 tp=new tooltipDemo2();
		tp.browserLaunch();
		tp.tooltip();
	}
}
class tooltipDemo2{
	public WebDriver driver;
	public void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/tooltip.html");
		driver.manage().window().maximize();
	}
	public void tooltip() throws Exception{
		WebElement btn = driver.findElement(By.id("download_now"));
		Actions act=new Actions(driver);
		act.moveToElement(btn).build().perform();
		String tooltipLink = driver.findElement(By.xpath("//div[@class='tooltip']/a")).getText();
		System.out.println(tooltipLink);
	}
}