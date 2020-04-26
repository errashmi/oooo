package home;

import org.testng.annotations.Test;

import basepage.BasePage;
import pageUI.HomePage;
import pageUI.LoginPage;

import org.testng.annotations.BeforeTest;

public class TC001_VerifyHomePage extends BasePage {
  @Test
  public void home() throws Exception {
	  LoginPage lp=new LoginPage(driver);
	  lp.lolin();
	  Thread.sleep(5000);
	  HomePage hp=new HomePage(driver);
	  hp.logout();
  }
  @BeforeTest
  public void beforeTest() throws Exception {
	  //browserLaunch("chrome","https://ui.cogmento.com");
	  browserLaunch(getData("browser"), getData("url"));
  }


}
