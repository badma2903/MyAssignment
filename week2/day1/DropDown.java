package assignments.week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.time.Duration;

public class DropDown 
{

	public static void main(String[] args) throws InterruptedException 
	{
		//Instantiating the browser & get the URL
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Log in by existing Credentials using locators
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//Create the new account
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("PriyaRajan");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		
		//Using WebElement to handle the dropdown
		WebElement dropDown = driver.findElement(By.name("industryEnumId"));
		Select opt=new Select(dropDown);
		opt.selectByIndex(2);
		
		WebElement drop = driver.findElement(By.name("ownershipEnumId"));
		Select option=new Select(drop);
		option.selectByVisibleText("S-Corporation");
		
		WebElement dropdown = driver.findElement(By.id("dataSourceId"));
		Select op=new Select(dropdown);
		op.selectByValue("LEAD_EMPLOYEE");
		
		WebElement down = driver.findElement(By.id("marketingCampaignId"));
		Select Value=new Select(down);
		Value.selectByIndex(5);
		
		WebElement dd = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select Val=new Select(dd);
		Val.selectByValue("TX");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		//Verifying the account name using .contains & Xpath
		String accname = driver.findElement(By.xpath("(//span[@class='tabletext'])[3]")).getText();
		System.out.println("The given account name is:"+accname);
		if (accname.contains("PriyaRajan"))
		{
			System.out.println("Account name is matched");
		}else
		{
			System.out.println("Account name is not matched");
		}	
		
	}
	
}


