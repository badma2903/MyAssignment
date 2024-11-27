package assignments.week3.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajio
{

	public static void main(String[] args) throws InterruptedException 
	{  
		//Initializing the chrome driver
		ChromeDriver driver = new ChromeDriver();
		
		// maximizing the tab
		driver.manage().window().maximize();
		
		//Implicit wait of the page
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//get the ajio page 
		driver.get("https://www.ajio.com/");
		
		//Search the text
		driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("Bags",Keys.ENTER);
		
		
		//Filter the gender category
		 driver.findElement(By.xpath("(//label[contains(@class, 'linkname-Men')])[1]")).click();
		
		 Thread.sleep(5000); 
		 
		//click "Fashion Bags"
		driver.findElement(By.xpath("//label[contains(text(),'Fashion Bags')]")).click();
	
		
		//Print the count of the items found.
		String totalcount = driver.findElement(By.xpath("//div[@class='length']/strong")).getText();
		System.out.println("Total number of count is:" +totalcount);
		
		System.out.println();

		//Get the list of brand of the products displayed in the page and print the list.
		List<WebElement> brandname = driver.findElements(By.className("brand"));
		int list = brandname.size();
		System.out.println("List of the brands in the page are: "+ list);
		for (int i = 0; i < list; i++) 
		{
		System.out.println((i+1)+" "+ brandname.get(i).getText());
		}
		
		
		System.out.println();
		
		//Get the list of names of the bags and print it
		List<WebElement> bagnames = driver.findElements(By.className("nameCls"));
		int count = bagnames.size();
		System.out.println("Total list of the names of the bag are :"+ count);
		for (int i = 0; i<count ; i++) 
			{
				System.out.println((i+1)+" "+bagnames.get(i).getText());
			}
	}
}
