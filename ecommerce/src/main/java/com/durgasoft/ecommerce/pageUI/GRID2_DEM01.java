package com.durgasoft.ecommerce.pageUI;

import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GRID2_DEM01 {
	public static void main(String args[]) throws Exception {
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setBrowserName("firefox");
		dc.setPlatform(Platform.WINDOWS);
		FirefoxOptions fo=new FirefoxOptions();
		fo.merge(dc);
		//ChromeOptions cp=new ChromeOptions();
		//cp.merge(dc);
		String hubURL="http://192.168.0.7:4444/wd/hub";
		WebDriver driver=new RemoteWebDriver(new URL(hubURL),dc);
		driver.get("http://www.seleniumbymahesh.com/");
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		}
}