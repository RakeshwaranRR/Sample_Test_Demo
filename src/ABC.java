import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class ABC {
	
	
	
	
	@BeforeGroups
	 public void f1() {
		 System.out.println("BeforeGroups");
		 
	 }
	 @AfterGroups
	 public void f2() {
		 System.out.println("AfterGroups");
	 }
	  @Test
	  public void f3() {
		  System.out.println("Test");
	  }
	  @BeforeMethod
	  public void beforeMethod() {
		  System.out.println("BeforeMethod");
	  }

	  @AfterMethod
	  public void afterMethod() {
		  System.out.println("AfterMethod");
	  }

	  @BeforeClass
	  public void beforeClass() {
		  System.out.println("BeforeClass");
	  }

	  @AfterClass
	  public void afterClass() {
		  System.out.println("AfterClass");
	  }

	  @BeforeTest
	  public void beforeTest() {
		  System.out.println("BeforeTest");
	  }

	  @AfterTest
	  public void afterTest() {
		  System.out.println("AfterTest");
	  }

	  @BeforeSuite
	  public void beforeSuite() {
		  System.out.println("BeforeSuite");
	  }

	  @AfterSuite
	  public void afterSuite() {
		  System.out.println("AfterSuite");
	  }

}
	
