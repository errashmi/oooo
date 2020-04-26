package testCases;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class getExcelData {
	String path="D:\\Selenium\\Selenium_WD\\MaheshHMS\\TestData\\LoginCred.xlsx";
	public WebDriver driver;
	public String log4jconfigFilePath="./log4j.properties";
	public static final Logger log=Logger.getLogger(getExcelData.class.getName());
  @Test
  public void getDataFromXLSX() throws Exception {
	  FileInputStream fi=new FileInputStream(path);
	  XSSFWorkbook w=new XSSFWorkbook(fi);
	  XSSFSheet s = w.getSheet("sheet1");
	  XSSFRow r=s.getRow(1);
	  XSSFCell c = r.getCell(1);
	  System.out.println(c.getStringCellValue());
	  log.info("***Browser Launched successfully***");
	  driver.findElement(By.name("username")).sendKeys(r.getCell(0).getStringCellValue());
	  driver.findElement(By.name("password")).sendKeys(r.getCell(1).getStringCellValue());
	  driver.findElement(By.name("submit")).click();
	  log.info("***Login done successfully***");
	  w.close();
	  driver.findElement(By.linkText("Logout")).click();
	  log.info("***Logout Done Successfully***");
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://www.seleniumbymahesh.com/HMS");
	  driver.manage().window().maximize();
	  PropertyConfigurator.configure(log4jconfigFilePath);
  }

}
