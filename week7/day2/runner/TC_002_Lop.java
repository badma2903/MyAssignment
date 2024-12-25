package assignments.week7.day2.runner;

import org.testng.annotations.Test;

import base.PSM;
import pages.Lp;

public class TC_002_Lop extends PSM
{
	@Test
	public void logOut()
	{
		Lp logout = new Lp(driver);
		logout.userName()
		.passWord()
		.loginButton()
		.logoutButton();
	}
}
