package assignments.week7.day2.pages;

import org.openqa.selenium.chrome.ChromeDriver;

import base.PSM;

public class VA extends PSM
{

		//Initiating the driver
		public VA (ChromeDriver driver) 
		{
			this.driver=driver;
		}
		
		public VA verifyTittle()
		{
			//Verify title
			String title = driver.getTitle();
			  System.out.println(title);
			 if (title.contains("Create"))
			 {
			  System.out.println("Title is Verified");
				
			}else 
			{ 
				System.out.println("Title is not Verified");
			}
			 return this;
		}
}
