package companies;

import org.testng.annotations.Test;

import base.BasePage;
import pageUI.LoginPage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeTest;

public class NewTest extends BasePage {
	//public static WebDriver driver;
  @Test
  public void demo() throws Exception {
	  LoginPage lp=new LoginPage(driver);
	  lp.login();
	  Thread.sleep(4000);
		//@FindBy(xpath="//div[@id='main-nav']/a[4]")WebElement btnCompanies;
		//@FindBy(xpath="//button[text()='New']")WebElement btnNew;
	  driver.findElement(By.xpath("//div[@id='main-nav']/a[4]")).click();
	  driver.findElement(By.xpath("//button[text()='New']")).click();
	  //@FindBy(name="name")WebElement txtName;
	  driver.findElement(By.name("name")).sendKeys("xxxxxx");
	  driver.findElement(By.xpath("//div[@name='country']/input")).sendKeys("ind");
	  WebElement optionContainer = driver.findElement(By.xpath("//div[@name='country']/div[2]")); 
	  List<WebElement> opt = optionContainer.findElements(By.xpath("//div[@name='country']/div[2]/div"));
	  for(int i=0;i<opt.size();i++) {
		  System.out.println(opt.get(i).getText());
		  if(opt.get(i).getText().equalsIgnoreCase("India"))
			  opt.get(i).click();
	  }
  }
  @BeforeTest
  
  public void beforeTest() throws Exception {
	  launchBrowser(getData("browser"), getData("url"));
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

}
