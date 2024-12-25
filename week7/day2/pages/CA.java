package assignments.week7.day2.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.PSM;

public class CA extends PSM
{
		//Initiating the driver
		public CA (ChromeDriver driver) 
		{
			this.driver=driver;
			
		}
		
		public CA accountName()
		{
			//Enter account name
			driver.findElement(By.id("accountName")).sendKeys("Sharath");
			return this;
		}
		
		public CA description() 
		{
			//Enter description
		    driver.findElement(By.name("description")).sendKeys("Automation Tester");
		    return this;
		}
		
		public CA siteName() 
		{
			//Enter Site Name 
			driver.findElement(By.id("officeSiteName")).sendKeys("TestLeaf");
			return this;
		}
		
		public CA countOfEmployees() 
		{
			//Enter a Number Of Employees
			driver.findElement(By.id("numberEmployees")).sendKeys("30");
			return this;
		}
		
		public VA createAccountButton() 
		{
			//Click submit button
			driver.findElement(By.className("smallSubmit")).click();
			return new VA (driver);
			
		}
		
		
		
	
}
