package com.rex.demo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Test2 {
	public static void main(String[]args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
		String s1=driver.getTitle();
		System.out.println(s1);
		String s2="Welcome: Mercury Tours";
		if(s1.equalsIgnoreCase(s2)) {
			System.out.println("Compared successfully");
		}
		else
			System.out.println("You are in a wrong page");
		
		driver.close();
	}
}
