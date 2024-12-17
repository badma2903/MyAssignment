package assignments.week6.day2.stepdefn;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StaticSd 
{
	public ChromeDriver driver;

	@Given("Launch the new browser and Load the Url")
	public void launch_the_browser_and_load_the_url()
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
				driver.get("https://login.salesforce.com/");
				//enter the username
				driver.findElement(By.id("username")).sendKeys("dilip@testleaf.com");
				//enter the password
				driver.findElement(By.id("password")).sendKeys("leaf@2024");
				//click the login button
				driver.findElement(By.id("Login")).click();
	    
	}
	
	@When("Click the App Launcher Icon next to Setup")
	public void click_the_app_launcher_icon_next_to_setup() 
	{
		//click the toggle button
		driver.findElement(By.xpath("//div[@class = 'slds-icon-waffle']")).click();
	    
	}
	
	@When("Click view All and Select Accounts from App Launcher")
	public void click_view_all_and_select_accounts_from_app_launcher() throws InterruptedException 
	{
		//Click View All  
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		
		//select account from App Launcher
		WebElement js =driver.findElement(By.xpath("//p[text()='Accounts']"));
		Actions object = new Actions(driver);
		object.scrollToElement(js).perform();
		Thread.sleep(5000);
		driver.executeScript("arguments[0].click();", js);
	  
	}
	
	@When("Search a account using your unique account name")
	public void search_a_account_using_your_unique_account_name() throws InterruptedException 
	{
		//search the account from the list
		driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("BadmaPriya",Keys.ENTER);
		Thread.sleep(3000);
		//Click the first result 
		driver.findElement(By.xpath("//a[contains(@class,'outputLookupLink')]")).click();
		
	}
	
	@When("Click the dropdown icon and select Edit")
	public void click_the_dropdown_icon_and_select_edit() throws InterruptedException
	{
		//Click the dropdown icon
		driver.findElement(By.xpath("(//button[contains(@class,'slds-button_last')])[2]")).click();
		//select edit
		WebElement edit =driver.findElement(By.xpath("//span[text()='Edit']"));
		driver.executeScript("arguments[0].click();", edit);
		Thread.sleep(3000);
	   
	}
	
	@When("Set Type to Technology Partner")
	public void set_type_to_technology_partner() 
	{
		
		//select a type
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement dropDown = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[contains(@class,'slds-input_faux')])[2]")));
		driver.executeScript("arguments[0].click();", dropDown);
		
		
		//set type as technology partner
		WebElement type =driver.findElement(By.xpath("(//span[text()='Technology Partner'])[1]"));
		driver.executeScript("arguments[0].click();", type);
		
	}
	
	@When("Set Industry to Healthcare")                   
	public void set_industry_to_healthcare() 
	{
		
		//select a industry
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement set = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[contains(@class,'slds-input_faux')])[4]")));
		driver.executeScript("arguments[0].click();", set);
		//set industry to healthcare
		WebElement ind = driver.findElement(By.xpath("(//span[text()='Healthcare'])[1]"));
		driver.executeScript("arguments[0].click();", ind);
	   
	}
	@When("Enter the Billing Address {string}")
	public void enter_the_billing_address(String cityName) 
	{
		//enter the billing address
		WebElement add =driver.findElement(By.xpath("(//textarea[@class='slds-textarea'])[1]"));
		Actions object = new Actions(driver);
		object.scrollToElement(add).perform();
		add.sendKeys(cityName);
	}
	
	@When("Enter the Shipping Address {string}")
	public void enter_the_shipping_address(String cName)
	{
	   //enter the shipping address
		WebElement sh =driver.findElement(By.xpath("(//textarea[@class='slds-textarea'])[2]"));
		sh.sendKeys(cName);
		
	}
	
	@When("Set Customer Priority to Low")
	public void set_customer_priority_to_low() 
	{
		//select customer priority 
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement cp = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[contains(@class,'slds-input_faux')])[5]")));
		driver.executeScript("arguments[0].click();", cp);
		//set priority as low
		WebElement low =driver.findElement(By.xpath("(//span[text()='Low'])[1]"));
		driver.executeScript("arguments[0].click();",low);
	}
	
	@When("Set SLA to Silver")
	public void set_sla_to_silver() 
	{
		//select a SLA
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement sla = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[contains(@class,'slds-input_faux')])[6]")));
		driver.executeScript("arguments[0].click();", sla);
		//set SLA as silver
		WebElement var =driver.findElement(By.xpath("(//span[text()='Silver'])[1]"));
		driver.executeScript("arguments[0].click();",var);
		
	  
	}
	
	@When("Set Active to NO")
	public void set_active_to_no() 
	{
		//select active 
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement act = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[contains(@class,'slds-input_faux')])[8]")));
		driver.executeScript("arguments[0].click();", act);
		//set active as no
		WebElement no =driver.findElement(By.xpath("(//span[text()='No'])[1]"));
		driver.executeScript("arguments[0].click();",no);
		
	   
	}
	
	@When("Enter a unique number in the Phone field {string}")
	public void enter_a_unique_number_in_the_phone_field(String str)
	{
		//enter a phone number
		WebElement ph =driver.findElement(By.xpath("//input[@name='Phone']"));
		ph.sendKeys(str);
	   
	}
	
	@When("Set Upsell Opportunity to No")
	public void set_upsell_opportunity_to_no() 
	{
		//select Upsell
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement up = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[contains(@class,'slds-input_faux')])[7]")));
		driver.executeScript("arguments[0].click();", up);
		//set as no
		WebElement opp =driver.findElement(By.xpath("(//span[text()='No'])[1]"));
		driver.executeScript("arguments[0].click();",opp);
	   
	}
	
	@Then("Click Save and verify the phone number")
	public void click_save_and_verify_the_phone_number() 
	{
		//verify the phone number
			driver.findElement(By.xpath("//button[text()='Save']")).click();
			String msg = driver.findElement(By.xpath("//a[text()='9577824509']")).getText();	
			System.out.println(msg);	
			
			if (msg.contains("9577"))
			{
				System.out.println("Verified");
			}else
			{
				System.out.println("Not Verified");
			}	
		
	   
	}

}
