package assignments.week5.day2;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DynamicParameterization extends ProjectSpecificMethod
{
	//Create a method to hold the test data in a 2D String array
	@DataProvider(name = "getData")
	public String[][] fetchData() throws IOException 
	{
		//read the values from excel class
		return Dynamic.readvalue();
	}
	
	
	@Test(dataProvider = "getData")
	public void dynamic(String name, String cname ) throws InterruptedException
	{
	
		
		//enter the name
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys(name);
		//enter the company name
		driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys(cname);
		//enter the description
		driver.findElement(By.xpath("(//textarea[@class='slds-textarea'])[2]")).sendKeys("Salesforces");
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
