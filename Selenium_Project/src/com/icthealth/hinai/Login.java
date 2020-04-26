package com.icthealth.hinai;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

class HINAI{
	public static WebDriver driver;
	public static void open_chrome() {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.icthealth.com/brltest");
		driver.manage().window().maximize();
	}
	public static void login_hinai() {
		driver.findElement(By.id("login-username")).sendKeys("khl2529");
		driver.findElement(By.id("login-password")).sendKeys("1234");
		driver.findElement(By.xpath("//*[@class='base-button']")).click();
	}
	public static void Open_patient_registratioin() {
		driver.findElement(By.linkText("Apps")).click();
		driver.findElement(By.xpath("//*[@class='icon registration']")).click();
		driver.findElement(By.xpath("//*[@class='OutpatientIcon Registration']")).click();
		driver.findElement(By.linkText("Registration")).click();
	}
	public static void Fill_pat_details() {
		//PATIENT DETAILS
		new Select(driver.findElement(By.id("navigation:patPrefix"))).selectByValue("667725");
		driver.findElement(By.id("navigation:firstName")).sendKeys("Test");
		driver.findElement(By.id("navigation:middleName")).sendKeys("test1");
		driver.findElement(By.id("navigation:lastName")).sendKeys("test2");
		new Select(driver.findElement(By.id("navigation:genderCombo"))).selectByVisibleText("MALE");
		driver.findElement(By.id("navigation:age")).sendKeys("24");
		driver.findElement(By.id("navigation:patMobileNo")).sendKeys("1112223334");
	}
	public static void Fill_contact_details() throws InterruptedException {
		//CONTACT DETAILS
		driver.findElement(By.id("navigation:singAddrisRuralId:1")).click();
		Thread.sleep(10000);
		driver.findElement(By.id("navigation:singAddrisRuralId:1")).click();
		Thread.sleep(10000);
		
		driver.findElement(By.id("navigation:singAddrhouseAddress")).sendKeys("test12");
		driver.findElement(By.id("navigation:singAddrvillage")).sendKeys("test123");
		driver.findElement(By.id("navigation:ploiceStationId")).sendKeys("test111");
		driver.findElement(By.id("navigation:singAddrpostoffice")).sendKeys("test1111");
		//driver.findElement(By.id("navigation:singCountryCodeId")).sendKeys("INDIA");
		//driver.findElement(By.id("navigation:singStateCodeId")).sendKeys("ODISHA");
		driver.findElement(By.id("navigation:copyId")).click();
		
	}
	public static void Eme_contact_details() {
		driver.findElement(By.id("navigation:j_id1042_header")).click();
		driver.findElement(By.id("navigation:contactPersonId")).sendKeys("testtt");
		new Select(driver.findElement(By.id("navigation:patientrelation"))).selectByVisibleText("Brother");
		driver.findElement(By.id("navigation:phone1Id")).sendKeys("1112223334");
	}
	public static void Appointment_details() throws InterruptedException {
		new Select(driver.findElement(By.id("navigation:appDepartmentId"))).selectByVisibleText("EMERGENCY");
		Thread.sleep(20000);
		new Select(driver.findElement(By.id("navigation:appConsultantId"))).selectByVisibleText("Dr. Bhibhuti Bhusan Panda");
		Thread.sleep(20000);
		driver.findElement(By.id("navigation:docUploadElement2:file")).click();
		
	}
}
public class Login {

	public static void main(String[] args) throws InterruptedException {
		HINAI.open_chrome();
		HINAI.login_hinai();
		HINAI.Open_patient_registratioin();
		HINAI.Fill_pat_details();
		//HINAI.Fill_contact_details();
		HINAI.Eme_contact_details();
		HINAI.Appointment_details();

	}

}
