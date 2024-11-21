package assignments.week2.day1;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateFBLogin 
{
	public static void main(String[] args) 
	{
		//Instantiate the Browser driver
		ChromeDriver driver = new ChromeDriver();
		
		//Loading the URL & maximizing
		driver.get(" https://www.facebook.com");	
		driver.manage().window().maximize();
		
		//Logging in by existing credentials
		driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Tuna@321");
		driver.findElement(By.name("login")).click();
		driver.findElement(By.partialLinkText ("log in")).click();
		
		//Getting title of the current Page
		String title = driver.getTitle();
		System.out.println("Title of the Current WebPage is :" + title);
		driver.close();	
		
		
	}
}


