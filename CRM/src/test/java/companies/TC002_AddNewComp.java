package companies;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.BasePage;
import pageUI.CompaniesPage;
import pageUI.LoginPage;

public class TC002_AddNewComp extends BasePage {
  @Test
  public void addCompany() throws Exception {
		LoginPage lp=new LoginPage(driver);
		lp.login();
		Thread.sleep(4000);
		CompaniesPage cp=new CompaniesPage(driver);
		cp.addNewCompanies();
	}
  @BeforeClass
  public void beforeClass() throws Exception {
	  launchBrowser(getData("browser"),getData("url"));
  }
}
