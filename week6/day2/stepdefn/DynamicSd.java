package assignments.week6.day2.stepdefn;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DynamicSd 
{
	public ChromeDriver driver;
	
	@Given("Launch the diff browser and Load the Url")
	public void launch_the_diff_browser_and_load_the_url() 
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
	@When("Click on the Toggle menu button from the left corner")
	public void click_on_the_toggle_menu_button_from_the_left_corner() 
	{
		//click the toggle button
		driver.findElement(By.xpath("//div[@class = 'slds-icon-waffle']")).click();
	    
	}
	@When("Click View All and click Sales from App Launcher")
	public void click_view_all_and_click_sales_from_app_launcher() 
	{
		//Click View All  
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		//click Sales from App Launcher
		WebElement js =driver.findElement(By.xpath("(//div[@class='slds-truncate'])[6]"));
		driver.executeScript("arguments[0].click();", js);
	    
	}
	@When("Click on Accounts Tab")
	public void click_on_accounts_tab() 
	{
		//click on the accounts tab
		WebElement script= driver.findElement(By.xpath("(//span[text()='Accounts'])[1]"));
		driver.executeScript("arguments[0].click();", script);
	   
	}
	@When("Click on New Button")
	public void click_on_new_button() throws InterruptedException 
	{
		//click on new button
		driver.findElement(By.xpath("//a[@title='New']")).click();
		Thread.sleep(3000);
	   
	}
	@When("Enter your Name as {string}")
	public void enter_your_name_as(String accNAme) throws InterruptedException 
	{
	    
		//enter the account name
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys(accNAme);
		Thread.sleep(5000);
	}
	@When("Select OwnerShip as Public")
	public void select_ownership_as_public() 
	{
		//select the owner ship as public
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement dropDown = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[contains(@class,'slds-combobox')])[4]")));
		driver.executeScript("arguments[0].click();", dropDown);

		// Wait for the "Public" option to be clickable and select it
		WebElement publicOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Public']")));
		driver.executeScript("arguments[0].click();", publicOption);
					
	   
	}
	@When("Click the Save Button")
	public void click_the_save_button() 
	{
		//click on save button
		driver.findElement(By.xpath("(//button[text()='Save'])[2]")).click();
	   
	}
	@Then("Verify the Account name")
	public void verify_the_account_name() 
	{
		//verify the account name
		String msg = driver.findElement(By.xpath("//lightning-formatted-text[@slot='primaryField']")).getText();	
		System.out.println(msg);	
				
				if (msg.contains("Kag"))
				{
					System.out.println("Verified");
				}
				else if(msg.contains("Shazain"))
				{
					System.out.println("Verified");
				}
				else if(msg.contains("Padma"))
				{
					System.out.println("Verified");
				}
				else
				{
					System.out.println("Not Verified");
				}
		
	}


}
