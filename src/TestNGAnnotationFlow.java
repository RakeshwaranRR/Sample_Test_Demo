import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestNGAnnotationFlow {

	  @Test
	  public void f() {
		  System.out.println("Test");
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
		  System.out.println("After Class");
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
		  System.out.println("Before Suite");
		  
	  }

	  @AfterSuite
	  public void afterSuite() {
		  System.out.println("After Suite");
	  }

	  @Test
	  public void f1() {
		  System.out.println("Test1");
	  }
	  @BeforeMethod
	  public void beforeMethod1() {
		  System.out.println("Before Method1");
	  }

	  @AfterMethod
	  public void afterMethod1() {
		  System.out.println("After Method1");
	  }

	  @BeforeClass
	  public void beforeClass1() {
		  System.out.println("Before Class1");
	  }

	  @AfterClass
	  public void afterClass1() {
		  System.out.println("After Class1");
	  }

	  @BeforeTest
	  public void beforeTest1() {
		  System.out.println("Before Test1");
	  }

	  @AfterTest
	  public void afterTest1() {
		  System.out.println("After Test1");
	  }

	  @BeforeSuite
	  public void beforeSuite1() {
		  System.out.println("Before Suite1");
		  
	  }

	  @AfterSuite
	  public void afterSuite1() {
		  System.out.println("After Suite1");
	  }


}
