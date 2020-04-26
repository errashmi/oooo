package pageUI;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import base.BasePage;

public class CompaniesPage extends BasePage {
	public static final Logger log=Logger.getLogger(CompaniesPage.class.getName());
	public CompaniesPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	SoftAssert sa=new SoftAssert();
	@FindBy(xpath="//div[text()='Companies']")WebElement headerCompanies;
	@FindBy(xpath="//div[@id='main-nav']/a[4]")WebElement btnCompanies;
	@FindBy(xpath="//button[text()='New']")WebElement btnNew;
	@FindBy(xpath="//div[text()='Create new Company']")WebElement headerCreateNewCompany;
	@FindBy(name="name")WebElement txtName;
	@FindBy(name="url")WebElement txtWebsite;
	@FindBy(name="address")WebElement txtStreetAddress;
	@FindBy(name="city")WebElement txtCity;
	@FindBy(name="state")WebElement txtState;
	@FindBy(name="zip")WebElement txtZip;
	@FindBy(xpath="//div[@name='country']/input")WebElement ddCountry;
	@FindBy(xpath="//div[@name='country']/div[2]/div")WebElement optionsContainer;
	@FindBy(xpath="//div[@name='country']/div[2]")WebElement optionContainer;
	@FindBy(xpath="//button[text()='Save']")WebElement btnSave;
	  
	
	public void addNewCompanies() throws Exception {
		
		btnCompanies.click();
		assertEquals(headerCompanies.getText(), "Companies");
		btnNew.click();
		Thread.sleep(3000);
		sa.assertEquals("Create new Company",headerCreateNewCompany.getText());
		log.info("Create new company page opened");
		txtName.sendKeys("DurgaSoft");
		txtWebsite.sendKeys("http://www.durgasoft.com/");
		txtStreetAddress.sendKeys("Maitrivanam");
		txtCity.sendKeys("Hydrabad");
		txtState.sendKeys("HYD");
		txtZip.sendKeys("123123");
		ddCountry.click();
		ddCountry.sendKeys("ind");
		List<WebElement> opt = optionContainer.findElements(By.xpath("//div[@name='country']/div[2]/div"));
		  for(int i=0;i<opt.size();i++) {
			  System.out.println(opt.get(i).getText());
			  if(opt.get(i).getText().equalsIgnoreCase("India"))
				  opt.get(i).click();
		  }
		btnSave.click();
		sa.assertAll();
	}

}
