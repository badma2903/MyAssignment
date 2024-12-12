package assignments.week5.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestCase2 extends ProjectSpecificMethod 
{
	@Test
	public  void second() 
	{
		
		//enter the company name
		driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys("TestLeaf");
		//enter the description
		driver.findElement(By.xpath("(//textarea[@class='slds-textarea'])[2]")).sendKeys("Salesforces");
		//select the status
		WebElement dropDown = driver.findElement(By.xpath("//button[contains(@class,'slds-combobox__i')]"));
		Actions act = new Actions(driver);
		act.scrollToElement(dropDown);
		driver.executeScript("arguments[0].click();", dropDown);
		//click the save button
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		//verify the alert message
		String text = driver.findElement(By.xpath("//h2[contains(@class,'slds-truncate')]")).getText();
		String msg = driver.findElement(By.xpath("(//div[@class='slds-popover__body'])[2]")).getText();
		System.out.println(text);	
		System.out.println(msg);	
		
		if (text.contains("snag"))
		{
			System.out.println("Verified");
		}else
		{
			System.out.println("Not Verified");
		}	
		
		
	}

}
