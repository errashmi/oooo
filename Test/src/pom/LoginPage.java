package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="username")WebElement txtUname;
	@FindBy(name="password")WebElement txtPass;
	@FindBy(name="submit")WebElement btnSubmit;
	
	public void login() {
		txtUname.sendKeys("admin");
		txtPass.sendKeys("admin");
		btnSubmit.click();	
	}

}
