package assignments.week5.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class ProjectSpecificMethod 
{
	public ChromeDriver driver; 	
	@Parameters({"url","userName","passWord","browser"})
	
	@BeforeMethod
	//Replace hardcoded values with the parameterized values.
	public void preCondition(String url, String username,String pass,String browser) throws InterruptedException
	{
	//Disable the Notifications	
	ChromeOptions cp = new ChromeOptions();
	cp.addArguments("--disable-notifications");
	driver = new ChromeDriver(cp);
	//maximizing the window
	driver.manage().window().maximize();
	//using Implicit wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	//load the url
	driver.get(url);
	//enter the username
	driver.findElement(By.id("username")).sendKeys(username);
	//enter the password
	driver.findElement(By.id("password")).sendKeys(pass);
	//click the login button
	driver.findElement(By.id("Login")).click();
	Thread.sleep(30);
	//click the toggle button
	driver.findElement(By.xpath("//div[@class = 'slds-icon-waffle']")).click();
	//Click View All  
	driver.findElement(By.xpath("//button[text()='View All']")).click();
	//click Legal Entities from App Launcher
	WebElement js =driver.findElement(By.xpath("//p[text()='Legal Entities']"));
	Actions object = new Actions(driver);
	object.scrollToElement(js).perform();
	Thread.sleep(5000);
	driver.executeScript("arguments[0].click();", js);
	//Click on New Legal Entity
	driver.findElement(By.xpath("//div[@title='New']")).click();
	
	}
	
	
	
	@AfterMethod
	public void postCondition()
	{
		driver.close();
		
		
	}
	
	
	
	
}
