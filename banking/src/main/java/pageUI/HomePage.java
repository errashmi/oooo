package pageUI;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import api.ExcelAPI;
import base.BankBasePage;

public class HomePage extends BankBasePage {
	@FindBy(id="txtuId")WebElement txtUserName;
	@FindBy(id="txtPwor")WebElement txtPassword;
	@FindBy(id="login")WebElement btnLogin;
	@FindBy(xpath="//table[@id='Table_02']/tbody/tr/td[3]/a/img")WebElement btnLogout;
	@FindBy(xpath="//div[@class='style7']/font")WebElement txtBankerLogin;
	@FindBy(xpath="//td[@class='headings style12']/strong/font/font")WebElement txtWelcomeMsg;
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	/*public void login() throws Exception {
		String ActMsg1="Banker Login";
		String ExpMsg1=txtBankerLogin.getText();
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(ExpMsg1,ActMsg1);  //Soft assertion										
		//txtUserName.sendKeys("Admin");
		//txtPassword.sendKeys("Admin");
		ExcelAPI eapi=new ExcelAPI(excelFilePath);
		txtUserName.sendKeys(eapi.getExcelData("Sheet1", 1, 0));
		//txtPassword.sendKeys(eapi.getExcelData("Sheet1", 1, 1));
		txtPassword.sendKeys(eapi.getExcelData("Sheet1", 1, "Password"));
		btnLogin.click();
		String actMsg2=txtWelcomeMsg.getText();
		String expMsg2="Welcome to Admin";
		assertEquals(actMsg2,expMsg2,"Login Page Not Available");//hard assertion
		sa.assertAll(); //it will make the test case failed if Soft assertion failed
		captureSS("loginPage");
		eapi.setExcelData("Sheet1", 2, 2, "PASSED");
		eapi.setExcelData("Sheet1", 2, "Result", "FAILED");
		System.out.println("Total No of Columns are : "+eapi.getColCount("Sheet1"));
		System.out.println("Total No of Rows are : "+eapi.getRowCount("Sheet1"));
	}*/
	
	/*public void login() throws Exception {
		ExcelAPI eapi=new ExcelAPI(excelFilePath);
		String result="null";
		for(int i=1;i<eapi.getRowCount("Sheet1")+1;i++) {
			txtUserName.clear();
			txtPassword.clear();
			txtUserName.sendKeys(eapi.getExcelData("Sheet1", i, 0));
			txtPassword.sendKeys(eapi.getExcelData("Sheet1", i, "Password"));
			btnLogin.click();
			try {
				btnLogout.click();
					try {
						driver.switchTo().alert().accept();
					} catch (Exception e) {
						result="PASSED";
						e.printStackTrace();
					}
			} catch (Exception e) {
				result="FAILED";
				e.printStackTrace();
			}
			eapi.setExcelData("Sheet1", i, "Result", result);
		}
		
	}*/
	public void login() throws Exception {
		txtUserName.sendKeys("Admin");
		txtPassword.sendKeys("Admin");
		btnLogin.click();
	}
}
