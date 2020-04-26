//04.write a program to explain dependency in TestNG
package com.rex.T;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

public class T4 {
	 @Test(dependsOnMethods="Tc02")
	  public void Tc01() {
		  System.out.println("test -001");
	  }
	  @Test
	  public void Tc02() {
		  System.out.println("test -002");
	  }
	  @Test
	  public void Tc03() {
		  System.out.println("test -003");
	  }
  @BeforeTest
  public void beforeTest() {
  }

}
