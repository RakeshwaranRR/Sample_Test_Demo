package TestNG;


import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Paralleltests {
	   


	@Test
	public void B() {
		 //Printing class name and Id of the thread on using which test method got executed
		System.out.println("Test Case B in " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
	}
	
	@Test
	public void A() {
		// Printing class name and Id of the thread on using which test method got executed
		System.out.println("Test Case A in " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
	}
	
	@Test
	public void C() {
		 //Printing class name and Id of the thread on using which test method got executed
		System.out.println("Test Case C in " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
	}

}