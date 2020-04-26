//40write a program to explain different types of wait used in selenium and java
package com.rex.A;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class A40 {
	public WebDriver driver;
	public static void main(String[] args) throws Exception {
		A40 obj=new A40();
		obj.browserLaunch();
		obj.login();

	}
	public void login() throws Exception {
		Thread.sleep(3000); //it is java command to wait
		driver.findElement(By.id("email")).sendKeys("rashmi");
		
		WebDriverWait wait=new WebDriverWait(driver, 3000);//explicit wait applicable for particular element
		WebElement txtPass = driver.findElement(By.id("pass"));
		wait.until(ExpectedConditions.visibilityOf(txtPass)).sendKeys("rashmi");
		}
	
	public void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //Applicable for all the web element,if the element is not available
	}
}
