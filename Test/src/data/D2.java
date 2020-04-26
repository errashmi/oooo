package data;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

public class D2 {
	public WebDriver driver;
  @Test (dataProvider="Authentication")
  public void Login(String id,String pw) {
	  driver.findElement(By.name("username")).sendKeys(id);
	  driver.findElement(By.name("password")).sendKeys(pw);
	  driver.findElement(By.name("submit")).click();
  }
  @DataProvider(name="Authentication")
  public Object[][] credentials(){
	return new Object[][] {{"admin","admin"}};  
  } 
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://seleniumbymahesh.com/HMS/");
	  driver.manage().window().maximize();
  }
}
