package assignments.week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingleFrame
{
	public static void main(String[] args) throws InterruptedException 
	{
		//Initializing the chrome
		ChromeDriver driver = new ChromeDriver();
		//maximing the page
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		//get the url
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		//first frame
		driver.switchTo().frame("iframeResult");
		//sec frame
		driver.findElement(By.xpath("//button [text( ) ='Try it']")).click();
		Thread.sleep(30);
		//Switch to alert
		Alert msg = driver.switchTo().alert();
		//Print the alert msg
		System.out.println(msg.getText());
		msg.sendKeys("Priya");
		msg.accept();
		//Verifying the msg 
				String text = driver.findElement(By.id("demo")).getText();
				System.out.println(text);		
				if (text.contains("Hello Priya! How are you today?"))
				{
					System.out.println("Matched");
				}else
				{
					System.out.println(" Not matched");
				}	

	}

}
