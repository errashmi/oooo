//08-write a program to execute test cases in parallel
package com.rex.T;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

public class T8 {
	@Test
	  public void Tc01() {
		  System.out.println("test -t8001");
	  }
	  @Test
	  public void Tc02() {
		  System.out.println("test -t8002");
	  }
	  @Test
	  public void Tc03() {
		  System.out.println("test -t8003");
	  }
  @BeforeTest
  public void beforeTest() {
  }

}
