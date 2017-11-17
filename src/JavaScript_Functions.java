import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class JavaScript_Functions {
	
	@Test
	public void JSF()
	{
		      WebDriver driver=new FirefoxDriver();
			  JavascriptExecutor js=(JavascriptExecutor) driver;
			  js.executeScript("window.location = 'https://qa3.hobsonsemt.net/admin/Account/Login'");	
			  driver.manage().window().maximize();
			 // js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 5000);");
			  js.executeScript("alert('Welcome to Guru99');"); //working Fine
			 // js.executeScript("arguments[0].click();", "button");
			  js.executeScript("window.scrollBy(0,600)");	
		      driver.quit();
	}
	
	
	

}
