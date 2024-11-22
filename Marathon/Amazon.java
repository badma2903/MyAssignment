package Marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon 

{

	public static void main(String[] args) 
	{
			//Instantiate the browser & get the URL
			ChromeDriver driver = new ChromeDriver();
		
			driver.get("https://www.amazon.in/");	
		
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			//Search the input
			
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags for boys");	
			
			driver.findElement(By.xpath("(//div[text()='bags for boys'])[1]")).click();
			
			//Prints the msg
			
			String msg = driver.findElement(By.xpath("//span[contains(text( ), 'results for')]")).getText();
			System.out.println("The Message is:"+msg+"bags for boys");
			
			
			//Filtering the results
			driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[1]")).click();
			driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[2]")).click();
			
			driver.findElement(By.xpath("(//span[contains(@class,'declarative')])[2]")).click();
			
			driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
			
			// Prints the name & discount 
			String name = driver.findElement(By.xpath("(//h2[@class = 'a-size-mini s-line-clamp-1']/span)[2]")).getText();
			System.out.println("The Name of the bag is:"+name);
			
			String off = driver.findElement(By.xpath("(//span[text()='(69% off)'])[1]")).getText();
			System.out.println("Discount for the bag is:"+off);
			
			
			//Prints the title of the Webpage
			 String title = driver.getTitle();
			 System.out.println("Title of the  WebPage is :" + title);
			 
			 driver.close();			
			
			
			
			
			
					
					
					
			
			
			
			
			
			
			
			
			
		
			
			

	}

}
