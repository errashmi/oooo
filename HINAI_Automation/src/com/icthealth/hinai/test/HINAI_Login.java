package com.icthealth.hinai.test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.icthealth.hinai.pages.HINAI_Ambulatory_Care_Page;
import com.icthealth.hinai.pages.HINAI_Appcontent_Page;
import com.icthealth.hinai.pages.HINAI_Home_Page;
import com.icthealth.hinai.pages.HINAI_Login_page;
import com.icthealth.hinai.pages.HINAI_Registration_Page;



public class HINAI_Login extends TestBase {
  @Test
  public void init()throws Exception{
	  HINAI_Login_page loginpage=PageFactory.initElements(driver, HINAI_Login_page.class);
	  loginpage.set_Username("khl2529");
	  loginpage.set_Password("1234");
	  loginpage.click_Login();
	  
	  HINAI_Home_Page homepage=PageFactory.initElements(driver, HINAI_Home_Page.class);
	  Thread.sleep(6000);
	  homepage.click_Apps();
	  //homepage.log_Out();
	  Thread.sleep(4000);
	  
	  HINAI_Appcontent_Page apps=PageFactory.initElements(driver, HINAI_Appcontent_Page.class);
	  Thread.sleep(4000);
	  apps.click_Amb_Care();
	  Thread.sleep(4000);
	  
	  HINAI_Ambulatory_Care_Page Amb_Care=PageFactory.initElements(driver, HINAI_Ambulatory_Care_Page.class);
	  Thread.sleep(4000);
	  Amb_Care.click_Regd();
	  Thread.sleep(2000);
	  Amb_Care.open_regd_page();
	  Thread.sleep(4000);
	  
	  HINAI_Registration_Page regd=PageFactory.initElements(driver, HINAI_Registration_Page.class);
	  regd.fill_Pat_Details();
  }
}
