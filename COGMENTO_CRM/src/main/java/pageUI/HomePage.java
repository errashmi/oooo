package pageUI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//div[@class='ui basic button floating item dropdown']")WebElement btnSettings;
	@FindBy(xpath="//span[text()='Log Out']")WebElement btnLogout;
	public void logout() {
		btnSettings.click();
		btnLogout.click();
	}

}
