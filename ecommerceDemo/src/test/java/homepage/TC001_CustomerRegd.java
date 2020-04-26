package homepage;

import org.testng.annotations.Test;

import basepage.Basepage;
import pageUI.CustomerRegd;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;

public class TC001_CustomerRegd extends Basepage {
	
	public static final Logger log=Logger.getLogger(TC001_CustomerRegd.class.getName());
	
  @Test //(retryAnalyzer=listeners.Retry.class)
  	
   public void customerRegistration() throws Exception {
	  log.info("******TC001_CustomerRegd Started successfully*******");  //This log is for log4j
	  CustomerRegd cRegd=new CustomerRegd(driver);
	  cRegd.createAccount();
	  log.info("******TC001_CustomerRegd completed successfully*******"); //This log is for log4j
  }
  @BeforeClass
  public void beforeTest() throws Exception {
	  browserLaunch(get("browser"), get("url"));
  }
  @AfterClass
  public void endTest() {
	  driver.quit();
  }
}
