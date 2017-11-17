import java.util.Date;
import javafx.application.*;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

class A{
	 static void main(String args[]){
	
		 System.out.println("Main method -2");
	}
	

}


public class SeleniumReusable extends A{
	

	
	public static void main(String args[])
	{
		//Webdriver driver=new FirefoxDriver();
		/*WebDriver driver=new FirefoxDriver();
		driver.get("https://qa3.hobsonsemt.net/admin/Account/Login");
		driver.manage().window().maximize();
		driver.findElement(By.id("Username")).sendKeys("automation");
		String value=driver.findElement(By.id("Username")).getAttribute("value");
		System.out.println("the value is:" +value);
		System.out.println(new Date());
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
		System.out.println(new Date());*/
		//driver.quit();
		//driver.close();
		
		System.out.println("Main method -1");
		//driver.quit();
		//return null;
		
		
		
	}
	

}
