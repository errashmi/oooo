package testCases;

import org.testng.annotations.Test;
import basePage.Base;
import pageUI.LoginPage;

import org.testng.annotations.BeforeTest;

public class Tc001 extends Base {
  @Test
  public void MaheshHMSLogin() {
	  LoginPage lp=new LoginPage(driver);
	  lp.hmslogin();
  }
  @BeforeTest
  public void beforeTest() throws Exception {
	  browserLaunch(get("browser"),get("url"));
  }


}
