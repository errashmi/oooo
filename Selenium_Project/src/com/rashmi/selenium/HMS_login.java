package com.rashmi.selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.ui.Select;

class HMS{
	public static WebDriver driver;
	public static void open_chrome() {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.seleniumbymahesh.com/");
		driver.manage().window().maximize();
	}
	public static void HMS_Login() {
		driver.findElement(By.linkText("HMS")).click();
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin");
		driver.findElement(By.name("submit")).click();
		
	}
	public static void HMS_Regd() {
		driver.findElement(By.linkText("Registration")).click();
		new Select(driver.findElement(By.name("PATIENT_CAT"))).selectByVisibleText("Self");
		new Select(driver.findElement(By.name("RELATION"))).selectByVisibleText("Brother");
		new Select(driver.findElement(By.name("TITLE"))).selectByVisibleText("Mr.");
		driver.findElement(By.name("MOTHER_NAME")).sendKeys("Rahul");
		driver.findElement(By.name("PNT_NAME")).sendKeys("RAHUL");
		new Select(driver.findElement(By.name("PAT_IDENTITY"))).selectByVisibleText("Voter ID");
		driver.findElement(By.name("MIDDLE_NAME")).sendKeys("KUMAR");
		driver.findElement(By.name("PAT_IDENTITY_PROOF")).sendKeys("111111");
		driver.findElement(By.name("LAST_NAME")).sendKeys("BARIK");
		//select calander
		new Select(driver.findElement(By.name("NATIONALITY"))).selectByVisibleText("Indian");
		driver.findElement(By.name("AGE")).sendKeys("24");
		new Select(driver.findElement(By.name("IS_MLC"))).selectByVisibleText("No");
		new Select(driver.findElement(By.name("SEX"))).selectByVisibleText("Male");
		new Select(driver.findElement(By.name("EDUCATION"))).selectByVisibleText("B.Tech");
		new Select(driver.findElement(By.name("MTRL_STATUS"))).selectByVisibleText("Single");
		new Select(driver.findElement(By.name("OCCUPATION"))).selectByVisibleText("Self Employeed");
		new Select(driver.findElement(By.name("RELIGION"))).selectByVisibleText("Hindu");
		new Select(driver.findElement(By.name("BLOOD_GRP_CODE"))).selectByVisibleText("B+");
		new Select(driver.findElement(By.name("PLANGUAGE"))).selectByVisibleText("English");
		new Select(driver.findElement(By.name("CITIZENSHIP"))).selectByVisibleText("Indian");
		new Select(driver.findElement(By.name("SC_PROOF"))).selectByVisibleText("No");
		driver.findElement(By.name("ADDRESS1")).sendKeys("BBSR");
		driver.findElement(By.name("MOBILE_NO")).sendKeys("1112223334");
		driver.findElement(By.name("ZIP")).sendKeys("751016");
		new Select(driver.findElement(By.name("COUNTRY_CODE"))).selectByVisibleText("India");
		//driver.findElement(By.name("submit")).click();
	}
	public static void HMS_Feedback() {
		driver.findElement(By.linkText("Feedback")).click();
		Set<String>windows=driver.getWindowHandles(); //it will return all the address of window which is presently active in the form of "SET"
		//System.out.println(windows);
		Object[]s=windows.toArray(); //it will convert SET to ARRAY  for indexing purpose,but its return type is Object[]
		driver.switchTo().window(s[1].toString()); //control will move to pup up window,but it accept parameter of string type
		driver.findElement(By.id("name")).sendKeys("Rashmi");
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		driver.close();
		driver.switchTo().window(s[0].toString());//control will back to the main window
		driver.findElement(By.name("submit")).click();
	}
	public static void HMS_Logout() {
		driver.close();
		driver.findElement(By.linkText("Logout")).click();
		
		
		
	}
}
public class HMS_login {

	
	public static void main(String[] args) {
		HMS.open_chrome();
		HMS.HMS_Login();
		HMS.HMS_Regd();
		HMS.HMS_Feedback();
		HMS.HMS_Logout();

	}

}
