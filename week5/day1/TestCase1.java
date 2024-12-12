package assignments.week5.day1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestCase1 extends ProjectSpecificMethod
{
	@Test
	public void first() 
	{
		//enter the name
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Salesforce Automation by Priya");
		//click save button
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		//verify the message
		String text = driver.findElement(By.xpath("(//lightning-formatted-text [@slot='outputField'])[1]")).getText();
		System.out.println(text);		
		if (text.contains("Priya"))
		{
			System.out.println("Successfully Verified");
		}else
		{
			System.out.println("Not Verified");
		}			
		
	}

}
