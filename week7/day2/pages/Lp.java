package assignments.week7.day2.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.PSM;

public class Lp extends PSM
{

		//Initiating the driver
		public Lp (ChromeDriver driver) 
		{
			this.driver=driver;
		}

		public Lp userName() 
		{
			//Enter the UserName
			driver.findElement(By.id("username")).sendKeys("Democsr");
			return this;
		}
		
		public Lp passWord() 
		{
			//Enter the Password
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			return this;
		}
		
		public Wp loginButton() 
		{
			//Click the login button
			driver.findElement(By.className("decorativeSubmit")).click();
			return new Wp(driver);
		}
}
