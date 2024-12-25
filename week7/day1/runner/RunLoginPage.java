package assignments.week7.day1.runner;

import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;

public class RunLoginPage extends ProjectSpecificMethod
{

	
	@Test
	public void runloginData()
	{
		LoginPage lp = new LoginPage();
		lp.enterUserName()
		.enterPassWord()
		.clickOnLoginButton()
		.clickOnCrmsfa()
		.clickOnLeads()
		.clickcreateLead()
		.companyName()
		.firstName()
		.lastName()
		.submit();
	}

}
