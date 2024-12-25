package assignments.week7.day2.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.PSM;

public class Wp extends PSM
{

		//Initiating the driver
		public Wp (ChromeDriver driver) 
		{
			this.driver=driver;
		}
		
		public Mhp clickOnCrmsfa() 
		{
			//click on CRMSFA
			driver.findElement(By.linkText("CRM/SFA")).click();
			return new Mhp (driver);
					
		}
		
		public LoginPage logoutButton() 
		{
			//Click on logout button
			driver.findElement(By.className("decorativeSubmit")).click();
			return new LoginPage(driver);
		}

}
