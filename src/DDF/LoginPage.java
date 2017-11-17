package DDF;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginPage 
{
	WebDriver driver;
	public static ArrayList<String> Summarydetails = new ArrayList<String>();
 
	@Test(dataProvider="wordpressData")
	public void login(String UserName,String Password) throws InterruptedException
	{
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://demosite.center/wordpress/wp-login.php");
		driver.findElement(By.id("user_login")).sendKeys(UserName);
		driver.findElement(By.id("user_pass")).sendKeys(Password);
		driver.findElement(By.id("wp-submit")).click();
		Thread.sleep(5000);
		//driver.findElement(By.id("wp-submit")).i
		org.testng.Assert.assertTrue(driver.getTitle().contains("Dashboard"),"User is not able to login-Invalid credentials");
				
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}
	
	@DataProvider(name="wordpressData")
	public Object[][] passData()
	{
		Object[][] data=new Object[3][2];
		data[0][0]="admin1";
		data[0][1]="demo1";
		
		data[1][0]="admin";
		data[1][1]="demo123";
		
		data[2][0]="admin2";
		data[2][1]="demo1234";
		return data;
		
	}
	
	@AfterMethod
	@DataProvider
	public void tearDown1()
	{
		driver.findElement(By.id("user_pass")).sendKeys(passData().toString());
	}
	
	@AfterSuite
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
