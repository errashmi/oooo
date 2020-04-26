package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {
	public WebDriver driver;
	public void browserLaunch(String browser,String url) {
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe");
			driver=new ChromeDriver();		
		}
		else if(browser.equalsIgnoreCase("chrome")) {}
		else if(browser.equalsIgnoreCase("chrome")) {}
		driver.get(url);
		driver.manage().window().maximize();
	}
}
