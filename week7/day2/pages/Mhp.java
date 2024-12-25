package assignments.week7.day2.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.PSM;

public class Mhp extends PSM
{
		//Initiating the driver
		public Mhp ( ChromeDriver driver) 
		{
			this.driver=driver;
		}
		
		public Map accountClick() 
		{
			//click on accounts tab
			driver.findElement(By.linkText("Accounts")).click();
			return new Map(driver);
		}

}
