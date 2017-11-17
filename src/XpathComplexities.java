import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.WebWindow;
import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;
import com.gargoylesoftware.htmlunit.javascript.host.Document;


public class XpathComplexities {
	WebDriver driver;
	
	@BeforeSuite
	void launchBrowser()
	{
		driver=new FirefoxDriver();
	}
	@BeforeTest
	void navigate()
	{
		driver.navigate().to("https://qa3.hobsonsemt.net/admin/Account/Login");
		driver.findElement(By.id("Username")).sendKeys("automation");
		driver.findElement(By.id("Password")).sendKeys("Password#1");
		driver.findElement(By.id("login")).click();
		
	}
	@Test
	void DOM()
	{
		
		WebElement email = (WebElement) ((JavascriptExecutor) driver).executeScript("return document.getElementById('email');");
		email.sendKeys("abcdef@gmail.com");
		
		WebElement last = (WebElement) ((JavascriptExecutor) driver).executeScript("return document.getElementsByName('name1')[0];");
		last.sendKeys("aaaaaa");
		
		WebElement pass = (WebElement) ((JavascriptExecutor) driver).executeScript("return document.forms['domf2'].elements['password'];");
		pass.sendKeys("aaaaaa");
		
	}
	
	@Test
	void FindAllElements()
	{
		List<WebElement> elements=driver.findElements(By.xpath("//*"));
		System.out.println("??????????????????????????????????????????????????????????????");
		System.out.println(elements.size());
		System.out.println("??????????????????????????????????????????????????????????????");
		for(WebElement ss:elements)
		{
			System.out.println(ss.getText());
			System.out.println();
		}
	}
	@AfterSuite
	void close()
	{
		driver.close();
	}
	

}
