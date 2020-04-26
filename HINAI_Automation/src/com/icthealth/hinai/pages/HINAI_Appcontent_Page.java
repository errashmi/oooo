package com.icthealth.hinai.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.icthealth.hinai.test.TestBase;

public class HINAI_Appcontent_Page extends TestBase {
	public WebDriver driver;
	public HINAI_Appcontent_Page(WebDriver driver) {
		this.driver=driver;
	}
	@FindBy(xpath="//*[@class='icon registration']")WebElement link_Ambulatory_Care;
	
	
	public void click_Amb_Care() {
		link_Ambulatory_Care.click();
	}
	

}
