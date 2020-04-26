package com.rex.demo;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Test27 {
	public static void main(String[] args) throws Exception {
		webTableDemo2 wt=new webTableDemo2();
		wt.browserLaunch();
		wt.dynamicWebTable();
	}
}
class webTableDemo2{
	public WebDriver driver;
	public void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		driver.manage().window().maximize();
	}
	public void dynamicWebTable() throws Exception{
		WebElement data = driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th[1]"));
		System.out.println(data.getText());
		//calcluate no of rows
		WebElement col = driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
		System.out.println("No of columns are "+col.getSize());
		WebElement row = driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[1]/td[1]/a"));
		System.out.println("No of rows are"+row.getSize());
	}
}