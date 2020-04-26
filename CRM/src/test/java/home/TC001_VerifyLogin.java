package home;

import org.testng.annotations.Test;

import base.BasePage;
import pageUI.LoginPage;

import org.testng.annotations.BeforeClass;

public class TC001_VerifyLogin extends BasePage {
  @Test//(retryAnalyzer=listeners.Retry.class)
  public void loginToCRM() throws Exception {
	  LoginPage lp=new LoginPage(driver);
	  lp.login();
	  captureScreenShot("Loginpage");
  }
  
@BeforeClass
  public void beforeClass() throws Exception {
	  launchBrowser(getData("browser"),getData("url"));
  }

}
