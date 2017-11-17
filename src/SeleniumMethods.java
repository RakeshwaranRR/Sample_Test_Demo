import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;


public class SeleniumMethods {
	WebDriver driver;
	@BeforeMethod
	public void dd(){
	
	
	//1.To check Element Present:

		//WebElement driver;
		//WebDriver driver;
		//Webdriver driver=new FirefoxDriver();
		driver=new FirefoxDriver();
		if(driver.findElements(By.xpath("value")).size() != 0){
		System.out.println("Element is Present");
		}else{
		System.out.println("Element is Absent");
		}
		//Or
		if(driver.findElement(By.xpath("value"))!= null){
		System.out.println("Element is Present");
		}else{
		System.out.println("Element is Absent");
		}
	//2.To check Visible:
		if( driver.findElement(By.cssSelector("a > font")).isDisplayed()){
		System.out.println("Element is Visible");
		}else{
		System.out.println("Element is InVisible");
		}
	//3.To check Enable:
		if( driver.findElement(By.cssSelector("a > font")).isEnabled()){
		System.out.println("Element is Enable");
		}else{
		System.out.println("Element is Disabled");
		}
	//4.To check text present
		if(driver.getPageSource().contains("Text to check")){
		System.out.println("Text is present");
		}else{
		System.out.println("Text is absent");
		}
		
		
		}
	 void UncheckAll()
	 {
		 List<WebElement> elements=driver.findElements(By.xpath("//table[@id='tblFieldOptionsSelector']//tbody//tr//td[1]/input"));
			Iterator<WebElement> it=elements.iterator();
			while(it.hasNext())
			{
				if(it.next().isSelected())
				{
					Reporter.log("Check the webelement "+it.next());
					it.next().click();
				}
				else
				{
					Reporter.log(it.next() +"Element already unchecked");
				}
				
			}
	 }

	
	
	
	}


