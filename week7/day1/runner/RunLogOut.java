package assignments.week7.day1.runner;

import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;

public class RunLogOut extends ProjectSpecificMethod
{
	
	
	@Test
	public void runloginData()
	{
		LoginPage lp = new LoginPage();
		lp.enterUserName()
		.enterPassWord()
		.clickOnLoginButton()
		.clickOnCrmsfa()
		.clickOnAccounts()
		.clickOnCreate()
		.accountName()
		.description()
		.clickAccountButton();
		
		
		
		
	}

}
