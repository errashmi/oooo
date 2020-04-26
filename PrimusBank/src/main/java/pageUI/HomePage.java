package pageUI;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import base.BasePage;
import excelAPI.Excel;

public class HomePage extends BasePage {
	public String xlpath="D:\\Selenium\\ExcelFiles\\xl1.xlsx";
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="txtuId")WebElement txtUid;
	@FindBy(name="txtPwor")WebElement txtPwd;
	@FindBy(name="logi")WebElement btnLogin;
	@FindBy(xpath="//table[@id='Table_02']/tbody/tr/td[3]/a/img")WebElement imgLogout;
	public void login() throws Exception {
		Excel ex=new Excel(xlpath);
		String result;
		for(int i=1;i<ex.getRowCount("Sheet1");i++) {
			txtUid.clear();
			txtPwd.clear();
			txtUid.sendKeys(ex.getSheetData("Sheet1", "UserId", i));
			txtPwd.sendKeys(ex.getSheetData("Sheet1", "Password",i ));		
			btnLogin.click();
			
			//assertEquals(str1, "http://primusbank.qedgetech.com/images/admin_but_03.jpg");
			//capture("Login");
			//ex.setSheetData("Sheet1", 2, 1, "PASSED");
			//ex.setSheetData("Sheet1", "Result", i, "PASSED");
			//Thread.sleep(3000);
			try {
				String str1=imgLogout.getAttribute("src");
				assertEquals(str1, "http://primusbank.qedgetech.com/images/admin_but_03.jpg");
				capture("LoginPasses");
				result="PASSED";
				imgLogout.click();
			} catch (Exception e) {
				result="FAILED";
			}
			ex.setSheetData("Sheet1", "Result", i, result);
			
		}
		
	}
	

}
