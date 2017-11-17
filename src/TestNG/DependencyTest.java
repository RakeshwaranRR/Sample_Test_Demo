package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class DependencyTest {
	   
	@Test (priority = 1)
	public void Testcase() {
		
		System.out.println("Test Case  in " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
		//Assert.fail();
	}
	

	@Test (priority = 2 )
	public void testCaseOne() {
		//Printing class name and Id of the thread on using which test method got executed
		System.out.println("Test Case One in " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
		//Assert.fail();
		
	}

	@Test (priority = 3, dependsOnMethods= {"testCaseOne","Testcase"})
	public void testCaseTwo() {
		//Printing class name and Id of the thread on using which test method got executed
		System.out.println("Test Case Two in " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
	}

}