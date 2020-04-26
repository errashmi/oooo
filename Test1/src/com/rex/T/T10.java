package com.rex.T;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

public class T10 extends T10Base {
  @Test
  public void VerifyLogin() {
	  T10LoginPage lp=new T10LoginPage(driver);
	  lp.login();
  }
  @BeforeTest
  public void beforeTest() {
	  BrowserLaunch("chrome","http://www.seleniumbymahesh.com/HMS/");
  }


}
