package com.rex.U;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

public class Tc001 extends BasePage {
  @Test
  public void VerifyLogin() {
	  FBHomePage obj=new FBHomePage(driver);
	  obj.login();
  }
  @BeforeTest
  public void beforeTest() throws Exception {
	  browserLaunch(getData("browser"),getData("url"));
  }


}
