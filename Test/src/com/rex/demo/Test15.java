package com.rex.demo;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test15 {

	public static void main(String[] args) {
		CheckBoxDemo2 cb=new CheckBoxDemo2();
		cb.browserLaunch();
		cb.checkbox();
	}

}
class CheckBoxDemo2{
	public WebDriver driver;
	public void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://echoecho.com/htmlforms09.htm");
		driver.manage().window().maximize();
	}
	public void checkbox(){
			List<WebElement> cb = driver.findElements(By.xpath("//td[@class='table5']/input[@type='checkbox']"));
			for(int i=0;i<cb.size();i++) {
				System.out.println(cb.get(i).getAttribute("value"));
				if(!cb.get(i).isSelected()) {
					cb.get(i).click();
				}
			}
		}	
	}
