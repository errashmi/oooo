//30-Write a program to identify the broken links in http://www.seleniumbymahesh.com
package com.rex.D;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D20 {
	public static WebDriver driver;
	public static void main(String[] args) {
		browserLaunch();
		brokenLinksDemo();
	}
	public static void brokenLinksDemo() {
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		for(int i=0;i<allLinks.size();i++) {
			String link=allLinks.get(i).getText();
			String url = allLinks.get(i).getAttribute("href");
			//System.out.println(link+"***"+url);
			linktest(link,url);
		}
	}
	private static void linktest(String link, String linkUrl) {
		try {
			URL url=new URL(linkUrl);
			HttpURLConnection httpUrlConnect = (HttpURLConnection)url.openConnection();
			httpUrlConnect.setConnectTimeout(3000);
			httpUrlConnect.connect();
			if(httpUrlConnect.getResponseCode()==200) {
				System.out.println(link+"***"+url+httpUrlConnect.getResponseMessage());
			}
			else if(httpUrlConnect.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND) {
				System.out.println(link+"***"+url+httpUrlConnect.getResponseMessage());
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	public static void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.seleniumbymahesh.com");
		driver.manage().window().maximize();
	}
}
