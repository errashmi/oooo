package com.rashmi.TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class HMS_Regd {
	WebDriver driver;
	String regd_alert;
  @Test
  public void f() {
  }
  @Test(priority=1)
  public void login() {
	  driver.findElement(By.name("username")).sendKeys("admin");
	  driver.findElement(By.name("password")).sendKeys("admin");
	  driver.findElement(By.name("submit")).click();
	  driver.findElement(By.linkText("Registration")).click();
  }
  @Test(priority=2)
  public void fill_regd_form() {
	    new Select(driver.findElement(By.name("PATIENT_CAT"))).selectByVisibleText("Self");
		new Select(driver.findElement(By.name("RELATION"))).selectByVisibleText("Brother");
		new Select(driver.findElement(By.name("TITLE"))).selectByVisibleText("Mr.");
		driver.findElement(By.name("MOTHER_NAME")).sendKeys("Rahul");
		driver.findElement(By.name("PNT_NAME")).sendKeys("RAHUL");
		new Select(driver.findElement(By.name("PAT_IDENTITY"))).selectByVisibleText("Voter ID");
		driver.findElement(By.name("MIDDLE_NAME")).sendKeys("KUMAR");
		driver.findElement(By.name("PAT_IDENTITY_PROOF")).sendKeys("111111");
		driver.findElement(By.name("LAST_NAME")).sendKeys("BARIK");
		//select calander
		driver.findElement(By.cssSelector("input[class='tcal tcalInput']")).sendKeys("15-02-1992");
		new Select(driver.findElement(By.name("NATIONALITY"))).selectByVisibleText("Indian");
		driver.findElement(By.name("AGE")).sendKeys("24");
		new Select(driver.findElement(By.name("IS_MLC"))).selectByVisibleText("No");
		new Select(driver.findElement(By.name("SEX"))).selectByVisibleText("Male");
		new Select(driver.findElement(By.name("EDUCATION"))).selectByVisibleText("B.Tech");
		new Select(driver.findElement(By.name("MTRL_STATUS"))).selectByVisibleText("Single");
		new Select(driver.findElement(By.name("OCCUPATION"))).selectByVisibleText("Self Employeed");
		new Select(driver.findElement(By.name("RELIGION"))).selectByVisibleText("Hindu");
		new Select(driver.findElement(By.name("BLOOD_GRP_CODE"))).selectByVisibleText("B+");
		new Select(driver.findElement(By.name("PLANGUAGE"))).selectByVisibleText("English");
		new Select(driver.findElement(By.name("CITIZENSHIP"))).selectByVisibleText("Indian");
		new Select(driver.findElement(By.name("SC_PROOF"))).selectByVisibleText("No");
		driver.findElement(By.name("ADDRESS1")).sendKeys("BBSR");
		driver.findElement(By.name("MOBILE_NO")).sendKeys("1112223334");
		driver.findElement(By.name("ZIP")).sendKeys("751016");
		new Select(driver.findElement(By.name("COUNTRY_CODE"))).selectByVisibleText("India");
		driver.findElement(By.name("image")).sendKeys("D:\\img.jpg");
		driver.findElement(By.name("submit")).click();
  }
  @Test(priority=3)
  public void handel_alert() {
	  Alert alrt=driver.switchTo().alert();
	  regd_alert=alrt.getText();
	  System.out.println(regd_alert);
	  alrt.accept(); //it is used to accept the alert
	  //alrt.dismiss(); it is used to cancel
  }
  @Test(priority=4)
  public void check_regd() {
	  //System.out.println(regd_alert);
	  String Regd_no=regd_alert.replaceAll("Patient Registration Successfully. MR_NO ","");
	  System.out.println(Regd_no);
	  driver.findElement(By.linkText("Search Registration")).click();
	  driver.findElement(By.name("search")).sendKeys(Regd_no);
	  driver.findElement(By.name("submit")).click();
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://www.seleniumbymahesh.com/");
	  driver.manage().window().maximize();
	  driver.findElement(By.linkText("HMS")).click();
  
  }

  @AfterTest
  public void afterTest() {
  }

}
