import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample{
	WebDriver driver;
	//This test method declares that its data should be supplied by the Data Provider
	// "getdata" is the function name which is passing the data
       // Number of columns should match the number of input parameters
	@Test(dataProvider="getData")
	public void setData(String username, String password)
	{
		System.out.println("you have provided username as::"+username);
		System.out.println("you have provided password as::"+password);
	}
	@Test(dataProvider="getData")
	public void login1(String UserName,String Password) throws InterruptedException
	{
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.bigrock.in/login.php");
		driver.findElement(By.id("login-username")).sendKeys(UserName);
		driver.findElement(By.id("login-password")).sendKeys(Password);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
		//driver.findElement(By.id("wp-submit")).i
		org.testng.Assert.assertTrue(driver.getTitle().contains("Dashboard"),"User is not able to login-Invalid credentials");
				
	}

	@DataProvider
	public Object[][] getData()
	{
	//Rows - Number of times your test has to be repeated.
	//Columns - Number of parameters in test data.
	Object[][] data = new Object[3][2];

	// 1st row
	data[0][0] ="sampleuser1";
	data[0][1] = "abcdef";

	// 2nd row
	data[1][0] ="testuser2";
	data[1][1] = "zxcvb";
	
	/*// 3rd row
	data[2][0] ="guestuser3";
	data[2][1] = "pass123";*/

	return data;
	}
	
	
	//Rakesh
	/*@Test(dataProvider="getData")
	public void login(String UserName,String Password) throws InterruptedException
	{
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.bigrock.in/login.php");
		driver.findElement(By.id("login-username")).sendKeys(UserName);
		driver.findElement(By.id("login-password")).sendKeys(Password);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
		//driver.findElement(By.id("wp-submit")).i
		org.testng.Assert.assertTrue(driver.getTitle().contains("Dashboard"),"User is not able to login-Invalid credentials");
				
	}*/
}