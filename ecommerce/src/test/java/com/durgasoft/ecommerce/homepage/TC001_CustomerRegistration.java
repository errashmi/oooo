package com.durgasoft.ecommerce.homepage;

import org.testng.annotations.Test;

import com.durgasoft.ecommerce.basepage.BasePage;
import com.durgasoft.ecommerce.pageUI.CreateLoginAccount;

import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class TC001_CustomerRegistration extends BasePage {
	
  @Test
  public void customerRegistration() throws Exception {
	  final org.apache.log4j.Logger log=org.apache.log4j.Logger.getLogger(TC001_CustomerRegistration.class.getName());//variable for logger class
	  log.info("--------Starting TC001_Customer Registration");
	  CreateLoginAccount login=new CreateLoginAccount(driver); //Object is created as basepage is already entended and java doesnt support multiple inheritance
	  log.info("--------End of TC001_Customer Registration");
	  login.createAccount();
  }
 /* @BeforeTest
  public void beforeTest() throws Exception {
	  //browserLaunch("chrome","http://automationpractice.com");   browser and url is hardcoded
	  browserLaunch(getData("browser"),getData("url"));
	  
	 
  }*/
  @BeforeClass
  public void beforeTest()throws Exception{
	  browserLaunch(getData("browser"),getData("url"));
  }
  @AfterClass
  public void endTest() {
	  closeBrowser();
  }
private void closeBrowser() {
	driver.quit();
	extent.endTest(test);
	extent.flush();
	
}

}
