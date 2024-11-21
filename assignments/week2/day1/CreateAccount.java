package assignments.week2.day1;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount
{

	public static void main(String[] args) 
	{
		//Initializing the Browser & get the URL
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");	
		driver.manage().window().maximize();
		
		//Using Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		//Logging in by existing credentials
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		// Creating New account by using basic locators
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("KAG");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		driver.findElement(By.id("numberEmployees")).sendKeys("10");
		driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
		driver.findElement(By.className("smallSubmit")).click();
		
		//Prints the title of the current webpage
		String title = driver.getTitle();
		System.out.println("Title of the Current WebPage is :" + title);
		driver.close();	
		
	}
}
