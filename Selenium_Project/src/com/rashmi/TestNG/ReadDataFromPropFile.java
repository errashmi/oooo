package com.rashmi.TestNG;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadDataFromPropFile {
 public static final String path="./HMS_Login.properties";
	public static String getdata(String key) throws Exception {
		File f=new File(path);
		Properties p=new Properties();
		FileInputStream fi=new FileInputStream(f);
		p.load(fi);
		return p.getProperty(key);
	}
	public static void main(String[] args) throws Exception {
		System.out.println(getdata("browser"));
		System.setProperty("WebDriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(getdata("prodURL"));
		driver.manage().window().maximize();
		

	}

}
