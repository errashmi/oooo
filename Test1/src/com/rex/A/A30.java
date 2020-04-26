//30-Write a program to identify the broken links in "http://www.seleniumbymahesh.com"
package com.rex.A;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A30 {
	public WebDriver driver;
	public static void main(String[] args) throws Exception {
		A30 obj=new A30();
		obj.browserLaunch();
		obj.brokenLinkTest();

	}
	public void brokenLinkTest() throws Exception {
		List<WebElement> lnk = driver.findElements(By.tagName("a"));
		for(int i=0;i<lnk.size();i++) {
			//System.out.println(lnk.get(i).getText()+"***"+lnk.get(i).getAttribute("href"));
			//linktest(lnk.get(i).getAttribute("href"));
			System.out.println(lnk.get(i).getAttribute("href"));
			linktest(lnk.get(i).getAttribute("href"));
		}
	}
	public void linktest(String link) throws Exception {
		URL url=new URL(link);
		HttpURLConnection httpURLConnect=(HttpURLConnection) url.openConnection();
		httpURLConnect.setConnectTimeout(3000);
		httpURLConnect.connect();
		if(httpURLConnect.getResponseCode()==200) {
			System.out.println(link+"-"+httpURLConnect.getResponseMessage());
		}	
	}
	public void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.seleniumbymahesh.com");
		driver.manage().window().maximize();
	}
}
