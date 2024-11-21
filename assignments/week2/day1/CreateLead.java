package assignments.week2.day1;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead 
{

	public static void main(String[] args) throws InterruptedException 
	{
		//Initializing the browser& get the URL
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		//Logging in by the existing credentials 
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//Creating New Lead
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("KAG");
		driver.findElement(By.name("lastName")).sendKeys("G");
		driver.findElement(By.name("companyName")).sendKeys("TestLeaf");
		driver.findElement(By.name("generalProfTitle")).sendKeys("Selenium");
		driver.findElement(By.name("submitButton")).click();
		Thread.sleep(10000);
		
		//Prints the title of the current webpage
		String title = driver.getTitle();
		System.out.println("Title of the Current WebPage is :" + title);
		driver.close();
		
	}

}
