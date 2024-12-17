package assignments.week6.day2.stepdefn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import base.ProjectSpecificMethod;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EditSd extends ProjectSpecificMethod
{
	@When("Click on the Crmsfa Link")
	public void click_on_the_crmsfa_link()
	{
		//click on crmsfa link
		 driver.findElement(By.linkText("CRM/SFA")).click();
	}
	@When("Click the Account Tab")
	public void click_the_account_tab() 
	{
		//click the accounts tab
		driver.findElement(By.linkText("Accounts")).click(); 
	   
	}
	@When("Click the Find accounts")
	public void click_the_find_accounts()
	{
		//click the find accounts 
		driver.findElement(By.linkText("Find Accounts")).click(); 
		
	}
	@When("Enter the Account Id as {string}")
	public void enter_the_account_id_as(String id) 
	{
		//Enter the account id
		driver.findElement(By.name("id")).sendKeys(id);
		
	    
	}
	@When("Click the Find accounts button")
	public void click_the_find_accounts_button() throws InterruptedException 
	{
		//click the find accounts button
		driver.findElement(By.xpath("//button[text()='Find Accounts']")).click();
		Thread.sleep(3000);
		//click the first link
		driver.findElement(By.xpath("(//a[@class='linktext'])[6]")).click();
		Thread.sleep(3000);
	    
	}
	@When("Click the edit button")
	public void click_the_edit_button()
	{
		//click the edit button
		driver.findElement(By.linkText("Edit")).click();
		//select the ownership 
		WebElement drop = driver.findElement(By.name("ownershipEnumId"));
		Select option=new Select(drop);
		option.selectByVisibleText("S-Corporation");
		
	}
	@When("Click the save button")
	public void click_the_save_button()
	{
		//click save button
		driver.findElement(By.className("smallSubmit")).click();
	    
	}
	@Then("verify the account Name")
	public void verify_the_account_name() 
	{
		//verify the account name
		String txt = driver.findElement(By.xpath("(//span[@class='tabletext'])[3]")).getText();
		System.out.println("Account name is:"+txt);

	}


}
