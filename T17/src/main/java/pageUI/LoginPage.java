package pageUI;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.server.handler.CaptureScreenshot;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import base.BasePage;

public class LoginPage extends BasePage {
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="username")WebElement txtUserName;
	@FindBy(name="password")WebElement txtpassword;
	@FindBy(name="submit")WebElement btnsubmit;
	@FindBy(xpath="//div[@class='box']/h4")WebElement txtUserLogin;
	@FindBy(xpath="//a[@href='logout.php']")WebElement linkLogout;
	public void login() throws Exception {
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(txtUserLogin.getText(),"User Login", "You are not in the loginPage");
		capture("LoginPage");
		txtUserName.sendKeys("admin");
		txtpassword.sendKeys("admin");
		btnsubmit.click();
		assertEquals(linkLogout.getText(), "Logout"); //hard assert
		sa.assertAll();
		capture("LandingPage");
		//System.out.println(System.getProperty("user.dir")+"\\Screenshots\\test.png");
		
		
	}
	

}
