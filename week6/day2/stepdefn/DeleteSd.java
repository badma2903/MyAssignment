package assignments.week6.day2.stepdefn;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import base.ProjectSpecificMethod;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DeleteSd extends ProjectSpecificMethod
{
	@When("Click on the crmsfa Link")
	public void click_on_the_crmsfa_link() 
	{
		//click on crmsfa link
		 driver.findElement(By.linkText("CRM/SFA")).click();

	}
	@When("Click the account Tab")
	public void click_the_account_tab() 
	{
		//click the accounts tab
		driver.findElement(By.linkText("Accounts")).click(); 
	}
	@When("Click the find accounts")
	public void click_the_find_accounts() 
	{
		//click the find accounts 
		driver.findElement(By.linkText("Find Accounts")).click();
	}
	@When("Enter the account Id as {string}")
	public void enter_the_account_id_as(String Id) 
	{
		//Enter the account id
		driver.findElement(By.name("id")).sendKeys(Id);

	}
	@When("Click the Find accounts Button")
	public void click_the_find_accounts_button() throws InterruptedException
	{
		//click the find accounts button
		driver.findElement(By.xpath("//button[text()='Find Accounts']")).click();
		Thread.sleep(3000);
		//click the first link
		driver.findElement(By.xpath("(//a[@class='linktext'])[6]")).click();
		Thread.sleep(3000);
	}
	@When("Click the deactivate button")
	public void click_the_deactivate_button() 
	{
		//click the deactivate button
		driver.findElement(By.linkText("Deactivate Account")).click();
		//Switching to alert
		Alert varName = driver.switchTo().alert();
		varName.accept();
				
	}
	@Then("Print the message")
	public void print_the_message() 
	{
	    //prints the msg
		String msg= driver.findElement(By.className("subSectionWarning")).getText();
		System.out.println(msg);
	}


}
