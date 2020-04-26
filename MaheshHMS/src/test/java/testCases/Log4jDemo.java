package testCases;

import org.testng.annotations.Test;
import java.util.logging.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.BeforeTest;

public class Log4jDemo {
	public String path="./log4j.properties";
  @Test
  public void f() {
	  Logger log=Logger.getLogger(Log4jDemo.class.getName());
	  log.info("***This is log4j message***");
	  
  }
  @BeforeTest
  public void beforeTest() {
	  PropertyConfigurator.configure(path);
	  
	  
  }

}
