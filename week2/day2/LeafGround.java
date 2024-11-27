package assignments.week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LeafGround
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/button.xhtml");	
		driver.manage().window().maximize();
		
		//Confirm if the button is disabled
		WebElement button = driver.findElement(By.xpath("(//div[@class='card']/h5)[2]"));
		System.out.println("Confirming that the button is disabled:"+ button.isEnabled());
		
		
		//Printing the text & position of the button 
		WebElement text = driver.findElement(By.xpath("(//span[@class = 'ui-button-text ui-c'])[3]"));
		System.out.println("The Text of the button is:" + text.getText());
		System.out.println("The Location of the button is:" + text.getLocation());
		
		//Printing the text & background color of the button 
		WebElement user = driver.findElement(By.xpath("(//span[@class = 'ui-button-text ui-c'])[4]"));
		System.out.println("The Text of the background color button is:" + user.getText());
		System.out.println("The color of the background color button is:"+ user.getCssValue("background-color"));
		
		
		//Printing the text,width,& height of the button
		WebElement bg = driver.findElement(By.xpath("(//span[text()='Submit'])[2]"));
		System.out.println("The Text of the  button is:" + bg.getText());
		System.out.println("The width of the button is:"+ bg.getCssValue("width"));
		System.out.println("The height of the button is:"+ bg.getCssValue("height"));
		
		
		//Click on the button with the text ‘Click and Confirm title.’
		//Verifying that the title of the page is ‘dash board.’

		driver.findElement(By.xpath("//span[text()='Click']")).click();
		String title = driver.getTitle();
		System.out.println("Title of the  WebPage is :" + title);
		
		Thread.sleep(10000);
		//Closing the Window
		driver.close();   
		
	}

}

