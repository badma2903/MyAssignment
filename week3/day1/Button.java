package assignments.week3.day1;

//Inherits the WebElement class using extends 
public class Button extends WebElement
{
	// creating method
	public void  Submit()
	{
		//Print the msg
		System.out.println("Submit the Button");
		
	
	}
	public static void main(String[] args) 
	{
		//creating object for the cls 
		Button bt = new Button();
		bt.click("ok");
		bt.setText("Successful");
		bt.Submit();
		
	}
	
	
}
