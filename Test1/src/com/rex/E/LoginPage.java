package com.rex.E;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(name="username")WebElement txtUserName;
	@FindBy(name="password")WebElement txtPassword;
	@FindBy(name="submit")WebElement btnSubmit;
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void login(String uid,String pwd) {
		txtUserName.sendKeys(uid);
		txtPassword.sendKeys(pwd);
		btnSubmit.click();
	}

}
