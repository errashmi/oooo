//32-Write a program to select a particular data on dynamic web calendar on https://demos.telerik.com/kendo-ui/datetimepicker/index
package com.rex.E;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynWebCal {
	public static WebDriver driver;
	public static void main(String[] args) {
		browserLaunch();
		selectDate();
	}
	public static void selectDate() {
		String dob="15/02/1992 4:42 PM";
		String[] dateArr = dob.split("/");
		String date=dateArr[0];
		String month=dateArr[1];
		System.out.println("date is : "+date);
		System.out.println("date is : "+month);
		String[] yrArr = dateArr[2].split(" ");
		String year=yrArr[0];
		System.out.println("Year of birth is : "+year);
		
		driver.findElement(By.xpath("//span[@class='k-icon k-i-calendar']")).click();
		driver.findElement(By.xpath("//div[@class='k-header']/a[2]")).click();
		WebElement leftIcon = driver.findElement(By.xpath("//span[@class='k-icon k-i-arrow-60-left']"));
		WebElement rightIcon = driver.findElement(By.xpath("//span[@class='k-icon k-i-arrow-60-right']"));
		String curYear = driver.findElement(By.xpath("//div[@class='k-header']/a[2]")).getText();
		System.out.println(curYear);
		int currentYear = Integer.parseInt(curYear);
		int reqYear = Integer.parseInt(year);
		int yearDif=currentYear-reqYear;
		if(yearDif!=0) {
			
			if(yearDif>0) {
				//move to left
				for(int i=0;i<yearDif;i++) {
					leftIcon.click();
				}
			}
			else if(yearDif<0){
				//move to right
				for(int i=0;i<yearDif*(-1);i++) {
					rightIcon.click();
				}
			}
		}
		 
		//select month
		List<WebElement> availMonths = driver.findElements(By.xpath("//table[@class='k-content k-meta-view k-year']/tbody/tr/td"));
		for(int i=0;i<availMonths.size();i++) {
			//System.out.println(availMonths.get(i).getText());
		}
		int reqMonth = Integer.parseInt(month);
		availMonths.get(reqMonth-1).click();
		
		//select date
		 List<WebElement> list_AllDateToBook = driver.findElements(By.xpath("//div[@id='datetimepicker_dateview']//table//tbody//td[not(contains(@class,'k-other-month'))]"));
		/*for(int i=0;i<list_AllDateToBook.size();i++) {
			System.out.println(list_AllDateToBook.get(i).getText());	
		}*/
		int reqDate = Integer.parseInt(date);
		list_AllDateToBook.get(reqDate-1).click();
	}
	public static void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://demos.telerik.com/kendo-ui/datetimepicker/index");
		driver.manage().window().maximize();
	}

}
