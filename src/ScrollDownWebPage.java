import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.gargoylesoftware.htmlunit.javascript.host.Window;


public class ScrollDownWebPage {
	public WebDriver driver;
	
	@Test
	public void openURL()
	{
		driver=new FirefoxDriver();
		//WebDriver driver=new FirefoxDriver();
	    driver.navigate().to("https://www.google.com/webhp?sourceid=chrome-instant&ion=1&espv=2&ie=UTF-8#q=how%20to%20scroll%20down%20the%20web%20page%20in%20selenium");
	    driver.manage().window().maximize();
	}
	
	
	
	public void usingscrollIntoView()
	{
		
		
		WebElement element = driver.findElement(By.linkText("Scroll Web page using Selenium WebDriver in Java - ToolsQA"));
	    JavascriptExecutor jse = (JavascriptExecutor) driver;
	    jse.executeScript("arguments[0].scrollIntoView(true);", element);

	    //Comment:use arguments[0].scrollIntoView(true); its scroll down the below part of the element //arguments[0].scrollIntoView(false); its scroll down the above part of the element
	}
	
	public void UsingActionsClass()
	{
		
		
		WebElement element = driver.findElement(By.linkText("Scroll Web page using Selenium WebDriver in Java - ToolsQA"));
		Actions actions = new Actions(driver);
		actions.moveToElement(element);
		// actions.click();
		actions.perform();
		}
	
	public void UsingXAndYAxis()
	{
		WebElement element = driver.findElement(By.linkText("Scroll Web page using Selenium WebDriver in Java - ToolsQA"));
		//Used points class to get x and y coordinates of element.
        Point point = element.getLocation();
        int xcord = point.getX();
        int ycord = point.getY();
        System.out.println(xcord + ", " + ycord);
		JavascriptExecutor js = (JavascriptExecutor) driver;
        //js.executeScript("javascript:window.scrollBy(xcord,ycord)");
        js.executeScript("scroll("+xcord+","+ycord+");");
        
      
        
        
        
        //For Scroll down:

        	WebDriver driver = new FirefoxDriver();
        	JavascriptExecutor jse = (JavascriptExecutor)driver;
        	jse.executeScript("window.scrollBy(0,250)", "");
        	//OR, you can do as follows:

        	jse.executeScript("scroll(0, 250);");
        	//For Scroll up:

        	jse.executeScript("window.scrollBy(0,-250)", "");
        	//OR,
        	jse.executeScript("scroll(0, -250);");
		}
	public void Close()
	{
		driver.close();
	}

	public static void main(String[] args) 
	{
		ScrollDownWebPage object=new ScrollDownWebPage();
		//object.openURL();
		//object.usingscrollIntoView();
		//object.UsingActionsClass();
		//object.UsingXAndYAxis();
		//object.Close();
		
		
	   
	}

}
