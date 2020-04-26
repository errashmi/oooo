package pageUI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.SwitchToFrame;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basepage.Basepage;

public class HomePage extends Basepage {

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
@FindBy(xpath="//div[@class='product-container']/div[1]")WebElement imgProduct1;
@FindBy(name="Submit")WebElement btnAddToCart;
@FindBy(xpath="//span[contains(.,'Proceed to checkout')]")WebElement btnProceedToCheckOut;
@FindBy(xpath="//span[text()='Proceed to checkout']")WebElement btnProceedToCheckOut2;
@FindBy(id="email")WebElement txtLoginId;
@FindBy(id="passwd")WebElement txtPassword;
@FindBy(id="SubmitLogin")WebElement btnSubmitLogin;
@FindBy(name="processAddress")WebElement btnprocessAddress;
@FindBy(id="cgv")WebElement chkTerms;
@FindBy(name="processCarrier")WebElement btnprocessCarrier;
@FindBy(xpath="//a[@class='bankwire']")WebElement btnPaymentOption;
@FindBy(xpath="//span[text()='I confirm my order']")WebElement btnIConfirmMyOrder;

public void buyProduct() throws Exception {
	imgProduct1.click();
	driver.switchTo().frame(2);
	Thread.sleep(3000);
	btnAddToCart.click();
	driver.switchTo().parentFrame();
	Thread.sleep(2000);
	btnProceedToCheckOut.click();
	Thread.sleep(2000);
	btnProceedToCheckOut2.click();
	txtLoginId.sendKeys(get("userid"));
	txtPassword.sendKeys(get("password"));
	btnSubmitLogin.click();
	btnprocessAddress.click();
	chkTerms.click();
	btnprocessCarrier.click();
	Thread.sleep(2000);
	btnPaymentOption.click();
	btnIConfirmMyOrder.click();
	
}

}
