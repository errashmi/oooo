package com.rex.T;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class T10LoginPage {
	public T10LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="username")WebElement txtusername;
	@FindBy(name="password")WebElement txtpassword;
	@FindBy(name="submit")WebElement btnsubmit;
	public void login() {
		txtusername.sendKeys("admin");
		txtpassword.sendKeys("admin");
		btnsubmit.click();
	}

}
