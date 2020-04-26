package testCases;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base.BasePage;
import pageUI.HomePage;

import org.testng.annotations.BeforeTest;

public class Tc001 extends BasePage {
  @Test
  public void verifyLogin() throws Exception {
	  SoftAssert sa=new SoftAssert();
	  String title = driver.getTitle();
	  sa.assertEquals(title, "Primus BANK");	 
	  HomePage hp=new HomePage(driver);
	  hp.login();
	  sa.assertAll();
  }
  @BeforeTest
  public void beforeTest() throws Exception {
	  //browserLaunch("chrome","http://primusbank.qedgetech.com/");
	  browserLaunch(getData("browser"),getData("url"));
  }


}
