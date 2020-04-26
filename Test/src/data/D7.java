package data;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D7 {
	public WebDriver driver;
	public String path="D:\\Selenium\\Selenium_WD\\Test\\ExcelData\\LoginCred.xlsx";
	public static void main(String[] args) throws Exception {
		D7 obj=new D7();
		obj.browserLaunch();
		obj.login();

	}
	public void login() throws Exception {
		/*FileInputStream fi=new FileInputStream(path);
		XSSFWorkbook w=new XSSFWorkbook(fi);
		XSSFSheet s=w.getSheet("sheet1");
		XSSFRow r = s.getRow(0);
		XSSFCell c=r.getCell(0);
		System.out.println(c.getStringCellValue());
		*/
		FileInputStream fi=new FileInputStream(path);
		  XSSFWorkbook w=new XSSFWorkbook(fi);
		  XSSFSheet s = w.getSheet("sheet1");
		  XSSFRow r=s.getRow(1);
		  XSSFCell c = r.getCell(1);
		  System.out.println(c.getStringCellValue());
		  w.close();
	}
	public void browserLaunch() {
		  System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get("http://seleniumbymahesh.com/HMS/");
		  driver.manage().window().maximize();  
	  }
}
