package testCase;

import org.testng.annotations.Test;

import base.BasePage;
import pageUI.LoginPage;

import org.testng.annotations.BeforeTest;

public class Tc001 extends BasePage {
  @Test
  public void VerifyLogin() throws Exception {
	  LoginPage lp=new LoginPage(driver);
	  lp.login();
  }
  @BeforeTest
  public void beforeTest() throws Exception {
	 // browserLaunch("chrome","http://www.seleniumbymahesh.com/HMS");
	  browserLaunch(getData("browser"),getData("url"));
	  //System.out.println(getData("url"));
  }



}
