package Marathon;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class Pvr 

{

	public static void main(String[] args) 
	{
		
		//Instantiate the browser & get the URL
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.pvrcinemas.com/");	
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Selecting Location 

		driver.findElement(By.xpath("(//span[@class = 'cities-placed'])[2]")).click();
		
		driver.findElement(By.xpath("//h6[text()='Hyderabad']")).click();
		
		//Choosing Cinema fileds
		driver.findElement(By.xpath("//span[text()='Cinema']")).click();
		
		driver.findElement(By.xpath("//span[text()='Select Cinema']")).click();
		
		driver.findElement(By.xpath("//span[contains (text( ),'Banjara Hills Hyderabad')]")).click();
		
		driver.findElement(By.xpath("//span[contains(text(),'Tomor')]")).click();
		
		driver.findElement(By.xpath("(//span[text()='LUCKY BASKHAR'])[2]")).click();
		
		driver.findElement(By.xpath("//span[text()='11:35 AM']")).click();
		
		//Book the the ticket
		
		driver.findElement(By.xpath("(//span[text()='Book'])[4]")).click();
		
		//Accepting Terms & conditions
		
		driver.findElement(By.xpath("//button[text()='Accept']")).click();
		
		//Selecting Seats & proceeding further
		
		driver.findElement(By.xpath("(//span[text()='19'])[3]")).click();
		
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		
		//Summary of the Information
		
		 String msg = driver.findElement(By.xpath("//h3[text()='Booking Summary']")).getText();
		 System.out.println("The Message is:" + msg);
		 
		 
		 String num = driver.findElement(By.xpath("//div[@class='seat-info']")).getText();
		 System.out.println("Ticket Info:" + num);
		 
		 //Total Amount Information
		 String total = driver.findElement(By.xpath("//div[@class='grand-tota col-md-3']")).getText();
		 System.out.println("Grand Total is:" + total);
	
		 
		 driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		 
		 //close the pop up
		 driver.findElement(By.xpath("(//i[@class='pi pi-times'])[2]")).click();
		
		 //Prints the title of the webpage
		 String title = driver.getTitle();
		 System.out.println("Title of the  WebPage is :" + title);	
		
		 driver.close();
	}

}


