package pageUI;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basepage.BasePage;

public class LoginPage extends BasePage {
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="email")WebElement txtemail;
	@FindBy(name="password")WebElement txtpassword;
	@FindBy(xpath="//div[text()='Login']")WebElement btnLogin;
	
	public void lolin() throws Exception {
		txtemail.sendKeys(getData("email"));
		txtpassword.sendKeys(getData("password"));
		btnLogin.click();
		captureScreenshot();
	}

	

}
