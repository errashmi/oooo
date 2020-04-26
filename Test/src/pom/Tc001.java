package pom;

import org.testng.annotations.Test;

public class Tc001 extends BasePage{
  @Test
  public void Login() {
	  browserLaunch("chrome","http://seleniumbymahesh.com/HMS/");
	  LoginPage lp=new LoginPage(driver);
	  lp.login();
  }


}
