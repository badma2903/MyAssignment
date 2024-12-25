package assignments.week7.day1.page;

import org.openqa.selenium.By;

import base.ProjectSpecificMethod;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateAccount extends ProjectSpecificMethod
{
	@When("Enter the AccountName")
	public CreateAccount accountName() 
	{
		//Enter account name
		getDriver().findElement(By.id("firstNameField")).sendKeys(pro.getProperty("account.name"));
		return this;
	}
	
	@When("Enter the description")
	public CreateAccount description() 
	{
		//Enter desc as  Automation Tester
		getDriver().findElement(By.name("description")).sendKeys(pro.getProperty("account.desc"));
	    return this;
	}
	
	
	@Then("Click on AccountSubmitButton")
	public CreateAccount clickAccountButton() 
	{
		//Click Create button.
		getDriver().findElement(By.className("smallSubmit")).click();
		return this;
	}
	
	
	
	
	

	
	
}
