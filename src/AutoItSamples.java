import java.util.Calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;


public class AutoItSamples {
	public static void main(String args[]) throws Exception {
		// TODO Auto-generated method stub
       System.out.println("Start the main function");
      FirefoxDriver driver=new FirefoxDriver();
       
       
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
		 
	
	 driver.get("http://toolsqa.wpengine.com/automation-practice-form/");
	 Reporter.log("Maximize the window");
	 //driver.findElement(By.name("firstname")).click();			
     driver.findElement(By.name("firstname")).sendKeys("Rakesh"); 
     Reporter.log("send the name 'Rakesh'");
	 
	 driver.findElement(By.name("lastname")).sendKeys("Test");
	 Reporter.log("send the name 'Test'");

	 driver.findElement(By.id("photo")).click();
	 //getScreenShot();
	 //Perform the auto IT script to upload a file.
	 Reporter.log("start the auto IT function");
	 Runtime.getRuntime().exec("D:\\Data\\Personal\\TestProject\\AutoIt\\FileUpload.exe");
	 
	 Calendar.getInstance().get(Calendar.YEAR);
	 Calendar.getInstance().get(Calendar.MONTH);
	 Calendar.getInstance().get(Calendar.DATE);
	 
	

}
}
