package assignments.week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead
{

	public static void main(String[] args) throws InterruptedException 
	{
		//Initializing the Browser and getting Test leaf page
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Creating new lead using the existing login credentials
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		
		//Finding the Xpath  to the necessary fields
		driver.findElement(By.xpath("//input[@id ='createLeadForm_companyName']")).sendKeys("TestLeaf");
		driver.findElement(By.xpath("//input[@id = 'createLeadForm_firstName']")).sendKeys("Priya");
		driver.findElement(By.xpath("//input[contains(@id ,'lastName')]")).sendKeys("G");
		driver.findElement(By.xpath("//input[contains(@id ,'firstNameLocal')]")).sendKeys("Priya");
		driver.findElement(By.xpath("//input[contains(@name ,'departmentName')]")).sendKeys("CSE");
		driver.findElement(By.xpath("(//textarea[@class ='inputBox'])[1]")).sendKeys("Automation Tester");
		driver.findElement(By.xpath("(//input[@class ='inputBox'])[20]")).sendKeys("shazainbadma18@gmail.com");
		
		//Using Web element for Drop down Elements
		WebElement dropdown = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select Val=new Select(dropdown);
		Val.selectByVisibleText("New York");
		
		driver.findElement(By.className("smallSubmit")).click();  //created lead
		driver.findElement(By.linkText("Edit")).click(); //Edit Lead
		
		//Cleared the existing description 
		WebElement user = driver.findElement(By.name("description"));
		user.sendKeys("Automation Tester");
		user.clear();
		user.sendKeys("Emerging Tester");
		
		//Updated the Lead
		driver.findElement(By.name("importantNote")).sendKeys("Creative Tester");
		driver.findElement(By.className("smallSubmit")).click();
		
		//Prints the title of web page
		String title = driver.getTitle();
		System.out.println("Title of the  WebPage is :" + title);
		
		Thread.sleep(10000);
		driver.close();
		
	
	}

}

