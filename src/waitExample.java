import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class waitExample {
	public static void main(String args[])
	{
		WebDriver driver=new FirefoxDriver();
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		
		//Explicit wait
		WebDriverWait wait=new WebDriverWait(driver, 20);
		WebElement element;
		element=wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("id"))));
		
	}

}
