package assignments.week7.day2.runner;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;

public class RunLoginPage extends ProjectSpecificMethod
{
	@BeforeTest
	public void setValue()
	{
		data="CreateLead24";
	}
	
	
	@Test(dataProvider="getData")
	public void runloginData(String uname, String passWord, String accname, String desc, String site, String count)
	{
		LoginPage lp = new LoginPage(driver);
		lp.enterUserName(uname)
		.enterPassWord(passWord)
		.clickOnLoginButton()
		.clickOnCrmsfa()
		.clickOnAccounts()
		.clickOnCreate()
		.accountName(accname)
		.description(desc)
		.siteName(site)
		.noofEmp(count)
		.clickCreate();
	}

}
