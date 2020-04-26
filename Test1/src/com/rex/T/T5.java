package com.rex.T;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

public class T5 {
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
}
