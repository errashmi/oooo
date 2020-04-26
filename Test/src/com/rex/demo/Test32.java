package com.rex.demo;

import java.util.Calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test32 {
	public WebDriver driver;
	public static void main(String[] args) {
		Test32 obj=new Test32();
		obj.browserLaunch();
		obj.selectDate();

	}
	public void selectDate() {
		String date="15/02/1992";
		String d[]=date.split("/");
		System.out.println(d[2]);
		System.out.println(Calendar.getInstance().get(Calendar.YEAR));
		//int yeardiff=Integer.parseInt(Calendar.getInstance().get(Calendar.YEAR))-(d[2]);
		int yeardiff=Integer.parseInt(d[2])-(Calendar.getInstance().get(Calendar.YEAR));
		System.out.println(yeardiff);
		driver.findElement(By.xpath("//span[@class='k-icon k-i-calendar']")).click();
		driver.findElement(By.xpath("xpath=//div[6]/div/div/div/a[2]")).click();
		
		if(yeardiff!=0) {
			if(yeardiff>0) {
				for(int i=0;i<yeardiff;i++) {
					
				}
			}
			if(yeardiff<0) {
				
			}
		}
	}
	public void browserLaunch() {
		  System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get("https://demos.telerik.com/kendo-ui/datetimepicker/index");
		  driver.manage().window().maximize();  
	  }
}
