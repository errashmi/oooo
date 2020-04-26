package data;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class D1 {
	public WebDriver driver;
  @Test 
  @Parameters({"id","pw"})
  public void Login(String id,String pw) {
	  driver.findElement(By.name("username")).sendKeys(id);
	  driver.findElement(By.name("password")).sendKeys(pw);
	  driver.findElement(By.name("submit")).click(); 
  }
  @BeforeTest
  public void beforeTest() {
	  //System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe");
	  //driver=new ChromeDriver();
	  System.setProperty("webdriver.gecko.driver","./DriverFiles/geckodriver.exe");
	  driver=new FirefoxDriver();
	  driver.get("http://seleniumbymahesh.com/HMS/");
	  driver.manage().window().maximize();
	  
  }

}
