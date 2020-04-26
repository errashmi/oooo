//09-write a program to show location element using xpath and its functions https://www.facebook.com/
package com.rex.test3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T4 {
	public static WebDriver driver;
	public static void main(String[] args) throws Exception {
		browserLaunch();
		xpathDemo();

	}
	public static void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}
	public static void xpathDemo() throws Exception {
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Rashmi");   //single attribute
		driver.findElement(By.xpath("//input[@class='inputtext login_form_input_box'][@id='pass']")).sendKeys("Admin"); //multiple attribute
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@class='inputtext login_form_input_box'])[1]")).clear(); //using index
		driver.findElement(By.xpath("(//input[@class='inputtext login_form_input_box'])[2]")).clear();  //using index
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@class='inputtext login_form_input_box'])[last()]")).sendKeys("Admin"); //using last() function
		driver.findElement(By.xpath("(//input[@class='inputtext login_form_input_box'])[last()-1]")).sendKeys("Admin");   //using last() function
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@class='inputtext login_form_input_box'])[position()=1]")).clear(); //using position function
		driver.findElement(By.xpath("(//input[@class='inputtext login_form_input_box'])[position()=2]")).clear();  //using position function
		driver.findElement(By.xpath("//a[text()='Forgotten account?']")).click();
	
	}
}
