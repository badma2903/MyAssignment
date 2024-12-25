package assignments.week7.day1.page;

import org.openqa.selenium.By;

import base.ProjectSpecificMethod;
import io.cucumber.java.en.When;

public class MyHomePage extends ProjectSpecificMethod
{
	
	@When("Click on leads tab")
	public MyLeads clickOnLeads()
	{
		//Click the Leads
		getDriver().findElement(By.linkText(pro.getProperty("myhomepage.leads"))).click();
		return new MyLeads();
	}
	
	@When("Click on account tab")
	public MyAccountPage clickOnAccounts()
	{
			//click on Account
			getDriver().findElement(By.linkText(pro.getProperty("myhomepage.accounts"))).click();
			return new MyAccountPage();
	}
		
	
	
	public void clickOnCases()
	{
		
	}

}
