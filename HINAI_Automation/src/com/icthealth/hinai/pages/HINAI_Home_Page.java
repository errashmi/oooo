package com.icthealth.hinai.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.icthealth.hinai.test.TestBase;

public class HINAI_Home_Page extends TestBase {
	public WebDriver driver;
	public HINAI_Home_Page(WebDriver driver) {
		this.driver=driver;
	}
	@FindBy(how=How.LINK_TEXT,using="Apps")WebElement link_Apps;
	@FindBy(how=How.LINK_TEXT,using="Logout")WebElement btn_Logout;
	public void click_Apps() {
		link_Apps.click();
	}
	public void log_Out() {
		btn_Logout.click();
}

}
