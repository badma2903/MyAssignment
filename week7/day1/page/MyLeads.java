package assignments.week7.day1.page;

import org.openqa.selenium.By;

import base.ProjectSpecificMethod;
import io.cucumber.java.en.When;

public class MyLeads extends ProjectSpecificMethod
{
	@When("Click create lead")
	public CreateLead clickcreateLead()
	{
		//click the create lead
		getDriver().findElement(By.linkText(pro.getProperty("myleads.create"))).click();
		return new CreateLead();
	}

	
}
