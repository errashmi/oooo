package com.rex.U;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FBHomePage {
	public FBHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="email")WebElement txtEmail;
	@FindBy(id="pass")WebElement txtPass;
	@FindBy(id="u_0_b")WebElement btnLogin;
	
	public void login() {
		txtEmail.sendKeys("rashmi");
		txtPass.sendKeys("rashmi");
		btnLogin.click();
	}

}
