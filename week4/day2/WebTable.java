package assignments.week4.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WebTable 
{
   public static void main(String[] args) throws InterruptedException 
   {
	
	 //Initializing the chrome driver
	   ChromeDriver driver = new ChromeDriver();
	  //Maximizing the window
		driver.manage().window().maximize();
	    //implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Load the URL
		 driver.get("https://finance.yahoo.com/"); 
		 //using actions mousehover
		 WebElement mouseOver = driver.findElement(By.xpath("//span[text()='More']"));	
			//object for actions
			Actions builder = new Actions(driver);
			builder.moveToElement(mouseOver).perform();
			//scroll the element to crypto and click
			WebElement val = driver.findElement(By.linkText("Crypto"));
			Actions object = new Actions(driver);
			object.scrollToElement(val).perform();
			Thread.sleep(5000);
			val.click();
			//Locate the cryptocurrency names in the table using specific row 
            List<WebElement> rows = driver.findElements(By.xpath("//table[contains(@class,'markets-table')]/tbody/tr"));
            int rowCount = rows.size();
    		System.out.println("Total No.of rows:"+rowCount);
    		////Locate the cryptocurrency names in the table using specific column
    		 List<WebElement> column = driver.findElements(By.xpath("//table[contains(@class,'markets-table')]/thead/tr/th"));
             int colCount = column.size();
     		 System.out.println("No.of columns:"+colCount);
     		 //print the names of cryptocurrencies
     		 System.out.println("Names of cryptoCurrencies are:");
     		 //Use loop to iterate the cryptocurrency names
     		 for (int i = 1; i <= rowCount ; i++) 
     		 {
              String cryptoName = driver.findElement(By.xpath("//table[contains(@class,'markets-table')]/tbody/tr["+i+"]/td[2]")).getText();  
              System.out.println(cryptoName);
                
            }
     		
			
           
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
   }	

}
