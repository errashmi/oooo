//03-Write a program to explain how to enable or disable a test case
package com.rex.T;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

public class T3 {
  @Test
  public void Tc01() {
	  System.out.println("test -001");
  }
  @Test(enabled=false)
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
