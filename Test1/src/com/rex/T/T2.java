//02-Write a program to explain how to prioritize the test case.
package com.rex.T;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

public class T2 {
  @Test(priority=1)
  public void Tc01() {
	  System.out.println("TEST-1");
  }
  @Test(priority=4)
  public void Tc02() {
	  System.out.println("TEST-2");
  }
  @Test(priority=3)
  public void Tc03() {
	  System.out.println("TEST-3");
  }
  @Test(priority=2)
  public void Tc04() {
	  System.out.println("TEST-4");
  }
  @BeforeTest
  public void beforeTest() {
  }

}
