package assignments.week7.day1.page;

import org.openqa.selenium.By;

import base.ProjectSpecificMethod;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLead extends ProjectSpecificMethod
{
	
	@When("Enter the CompanyName")
	public CreateLead companyName()
	{
		//Enter the CompanyName
		getDriver().findElement(By.id("createLeadForm_companyName")).sendKeys(pro.getProperty("lead.company"));
		return this;
	}
	
	@When("Enter the FirstName")
	public CreateLead firstName() 
	{
		//Enter the FirstName
		getDriver().findElement(By.id("createLeadForm_firstName")).sendKeys(pro.getProperty("lead.fname"));
		return this;
	}
	
	@When("Enter the LastName")
	public CreateLead lastName() 
	{
		//Enter the LastName
		getDriver().findElement(By.id("createLeadForm_lastName")).sendKeys(pro.getProperty("lead.lname"));
		return this;
	}
	
	
	@Then("Click on leadSubmitButton")
	public CreateLead submit() 
	{
		//Click on submit button
		getDriver().findElement(By.name("submitButton")).click();
		return this;
	}
	
}


