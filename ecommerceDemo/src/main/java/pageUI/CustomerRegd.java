package pageUI;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import basepage.Basepage;

public class CustomerRegd extends Basepage {
	@FindBy(linkText="Sign in")WebElement linkSignIn;
	@FindBy(xpath="//h3[text()='Create an account']")WebElement headCreateAnAcc;
	@FindBy(id="email_create")WebElement txtEmail;
	@FindBy(id="SubmitCreate")WebElement btnCreateAnAcc;
	@FindBy(xpath="//h3[text()='Your personal information']")WebElement headPersonalInfoPage;
	@FindBy(id="id_gender1")WebElement rbtnGender;
	@FindBy(id="customer_firstname")WebElement txtFirstName;
	@FindBy(id="customer_lastname")WebElement txtLastName;
	@FindBy(id="passwd")WebElement txtPassword;
	@FindBy(id="days")WebElement ddDays;
	@FindBy(id="months")WebElement ddMonths;
	@FindBy(id="years")WebElement ddYears;
	@FindBy(id="address1")WebElement txtAddress1;
	@FindBy(id="address2")WebElement txtAddress2;
	@FindBy(id="city")WebElement txtCity;
	@FindBy(id="id_state")WebElement ddState;
	@FindBy(id="postcode")WebElement txtZipCode;
	@FindBy(id="id_country")WebElement ddCountry;
	@FindBy(id="phone")WebElement txtPhoneNo;
	@FindBy(id="phone_mobile")WebElement txtMobNo;
	@FindBy(id="alias")WebElement txtAliasaddress;
	@FindBy(id="submitAccount")WebElement btnRegister;
	@FindBy(xpath="//h1[text()='My account']") WebElement h1MyAccount;
	
	public CustomerRegd(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void createAccount() throws Exception {
		SoftAssert sa=new SoftAssert();
		linkSignIn.click();
		//txtEmail.sendKeys("qatest5646@gmail.com");
		assertEquals(headCreateAnAcc.getText(), "CREATE AN ACCOUNT");//HARD ASSERT
		txtEmail.sendKeys(get("firstname")+get("lastname")+getrandom()+get("domainname"));
		btnCreateAnAcc.click();
		Thread.sleep(4000);
		sa.assertEquals(headPersonalInfoPage.getText(), "YOUR PERSONAL INFORMATION", "Personal info");//soft assertion
		rbtnGender.click();
		txtFirstName.sendKeys("aaaaaa");
		txtLastName.sendKeys("ccccc");
		txtPassword.sendKeys("12345");
		selectoption(ddMonths,2);
		selectoption(ddDays, 2);
		selectoption(ddYears, 2);
		txtAddress1.sendKeys("BBSR");
		txtAddress2.sendKeys("C.S PUR");
		txtCity.sendKeys("bbsr");
		selectoption(ddState, 2);
		txtZipCode.sendKeys("12345");
		selectoption(ddCountry, 1);
		txtPhoneNo.sendKeys("0123456789");
		txtMobNo.sendKeys("1234567890");
		txtAliasaddress.sendKeys("ODISHA");
		btnRegister.click();
		capturescreenshot("Login_Success");
		sa.assertEquals(h1MyAccount.getText(),"MY ACCOUNT","My account");
		sa.assertAll();
	}
	
	
	

}
