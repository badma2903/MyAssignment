package assignments.week7.day2.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;

public class LoginPage extends ProjectSpecificMethod
{
	public LoginPage(ChromeDriver driver) //driver here is local variable we already created in psm
	{
		this.driver = driver;
	}
	
	
	public LoginPage enterUserName(String uname)
	{
		driver.findElement(By.id("username")).sendKeys(uname);
		return this;
		
	}
	public LoginPage enterPassWord(String pass)
	{
		driver.findElement(By.id("password")).sendKeys(pass);
		return this;
		
	}
	
	public HomePage clickOnLoginButton()
	{
		driver.findElement(By.className("decorativeSubmit")).click();
		return new HomePage(driver);  //it navigate to next page constructor  syntax: use return new
		
	}
	

}
