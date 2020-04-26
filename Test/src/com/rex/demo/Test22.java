package com.rex.demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test22 {
	public static void main(String[] args) {
		FIleUploadDownloadDemo fl=new FIleUploadDownloadDemo();
		fl.browserLaunch();
		fl.upload();
	}
}
class FIleUploadDownloadDemo{
	public WebDriver driver;
	public void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/upload/");
		driver.manage().window().maximize();
	}
	public void upload(){
		driver.findElement(By.id("uploadfile_0")).sendKeys("D:\\abc.txt");
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.name("send")).click();
	}
	public void download() throws Exception {
		driver.navigate().to("http://demo.guru99.com/test/yahoo.html");
		Thread.sleep(3000);
		
	}
}

