package week4.day4;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LearnAnnotations {
			  @Test
		  public void f() {
				  System.out.println("Test F");
		  }
		  @BeforeMethod
		  public void beforeMethod() {
			  System.out.println("Before Method");
		  }

		  @AfterMethod
		  public void afterMethod() {
			  System.out.println("After Method");
		  }

		  @BeforeClass
		  public void beforeClass() {
			  System.out.println("Before Class");
		  }

		  @AfterClass
		  public void afterClass() {
			  System.out.println("After class");
		  }

		  @BeforeTest
		  public void beforeTest() {
			  System.out.println("Before Test");
		  }

		  @AfterTest
		  public void afterTest() {
			  System.out.println("After Test");
		  }

		  @BeforeSuite
		  public void beforeSuite() {
			  System.out.println("Before suite");
		  }

		  @AfterSuite
		  public void afterSuite() {
			  System.out.println("After Suite");
		  }

		  @Test
		  public void z() {
				  System.out.println("Test Z");
		  }
		  
		  @Test
		  public void a() {
				  System.out.println("Test A");
		  }

}
