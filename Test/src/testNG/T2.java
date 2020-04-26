package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

public class T2 {
  @Test(priority=2)
  public void test1() {
	  System.out.println("TEST-1");
  }
  @Test(priority=3)
  public void test2() {
	  System.out.println("TEST-2");
  }
  @Test(priority=1)
  public void test3() {
	  System.out.println("TEST-3");
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("BEFORE TEST");
  }

}
