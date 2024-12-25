package assignments.week7.day1.page;

import org.openqa.selenium.By;

import base.ProjectSpecificMethod;
import io.cucumber.java.en.When;

public class MyAccountPage extends ProjectSpecificMethod
{
	@When("Click Create Account")
	public CreateAccount clickOnCreate() 
	{
		//click on create account
		getDriver().findElement(By.linkText(pro.getProperty("myaccount.create"))).click();
		return new CreateAccount();
}
}
