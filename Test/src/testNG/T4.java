package testNG;

import org.testng.annotations.Test;

public class T4 {
  @Test (dependsOnMethods="test2")
  public void test1() {
	  System.out.println("TEST1");
  }
  @Test
  public void test2() {
	  System.out.println("TEST2");
  }
  @Test (dependsOnMethods="test4",alwaysRun=true) //this will be executed irrespective of pass or fail of dependent method
  public void test3() {
	  System.out.println("TEST3");
  }
  @Test
  public void test4() {
	  System.out.println("TEST4");
  }
}
