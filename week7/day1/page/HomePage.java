package assignments.week7.day1.page;

import org.openqa.selenium.By;

import base.ProjectSpecificMethod;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePage extends ProjectSpecificMethod
{
	
	@Then("Verify the title")
	public HomePage verifyTitle()
	{
		String title = getDriver().getTitle();
		if(title.contains("TestLeaf"))
		{
			System.out.println("Login is successful");
		}
		else
		{
			System.out.println("Login is not successful");
		}
		
		return this;
	
	}
	
	@When("Click on crmsfa")
	public MyHomePage clickOnCrmsfa()
	{
		//Click the crmsfa link
		getDriver().findElement(By.linkText("CRM/SFA")).click();
		return new MyHomePage();
		
	}
	
	public LoginPage clickOnLogout() 
	{
		getDriver().findElement(By.className("decorativeSubmit")).click();
		return new LoginPage();
		
	}

}
