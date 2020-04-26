//02-Write a program to launch "Mercury Tours" site and verify its title.” http://newtours.demoaut.com/mercurywelcome.php”

package com.rex.A;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A2 {
	public WebDriver driver;
	public static void main(String[] args) {
		A2 obj=new A2();
		obj.browserLaunch();
		obj.verifyTitle();
	}
	public void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/mercurywelcome.php");
		driver.manage().window().maximize();
	}
	public void verifyTitle() {
		String ActualTitle="Welcome: Mercury Tours";
		String title=driver.getTitle();
		System.out.println(title);
		if(ActualTitle.equalsIgnoreCase(title))
			System.out.println("You are in correct page");
		else
			System.out.println("you are in wrong page");
		
	}
}