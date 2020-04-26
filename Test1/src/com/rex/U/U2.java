package com.rex.U;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

public class U2 {
  @Test(groups="g1")
  public void t1() {
	  System.out.println("Inside Test t1");
  }
  @Test(groups="g2")
  public void t2() {
	  System.out.println("Inside Test t2");
  }
  @Test(groups="g2")
  public void t3() {
	  System.out.println("Inside Test t3");
  }
  @Test(groups="g1")
  public void t4() {
	  System.out.println("Inside Test t4");
  }
  @BeforeTest
  public void beforeTest() {
	  
  }

}
