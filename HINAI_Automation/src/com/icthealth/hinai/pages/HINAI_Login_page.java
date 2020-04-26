package com.icthealth.hinai.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HINAI_Login_page {
	WebDriver driver;
	
	public HINAI_Login_page(WebDriver driver) {
		this.driver=driver;
	}
	@FindBy(how=How.ID,using="login-username")WebElement username;
	@FindBy(how=How.ID,using="login-password")WebElement password;
	@FindBy(how=How.XPATH,using="//button[@class='base-button']")WebElement btn_login;
	
	public void set_Username(String uname) {
		username.sendKeys(uname);
		
	}
	public void set_Password(String pass) {
		password.sendKeys(pass);
	}
	public void click_Login() {
		btn_login.click();
	}

}
