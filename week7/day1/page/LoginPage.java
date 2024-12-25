package assignments.week7.day1.page;

import org.openqa.selenium.By;

import base.ProjectSpecificMethod;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class LoginPage extends ProjectSpecificMethod
{

	@When("Enter the username")
	public LoginPage enterUserName()
	{
		//Enter the Username
		getDriver().findElement(By.id("username")).sendKeys(pro.getProperty("username"));
		return this;
		
	}
	
	@And("Enter the password")
	public LoginPage enterPassWord()
	{
		//Enter the Password
		getDriver().findElement(By.id("password")).sendKeys(pro.getProperty("password"));
		return this;
		
	}
	
	@And("Click on Login Button")
	public HomePage clickOnLoginButton()
	{
		//Click on Login Button
		getDriver().findElement(By.className("decorativeSubmit")).click();
		return new HomePage();  //it navigate to next page constructor  
		//syntax: use return new
		
	}	

}
