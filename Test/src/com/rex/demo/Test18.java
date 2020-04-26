package com.rex.demo;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test18 {
	public static void main(String[] args) throws Exception {
		BootstrapDropdown bbd=new BootstrapDropdown();
		bbd.browserLaunch();
		bbd.bsDropdownDemo();
	}
}
class BootstrapDropdown{
	public WebDriver driver;
	public void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.bbc.com/");
		driver.manage().window().maximize();
	}
	public void bsDropdownDemo() throws Exception{
			driver.findElement(By.xpath("//a[text()='More']")).click();
			Thread.sleep(5000);
			WebElement table = driver.findElement(By.xpath("//div[@id='orb-panel-more']"));
			List<WebElement> links = table.findElements(By.tagName("a"));
			for(int i=0;i<links.size();i++) {
				System.out.println(links.get(i).getText());
				if(links.get(i).getText().equalsIgnoreCase("Weather"))
					links.get(i).click();
			}
	}
	}
