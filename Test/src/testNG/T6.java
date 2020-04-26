package testNG;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class T6 {
	@Test(groups="g1")
	  public void test1() {
		  System.out.println("TEST-1");
	  }
	  @Test(groups="g2")
	  public void test2() {
		  System.out.println("TEST-2");
	  }
	  @Test(groups="g1")
	  public void test3() {
		  System.out.println("TEST-3");
	  }
	  @Test(groups="g2")
	  public void test4() {
		  System.out.println("TEST-4");
	  }
	  @Test(groups="g2")
	  public void test5() {
		  System.out.println("TEST-5");
	  }
	  @BeforeTest
	  public void beforeTest() {
		  System.out.println("BEFORE TEST");
	  }
}
