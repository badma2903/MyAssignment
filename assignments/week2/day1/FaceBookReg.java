package assignments.week2.day1;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBookReg
{

	public static void main(String[] args)
	{
		//Instantiate the browser
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");	
		driver.manage().window().maximize();
		
		//Using Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Creating new account by basic locators
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Priya");
		driver.findElement(By.name("lastname")).sendKeys("G");
		driver.findElement(By.name("reg_email__")).sendKeys("shazainbadma18@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("Shazain@123");
		
		//Using WebElement to handle the Drop down 
		WebElement dropDown = driver.findElement(By.id("day"));
		Select day = new Select(dropDown);
		day.selectByValue("29");
		
		
		WebElement handle = driver.findElement(By.id("month"));
		Select month = new Select(handle);
		month.selectByIndex(2);
		
		
		WebElement Dd = driver.findElement(By.id("year"));
		Select year = new Select(Dd);
		year.selectByVisibleText("2000");
		
		//Selecting the radio button using Xpath
		driver.findElement(By.xpath("(//input[@value='1'])[1]")).click();
	
	
	}

}



