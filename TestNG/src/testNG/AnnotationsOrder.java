package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AnnotationsOrder {
  @Test
  public void f() {
	  System.out.println("summa");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Executing before method format");
  }
  
  @Test
  public void testmethod1() {
	  System.out.println("test method");
  }
  @AfterMethod
  public void afterMethod() {
	  System.out.println("Executing after method format");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("before class format");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("after class format");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("before test method format");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("after test method format");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Before suite format");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("after suite format");
  }

}
