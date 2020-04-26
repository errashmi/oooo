package data;

import java.io.FileInputStream;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import jxl.Sheet;
import jxl.Workbook;

public class D5 {
	public WebDriver driver;
	public FileInputStream fi;
	public Workbook w;
	public Sheet s;
	public String path="D:\\Selenium\\ExcelFiles\\testdata.xls";
	public static void main(String[] args) throws Exception {
		D5 obj=new D5();
		obj.browserLaunch();
		obj.login();
	}
	public void login() throws Exception {
		fi=new FileInputStream(path);
		w=Workbook.getWorkbook(fi);
		s=w.getSheet("Sheet1");
		System.out.println(s.getCell(0, 1).getContents());
		System.out.println(s.getCell(1, 1).getContents());
		for(int i=0;i<s.getRows();i++) {
			driver.findElement(By.name("username")).sendKeys(s.getCell(0, i).getContents());
			driver.findElement(By.name("password")).sendKeys(s.getCell(1, i).getContents());
			Thread.sleep(3000);
			//driver.findElement(By.name("submit")).click(); 
			driver.findElement(By.name("username")).clear();
			driver.findElement(By.name("password")).clear();
		}
		
	}
	public void browserLaunch() {
		  System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get("http://seleniumbymahesh.com/HMS/");
		  driver.manage().window().maximize();  
	  }
}
