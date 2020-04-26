//11-Write a program to login to FB by passing parameter from xml file.
package com.rex.E;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class E4 extends Base{
  private String uid,pwd;
@Test
  @Parameters({"uid","pwd"})
  public void verifyLogin(String uid, String pwd) {
	  LoginPage lp=new LoginPage(driver);
	  this.uid=uid;
	  this.pwd=pwd;
	lp.login(uid,pwd);
  }
  @BeforeTest
  public void beforeTest() {
	  BrowserLaunch("chrome","http://www.seleniumbymahesh.com/HMS/");
  }


}
