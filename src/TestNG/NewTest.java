package TestNG;

import java.util.ArrayList;

import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class NewTest {
public static ArrayList<String> Summarydetails = new ArrayList<String>();
	
	//@AfterSuite
	@Test
	public void reportGeneration() throws Exception
	{
		//ITestContext result = null;
		//String TestName=result.getName();
		System.out.println("In Report Generation Mehtod:");
		/*Summarydetails.add(TestName);
		Summarydetails.add(String.valueOf(result.getPassedTests().size()+result.getFailedTests().size()+result.getSkippedTests().size()));
		System.out.println(Summarydetails.add(TestName));
		System.out.println(Summarydetails.add(String.valueOf(result.getPassedTests().size()+result.getFailedTests().size()+result.getSkippedTests().size())));*/
		System.out.println("First assert method:Before Execution");
		Assert.assertEquals(21, 32);	
        System.out.println("First assert method:After Execution");
        Assert.assertEquals(21, 21);	
        System.out.println("Second assert method After Execution");
        
        
	}
	@Test
	public void secondTest()
	{
		SoftAssert SA=new SoftAssert();
		System.out.println("First soft assert method:Before Execution");
		Reporter.log("First soft assert method:Before Execution");
		SA.assertEquals(10, 20);
		SA.fail("Value is not equals");
		//Reporter.log(SA.assertEquals(10, 20));
		System.out.println("First soft assert method:After Execution");
		Reporter.log("First soft assert method:Before Execution");
		SA.assertEquals(10, 10);
		System.out.println("Value is equal");
		Reporter.log("Value is equal");
		SA.assertAll();
	}
}
