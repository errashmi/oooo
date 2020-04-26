//write a program to show location element using xpath and its functions https://www.facebook.com/
package com.rex.A;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A9 {
	public WebDriver driver;
	public static void main(String[] args) throws Exception {
		A9 obj=new A9();
		obj.browserLaunch();
		obj.xpathDemo();
	}
	public void xpathDemo() throws Exception {
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("rashmi"); //single attribute
		driver.findElement(By.xpath("//input[@type='password'][@id='pass']")).sendKeys("rashmi");//multiple attribute
		driver.findElement(By.xpath("(//input[@class='inputtext login_form_input_box'])[1]")).clear();//xpath with index
		driver.findElement(By.xpath("(//input[@class='inputtext login_form_input_box'])[2]")).clear();//xpath with index
		driver.findElement(By.xpath("//td[@class='login_form_label_field']/div/a")).click();//parent-child relation
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@class='inputtext login_form_input_box'])[last()]")).sendKeys("happy");//Using last() function
		driver.findElement(By.xpath("(//input[@class='inputtext login_form_input_box'])[last()-1]")).sendKeys("happy");//Using last() function
		driver.findElement(By.xpath("(//input[@class='inputtext login_form_input_box'])[position()=1]")).clear(); //Using position() function
		driver.findElement(By.xpath("(//input[@class='inputtext login_form_input_box'])[position()=2]")).clear();	//Using position() function
		driver.findElement(By.xpath("//a[text()='Forgotten account?']")).click();//using text() function
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[starts-with(text(),'Forgotten')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Forgot')]")).click();
		
		
	}
	public void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}
}
