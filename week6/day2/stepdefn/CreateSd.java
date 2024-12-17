package assignments.week6.day2.stepdefn;

import org.openqa.selenium.By;

import base.ProjectSpecificMethod;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateSd extends ProjectSpecificMethod
{
	@When("Click on the Crmsfa link")
	public void click_on_the_crmsfa_link() 
	{
		//click on crmsfa link
		driver.findElement(By.linkText("CRM/SFA")).click();
	}
	@When("Click the Account tab")
	public void click_the_account_tab() 
	{
		//click the accounts tab
		driver.findElement(By.linkText("Accounts")).click(); 
	}
	@When("Click the Create Account button")
	public void click_the_create_account_button() 
	{
		//click on the create button
		driver.findElement(By.linkText("Create Account")).click();
	}
	@When("Enter the account name as {string}")
	public void enter_the_account_name_as(String name) 
	{
		//enter the name
		driver.findElement(By.id("accountName")).sendKeys(name);
	    
	}
	@When("Click the submit button")
	public void click_the_submit_button()
	{
		//click on the submit button
		driver.findElement(By.className("smallSubmit")).click();
	}
	
	@Then("Verify the account Name")
	public void verify_the_account_name() 
	{
		//verify the account name
		String txt = driver.findElement(By.xpath("(//span[@class='tabletext'])[3]")).getText();
		System.out.println("Account name is:"+txt);
	}
	
}

