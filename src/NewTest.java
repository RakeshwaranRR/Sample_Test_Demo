import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

public class NewTest {
  public WebDriver driver;
  public String test="";
  
  @BeforeMethod
  public void beforeTest() 
  {
	  Reporter.log("Open browser");
	  driver=new FirefoxDriver();
	  Reporter.log("Get the URL");
	  driver.get("http://toolsqa.wpengine.com/automation-practice-form/");	
	  Reporter.log("Maximize the browser window");
	  driver.manage().window().maximize();
	  /*Auto_It_Sample.DriverScript();
      Auto_It_Sample.close(driver);*/
	  }

  @Test
  
  public void firstcase()
  { try{
	  Reporter.log("Inside firstcase");
	  System.out.println("This is first case");
	  Reporter.log("Enter the first name as 'Rakesh'");
	  driver.findElement(By.name("firstname47")).sendKeys("Rakesh"); 
  }
  catch(Exception e)
  {
	  System.out.println("The exeception is: "+ e);
	  Assert.fail();
  }
	  //driver.close();
	  //Auto_It_Sample.DriverScript();
  }
 
  
  @Test
  public void secondcase()
  {
	  Reporter.log("Inside secondcase");
	  System.out.println("This is second case");
	  Reporter.log("Enter the last name as 'Test'");
	  driver.findElement(By.name("lastname")).sendKeys("Test");
	  
	  
  }
  //Generete alert window
  @Test
  public void alertWindowGenerete()
  {
	  JavascriptExecutor js=(JavascriptExecutor) driver;
	  js.executeScript("alert('Welcome to Guru99');");
	  js.executeScript("arguments[0].click();", "button");
	  js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 5000);");	
	  js.executeScript("window.location = 'http://demo.guru99.com/'");	
  }
  /*@Test
  public void readtable()
  {
  	int row=driver.findElements(By.xpath("PATH")).size();
  	int column=driver.findElements(By.xpath("//[@id='post-body-6522850981930750493']/div[1]/table/tbody//td")).size();
  	for(int i=0;i<row;i++)
  	{
  		for(int j=0;j<column;j++)
  		{
  			
  			
  			String sh = driver.findElement(By.xpath("//[@id='post-body-6522850981930750493']/div[1]/table/tbody//tr["+i+"]//td["+j+"]")).getText();
  			System.out.println("row number:"+i+"column number:"+j+""+sh);
  		}
  	}
  	
  }*/
  
  @AfterMethod
  public void afterTest() {
	  System.out.println("Inside after method");
	  Reporter.log("Close the browser");
	  driver.quit();
	  Reporter.log("End:::::::::::::::::::::::::::::");
	  
  }
}
  
 