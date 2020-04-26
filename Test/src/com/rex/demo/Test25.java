package com.rex.demo;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test25 {

	public static void main(String[] args) {
		pupupWindowDemo pp=new pupupWindowDemo();
		pp.browserLaunch();
		pp.windowhandle();
	}
}
class pupupWindowDemo{
	public WebDriver driver;
	public void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
	}
	public void windowhandle(){
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		Set<String> str = driver.getWindowHandles();
		for(int i=0;i<str.size();i++) {
			System.out.println(str);
		}
		Object[] obj = str.toArray();
		driver.switchTo().window(obj[1].toString());
		driver.findElement(By.name("emailid")).sendKeys("rashmi");
	}
	
}