package com.rex.demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Test9 {
	public static void main(String[] args) throws Exception {
		locatorDemo4 lc=new locatorDemo4();
		lc.browserLaunch();
		lc.xpathLocatorDemo();
	}
}
class locatorDemo4{
	public WebDriver driver;
	public void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}
	public void xpathLocatorDemo() throws Exception {
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("rashmi");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("ranjan");
		driver.findElement(By.xpath("//input[@class='inputtext login_form_input_box'][@type='email']")).clear();  //xpath with multiple attribute
		driver.findElement(By.xpath("(//input[@class='inputtext login_form_input_box'])[2]")).clear();	//xpath with index
		driver.findElement(By.xpath("//table[@role='presentation']/tbody/tr[3]/td[2]/div")).click();   //Xpath using parent child relationship
		driver.findElement(By.xpath("(//input[@class='inputtext login_form_input_box'])[last()]")).sendKeys("password");//using last() function
		driver.findElement(By.xpath("(//input[@class='inputtext login_form_input_box'])[last()-1]")).sendKeys("userid");
		driver.findElement(By.xpath("(//input[@class='inputtext login_form_input_box'])[position()=1]")).clear();//using position () function
		driver.findElement(By.xpath("(//input[@class='inputtext login_form_input_box'])[position()=2]")).clear();
		driver.navigate().to("https://www.amazon.in");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[text()='Amazon Pay']")).click();  //using text() function
		driver.findElement(By.xpath("//a[starts-with(text(),'Best ')]")).click();	//using starts-with() function
		driver.findElement(By.xpath("//a[contains(text(),'New')]")).click();	//using contains() function
	}
}