package com.durgasoft.ecommerce.pageUI;

import static org.testng.Assert.assertEquals;

import javax.annotation.Detainted;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.durgasoft.ecommerce.basepage.BasePage;

public class CreateLoginAccount extends BasePage {
	public CreateLoginAccount(WebDriver driver) { //constructor is required to initialize the variables else jave will throw nullpointer except
		PageFactory.initElements(driver, this);
	}
	@FindBy (linkText="Sign in")WebElement linkSignIn;
	@FindBy(id="email_create")WebElement txtEmailID;
	@FindBy(id="SubmitCreate")WebElement btnCreateAnAccount;
	@FindBy(xpath="//h1[text()=\"Create an account\"]")WebElement H1CreateAnAccount;
	@FindBy(id="id_gender1")WebElement rbtnGenderMale;
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
	
	
	public void createAccount() throws Exception {
		linkSignIn.click();
		//txtEmailID.sendKeys("qatest1029@gmail.com");  ID is hardcoded
		txtEmailID.sendKeys(getData("firstname")+getData("lastname")+randomNumber()+getData("domainName")); //it will get data from config file
		btnCreateAnAccount.click();
		Thread.sleep(4000);
		assertEquals(H1CreateAnAccount.getText(), "CREATE AN ACCOUNT");//iT WILL COMPARE ANE CONFIRM THE CTRATE ACCOUNT PAGE
		rbtnGenderMale.click();
		txtFirstName.sendKeys("Rashmi");
		txtLastName.sendKeys("Sahoo");
		txtPassword.sendKeys("111111");
		//new Select(ddDays).selectByIndex(2);   
		//new Select(ddMonths).selectByIndex(2);
		//new Select(ddYears).selectByIndex(4);  Creating multiple objects of select class consumes more memory,
		selectOptions(ddDays,2);     //we have passed webelement name and index value for selecting
		
		selectOptions(ddMonths, 2);
		selectOptions(ddYears, 2);
		txtAddress1.sendKeys("BBSR");
		txtAddress2.sendKeys("C.S PUR");
		txtCity.sendKeys("bbsr");
		selectOptions(ddState, 2);
		txtZipCode.sendKeys("12345");
		selectOptions(ddCountry, 1);
		txtPhoneNo.sendKeys("0123456789");
		txtMobNo.sendKeys("1234567890");
		txtAliasaddress.sendKeys("ODISHA");
		btnRegister.click();
		assertEquals(h1MyAccount.getText(),"MY ACCOUNT");//Assert will check whether myaccount is created or not by comparing h1
	
	}

	
	
}
