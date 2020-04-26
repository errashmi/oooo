package data;

import org.testng.annotations.Test;
import jxl.Sheet;
import jxl.Workbook;
import java.io.FileInputStream;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class D3 {
	String path="D:\\Selenium\\ExcelFiles\\testdata.xls";
	public WebDriver driver;
	public FileInputStream fi;
	public Workbook w;
	public Sheet s;
  @Test
  public void login() throws Exception {
	 fi=new FileInputStream(path);
	 w=Workbook.getWorkbook(fi);
	 s=w.getSheet("Sheet1");
	 System.out.println(s.getCell(0, 1).getContents());
	 System.out.println(s.getCell(1, 1).getContents());
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
