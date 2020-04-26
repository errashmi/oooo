package listeners;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import basepage.Basepage;

public class Listener extends Basepage implements ITestListener
{

	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
	}

	public void onTestFailure(ITestResult arg0) {
		System.out.println(arg0.getName()+" Test failed");
		Reporter.log(arg0.getName()+" Test failed");
		try {
			capturescreenshot(arg0.getName()+"_failed_");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestStart(ITestResult arg0) {
		System.out.println(arg0.getName()+" Test started");
		Reporter.log(arg0.getName()+" Test started");
		/*Date dt=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("dd_MM-yy_hh_mm_ss");
		String date = sdf.format(dt);
		TakesScreenshot tss = (TakesScreenshot)driver;
		File src = tss.getScreenshotAs(OutputType.FILE);
		File sdc=new File(System.getProperty("user.dir")+"/Screenshots/PassedScreenshot/"+arg0.getName()+date+".png");
		try {
			FileHandler.copy(src, sdc);
		} catch (IOException e) {
			e.printStackTrace();
		}*/
		/*try {
			capturescreenshot(arg0.getName()+"_Started_");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		try {
			File ss=capturescreenshot(arg0.getName()+"Started");
			//Reporter.log("<img src='"+ss.getAbsolutePath()+"' height='100' width='100'>");
			Reporter.log("<a href='"+ss.getAbsolutePath()+"'><img src='"+ss.getAbsolutePath()+"' height='100' width='100'/></a>");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void onTestSuccess(ITestResult arg0) {
		System.out.println(arg0.getName()+" Test success");
		Reporter.log(arg0.getName()+" Test success");
		try {
			capturescreenshot(arg0.getName()+"_passed_");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
