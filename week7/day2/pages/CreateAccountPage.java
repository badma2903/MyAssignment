package assignments.week7.day2.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;

public class CreateAccountPage extends ProjectSpecificMethod
{

	public CreateAccountPage(ChromeDriver driver)
	{
		this.driver = driver;
	}
	
	public CreateAccountPage accountName(String AccName)
	{
		driver.findElement(By.id("accountName")).sendKeys(AccName);
		return this;
	}
	
	public CreateAccountPage description(String desc)
	{
		driver.findElement(By.name("description")).sendKeys(desc);
		return this;
	}
	
	public CreateAccountPage noofEmp(String count)
	{
		driver.findElement(By.id("numberEmployees")).sendKeys(count);
		return this;
	}
	
	public CreateAccountPage siteName(String site)
	{
		driver.findElement(By.id("officeSiteName")).sendKeys(site);
		return this;
	}
	
	public CreateAccountPage clickCreate()
	{
		driver.findElement(By.className("smallSubmit")).click();
		return this;
	}
	
	
	
	
	
	

}
