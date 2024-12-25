package assignments.week7.day2.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.PSM;

public class Map extends PSM
{

		//Initiating the driver
		public Map (ChromeDriver driver) 
		{
			this.driver=driver;
		}
		
		public CA clickOnCreate() 
		{
			//click create account
			driver.findElement(By.linkText("Create Account")).click();
			return new CA (driver);
			
		}
}
