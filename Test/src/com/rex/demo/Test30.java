package com.rex.demo;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test30 {
	public static void main(String[] args) {
		BrokenlinksDemo bl=new BrokenlinksDemo();
		bl.browserLaunch();
		bl.bLinkTest();
	}
}
class BrokenlinksDemo{
	public WebDriver driver;
	public void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.seleniumbymahesh.com/");
		driver.manage().window().maximize();
	}
	public void bLinkTest(){
		List<WebElement> links = driver.findElements(By.tagName("a"));
		for(int i=0;i<links.size();i++) {
			//System.out.println(links.get(i).getText()+"***"+links.get(i).getAttribute("href"));
			testLink(links.get(i).getAttribute("href"));
		}
	}
	public void testLink(String linkUrl) {
		try {
			URL url = new URL(linkUrl);
			HttpURLConnection httpUrlConnect = (HttpURLConnection)url.openConnection();
			httpUrlConnect.setConnectTimeout(3000);
			httpUrlConnect.connect();
			if(httpUrlConnect.getResponseCode()==200) {
				System.out.println(linkUrl+" - "+httpUrlConnect.getResponseMessage());
			}
			if(httpUrlConnect.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND) {
				System.out.println(linkUrl+" - "+httpUrlConnect.getResponseMessage()+" - "+HttpURLConnection.HTTP_NOT_FOUND);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}