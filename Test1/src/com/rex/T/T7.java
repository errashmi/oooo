//07-write a program to execute classes in parallel.
package com.rex.T;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

public class T7 {
	@Test
	  public void Tc01() {
		  System.out.println("test -t7001");
	  }
	  @Test
	  public void Tc02() {
		  System.out.println("test -t7002");
	  }
	  @Test
	  public void Tc03() {
		  System.out.println("test -t7003");
	  }
  @BeforeTest
  public void beforeTest() {
  }

}
