//34-write a program to take screenshot after login into HMS http://www.seleniumbymahesh.com/HMS/
package com.rex.D;

import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class D24 {
	public static WebDriver driver;
	public static void main(String[] args) throws Exception {
		browserLaunch();
		screenShotDemo();
	}
	public static void screenShotDemo() throws Exception {
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin");
		driver.findElement(By.name("submit")).click();
		TakesScreenshot tss = (TakesScreenshot)driver;
		File src = tss.getScreenshotAs(OutputType.FILE);
		File dsc=new File("./Screenshot/HMSLogin.png");
		FileHandler.copy(src, dsc);
	}
	public static void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.seleniumbymahesh.com/HMS/");
	}	
}
