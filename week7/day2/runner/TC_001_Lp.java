package assignments.week7.day2.runner;

import org.testng.annotations.Test;

import base.PSM;
import pages.Lp;

public class TC_001_Lp extends PSM
{
	@Test
	public void login()
	{
	
		Lp login = new Lp(driver);
		login.userName()
		.passWord()
		.loginButton();
	}

}
