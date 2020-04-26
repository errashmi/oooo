package homepage;

import org.testng.annotations.Test;

import basepage.Basepage;
import pageUI.HomePage;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class TC002_PurchaseProduct extends Basepage {
	public static final Logger log=Logger.getLogger(TC002_PurchaseProduct.class.getName());
  @Test
  public void OrderItem() throws Exception {
	  log.info("******OrderItem Started successfully*******");
	  HomePage hp=new HomePage(driver);
	  hp.buyProduct();
	  log.info("******OrderItem Completed sucessfully*******");
  }
  @BeforeClass
  public void beforeTest() throws Exception {
	  browserLaunch(get("browser"),get("url"));
	  driver.manage().window().maximize();
  }
  @AfterClass
  public void endTest() {
	  driver.quit();
  }
}
