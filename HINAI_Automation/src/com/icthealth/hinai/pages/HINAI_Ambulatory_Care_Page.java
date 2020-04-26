package com.icthealth.hinai.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import com.icthealth.hinai.test.TestBase;

public class HINAI_Ambulatory_Care_Page extends TestBase {
	public WebDriver driver;
	public HINAI_Ambulatory_Care_Page(WebDriver driver) {
		this.driver=driver;
	}
	@FindBy(xpath="//*[@class='OutpatientIcon Registration']")WebElement Regd_icon;
	@FindBy(linkText="Registration")WebElement Registration;
	
	public void click_Regd() {
		Regd_icon.click();
	}
	public void open_regd_page() {
		Registration.click();
	}

}
