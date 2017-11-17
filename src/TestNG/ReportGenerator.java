package TestNG;

import java.util.ArrayList;

import org.testng.ITestContext;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class ReportGenerator {
	public static ArrayList<String> Summarydetails = new ArrayList<String>();
	
	@Test
	public void reportGeneration()
	{
		ITestContext result = null;
		String TestName=result.getName();
		Summarydetails.add(TestName);
		Summarydetails.add(String.valueOf(result.getPassedTests().size()+result.getFailedTests().size()+result.getSkippedTests().size()));
		System.out.println(Summarydetails.add(TestName));
		System.out.println(Summarydetails.add(String.valueOf(result.getPassedTests().size()+result.getFailedTests().size()+result.getSkippedTests().size())));
	}
	

}
