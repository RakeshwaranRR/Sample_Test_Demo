package WiniumDemo;

import java.awt.Desktop;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Demo {
	
	WebDriver driver=null;
	@BeforeClass
	public void setUpEnvironment()
	{
		DesktopOptions options=new DesktopOptions();
		options.setApplicationPath("C:\\Windows\\System32\\notepad.exe");
		//C:\Program Files (x86)\VideoLAN\VLC\vlc.exe
		//options.setApplicationPath("C:\\Program Files (x86)\\VideoLAN\\VLC\\vlc.exe");
		try {
			driver=new WiniumDriver(new URL("http://localhost:9999"),options);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void test()
	{
		driver.findElement(By.className("Edit")).sendKeys("This is Testing");
	}
	
	@AfterClass
	public void close()
	{
		driver.close();
	}

}
