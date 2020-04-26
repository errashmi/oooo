package com.rashmi.TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AnnotationDemo {
  @Test
  public void A() {
	  System.out.println("Inside Method A");
  }
  @Test
  public void B() {
	  System.out.println("Inside Method B");
  }
  @Test
  public void C() {
	  System.out.println("Inside Method c");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Inside Before Method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Inside After Method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Inside before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("Inside after class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Inside before test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("Inside after test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Inside before suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("Inside after suite");
  }

}
