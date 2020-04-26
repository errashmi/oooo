package pageUI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BasePage;

public class LoginPage extends BasePage{
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="email")WebElement txtEmail;
	@FindBy(name="password")WebElement txtPassword;
	@FindBy(xpath="//div[text()='Logi']")WebElement btnLogin;
	
	public void login() throws Exception {
		txtEmail.clear();
		txtPassword.clear();
		txtEmail.sendKeys(getData("id"));
		txtPassword.sendKeys(getData("password"));
		btnLogin.click();
	}

}
