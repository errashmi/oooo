package pageUI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="username")WebElement txtUserName;
	@FindBy(name="password")WebElement txtPassword;
	@FindBy(name="submit")WebElement btnSubmit;
	
	public void hmslogin() {
		txtUserName.sendKeys("admin");
		txtPassword.sendKeys("admin");
		btnSubmit.click();
	}

}
