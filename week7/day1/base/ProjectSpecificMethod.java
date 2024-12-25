package assignments.week7.day1.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.cucumber.testng.AbstractTestNGCucumberTests;


public class ProjectSpecificMethod extends AbstractTestNGCucumberTests
{
	///Thread - local  driver
	private static final ThreadLocal<RemoteWebDriver> tlDriver = new ThreadLocal<RemoteWebDriver>();
	
	public static Properties pro;
	public String data;//data for excel return type
	
	
	//// Use setter & getter method 
	public void setDriver() 
	{
		tlDriver.set(new ChromeDriver());
	}
	
	public RemoteWebDriver getDriver() 
	{
		return tlDriver.get();
		
	}
	
	@BeforeMethod
	public void preCondition() throws IOException
	{
		
		//setting a path for italian lang 
		FileInputStream fis = new FileInputStream("src/main/resources/LeafTaps.It.properties");
		
		 pro = new Properties();
		 
		 //load the file to connect
		 pro.load(fis);
		
		 
		 //Initiating the set driver and get driver 
		setDriver();
		getDriver().manage().window().maximize();
		getDriver().get("http://leaftaps.com/opentaps/");
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
	}
	
	@AfterMethod
	public void postCondition()
	{
		getDriver().close();
		
	}
}
	
	
		
		
		
		

		
		
		
		
		 
	
		
		
