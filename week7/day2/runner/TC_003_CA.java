package assignments.week7.day2.runner;

import org.testng.annotations.Test;

import base.PSM;
import pages.Lp;

public class TC_003_CA extends PSM
{
	
		@Test()
		public void createAccount() 
		{
			
			Lp create = new Lp(driver);
			create.userName()
			.passWord()
			.loginButton()
			.clickOnCrmsfa()
			.accountClick()
			.clickOnCreate()
			.accountName()
			.description()
			.siteName()
			.countOfEmployees()
			.createAccountButton()
			.verifyTittle();
			
		}
		
}
