//Write a program to explain the different annotation used in TestNG and there order of execution.
package com.rex.E;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class E1 {
  @Test
  public void test1() {
	  System.out.println("Test1");
  }
  @Test
  public void test2() {
	  System.out.println("Test2");
  }
  @Test
  public void test3() {
	  System.out.println("Test3");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("BEFORE METHOD EXECUTING");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("AFTER METHOD EXECUTING");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("BEFORE CLASS EXECUTING");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("AFTER CLASS EXECUTING");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("BEFORE TEST EXECUTING");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("AFTER TEST EXECUTING");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("BEFORE SUITE EXECUTING");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("AFTER SUITE EXECUTING");
  }

}
