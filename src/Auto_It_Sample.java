import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;

import bsh.This;




public class Auto_It_Sample {
	
	public static WebDriver driver;
	
	public static void ss()
	{
		System.out.println("Method call");
	}
	
	public static void DriverScript() throws Exception
	{
		 try{
			 
		 System.out.println("Inside the DriverScript function");
		 Reporter.log("Inside the DriverScript function");
		 WebDriver driver=new FirefoxDriver();
		 //driver.get("http://toolsqa.wpengine.com/automation-practice-form/");
		 driver.get("https://qa3.hobsonsemt.net/webfeed.aspx?qs=_d1wA0JUfHjavyPl7qWDu5O1mCoN-mRRaNz6r1hjPst03-b0Rkk7KD1iqkFptiQwV");
		 driver.manage().window().maximize();
		// String ss=driver.findElement(By.xpath(".//*[@id='feedContent']/xhtml:div[3]/xhtml:h3/xhtml:a/xhtml:span")).getText();
		 String ss=driver.findElement(By.xpath("//span[text()='Z_Delete Topic']")).getText();
		 System.out.println("textis:"+ss);
		 //driver.get("http://toolsqa.wpengine.com/automation-practice-form/");
		/* Reporter.log("Maximize the window");
		 //driver.findElement(By.name("firstname")).click();			
         driver.findElement(By.name("firstname")).sendKeys("Rakesh"); 
         Reporter.log("send the name 'Rakesh'");
		 getScreenShot(driver);
		 driver.findElement(By.name("lastname")).sendKeys("Test");
		 Reporter.log("send the name 'Test'");
		 getScreenShot(driver);
		 driver.findElement(By.id("photo")).click();
		 //getScreenShot();
		 //Perform the auto IT script to upload a file.
		 Reporter.log("start the auto IT function");
		 Runtime.getRuntime().exec("D:\\Data\\Personal\\TestProject\\AutoIt\\FileUpload.exe");
		 getScreenShot(driver);
		 close(driver);*/
		 
		 }
		 catch(Exception e) 
		 {
			 System.out.println("Inside the Exception function");
			 System.out.println("Going to take a failure screen shot");
			 getScreenShot(driver);
		 }
	}
	public static void getScreenShot(WebDriver driver) throws Exception
	{
		
		System.out.println("Inside the screen shot function");
		File screenshotfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotfile, new File("D:\\Data\\Personal\\RakeshTestingProject\\Sample_Test_Demo\\Results\\"+timestamp()+"screenshot.png"));
		
	}
	
	public static void close(WebDriver driver)
	{
		System.out.println("Inside the driver close function");
		//driver.close();
		driver.quit();
	}
	public static String timestamp() {
	    return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
	}
	public static void main(String args[]) throws Exception {
		// TODO Auto-generated method stub
       System.out.println("Start the main function");
       Auto_It_Sample.DriverScript();
       Auto_It_Sample.close(driver);
       
       
       /*DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
       System.out.println("Date Format is MM-dd-yyyy");
       //Reporter.log("Date Format is MM-dd-yyyy");
       //get current date
       Date CurrentDate = new Date();
       //Reporter.log("Getting the Current date");
       //Now format the date
       String Today= dateFormat.format(CurrentDate);
       //Reporter.log("Todays Date = "+Today+".");
       System.out.println("Todays Date = "+Today+".");*/
		 
	}

}
