package com.icthealth.hinai.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.icthealth.hinai.test.TestBase;

public class HINAI_Registration_Page extends TestBase {
	public WebDriver driver;
	public HINAI_Registration_Page(WebDriver driver) {
		this.driver=driver;
		
	}
	//patient details
	@FindBy(id="navigation:patPrefix")WebElement patPrefix;
	@FindBy(id="navigation:firstName")WebElement firstName;
	@FindBy(id="navigation:middleName")WebElement middleName;
	@FindBy(id="navigation:lastName")WebElement lastName;
	@FindBy(id="navigation:aliasName")WebElement aliasName;
	@FindBy(id="navigation:patRelation")WebElement patRelation;
	@FindBy(id="navigation:patRelPrefix")WebElement patRelPrefix;
	@FindBy(id="navigation:gFirstName")WebElement relFirstName;
	@FindBy(id="navigation:gMiddleName")WebElement relgMiddleName;
	@FindBy(id="navigation:gLastName")WebElement relLastName;
	@FindBy(id="navigation:genderCombo")WebElement genderCombo;
	@FindBy(id="navigation:PatMarritalStatus")WebElement PatMarritalStatus;
	@FindBy(id="navigation:patRegDOBInputDate")WebElement patRegDOBInputDate;
	@FindBy(id="navigation:age")WebElement age;
	@FindBy(id="navigation:ageUnit")WebElement ageUnit;
	@FindBy(id="navigation:religionCodeId")WebElement religion;
	@FindBy(id="navigation:patientOccupation")WebElement patientOccupation;
	@FindBy(id="navigation:patMobileNo")WebElement  patMobileNo;
	@FindBy(id="navigation:normalEmail")WebElement Email;
	@FindBy(id="navigation:singAutonationalityCodeId")WebElement nationality;
	@FindBy(id="navigation:preferredModesOfCommunicationId")WebElement preferredModesOfComm;
	
	//Contact details
	
	public void fill_Pat_Details() {
		new Select(patPrefix).selectByVisibleText("M/S");
		firstName.sendKeys("ashok");
		middleName.sendKeys("kumar");
		lastName.sendKeys("nayak");
		aliasName.sendKeys("alok");
		new Select(patRelation).selectByVisibleText("S/o");
		new Select(patRelPrefix).selectByValue("667725");
		relFirstName.sendKeys("niranjan");
		relgMiddleName.sendKeys("kumar");
		relLastName.sendKeys("nayak");
		new Select(genderCombo).selectByVisibleText("MALE");
		new Select(PatMarritalStatus).selectByVisibleText("UnMarried");
		age.sendKeys("30");
		
	}
	
}
