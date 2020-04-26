package data;

import java.io.FileInputStream;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import jxl.Sheet;
import jxl.Workbook;

public class D4 {
	public WebDriver driver;
	String path="D:\\Selenium\\ExcelFiles\\testdata.xls";
	FileInputStream fi;
	Workbook w;
	Sheet s;
	
	public static void main(String[] args) throws Exception {
		D4 obj=new D4();
		obj.browserLaunch();
		obj.login();
	}
	public void login() throws Exception {
		fi=new FileInputStream(path);
		w=Workbook.getWorkbook(fi);
		s=w.getSheet("Sheet1");
		System.out.println(s.getCell(0, 1).getContents());
		System.out.println(s.getCell(1, 1).getContents());
		driver.findElement(By.name("username")).sendKeys(s.getCell(0, 1).getContents());
		driver.findElement(By.name("password")).sendKeys(s.getCell(1, 1).getContents());
		driver.findElement(By.name("submit")).click(); 
	}
	public void browserLaunch() {
		  System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get("http://seleniumbymahesh.com/HMS/");
		  driver.manage().window().maximize();
		  
	  }
}
