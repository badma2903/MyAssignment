package assignments.week7.day2.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;

public class MyHomePage extends ProjectSpecificMethod
{
	public MyHomePage(ChromeDriver driver)
	{
		this.driver = driver;
	}
	
	
	public void clickOnLeads()
	{
		//driver.findElement(By.linkText("Leads")).click();
	}
	
	public MyAccountPage clickOnAccounts()
	{
		//click the accounts tab
		driver.findElement(By.linkText("Accounts")).click();
		return new MyAccountPage(driver);
	}
	
	public void clickOnCases()
	{
		
	}

}
