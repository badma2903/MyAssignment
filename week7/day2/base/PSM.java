package assignments.week7.day2.base;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class PSM 
{
		//Declaring a driver as global
		public ChromeDriver driver;

		@BeforeMethod
		public void preCondition() 
		{
				//Initialize the Driver
				 driver = new ChromeDriver();
					
					//Maximize the window
					driver.manage().window().maximize();
					
					//Load the URL
					driver.get("http://leaftaps.com/opentaps/.");
					driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		}
		
		@AfterMethod			
		public void postCondition() 
		{
			//close the window
			driver.close();
		}
	
}
