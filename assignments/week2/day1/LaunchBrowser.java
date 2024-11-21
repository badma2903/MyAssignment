package assignments.week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser 
{

	public static void main(String[] args) throws InterruptedException
	{
		//Initializing the browser 
		ChromeDriver driver = new ChromeDriver();
		
		//Getting the FB page
		driver.get(" https://www.facebook.com");	
		
		// Maximizing and 2 mins of wait it close
		driver.manage().window().maximize();
		Thread.sleep(20000);
		driver.close();
	}

}
